package kata.scala.lang.chapter4

trait Clickable {
  def click()
}

class SimpleButton(val label: String) extends Widget with Clickable {
  def click() = {
    println("Button clicked")
  }
}

// abstract marks in a trait that there is no super implementation in the parent trait => calling super.click() on the concrete instance object
trait ObservableClicks extends Clickable with Subject {
  abstract override def click() = {
    super.click()
    notifyObservers
  }
}

trait VetoableClick extends ObservableClicks {
  val maxAllowed = 1
  private var count = 0

  abstract override def click() = {
    if (count < maxAllowed) {
      super.click()
      count += 1
    }
  }
}

