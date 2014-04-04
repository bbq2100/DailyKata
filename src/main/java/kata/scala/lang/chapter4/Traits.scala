package kata.scala.lang.chapter4

abstract class Widget

class ComplicatedButton(val label: String) extends Widget {
  def click() = {
    println("Button clicked")
  }
}

trait Subject {
  type Observer = { def receivedUpdate(subject: Any) }

  private var observers = List[Observer]()
  def addObserver(observer: Observer) = observers ::= observer
  def notifyObservers = observers foreach (_.receivedUpdate(this))
}

class ObservableButton(name: String) extends ComplicatedButton(name) with Subject {
  override def click() = {
    super.click()
    notifyObservers
  }
}

class ButtonCountObserver {
  var count = 0
  def receivedUpdate(subject: Any) = count += 1
}