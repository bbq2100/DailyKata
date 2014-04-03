abstract class Widget

class Button(val label: String) extends Widget {
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

class ObservableButton(name: String) extends Button(name) with Subject {
  override def click() = {
    super.click()
    notifyObservers
  }
}

class ButtonCountObserver {
  var count = 0
  def receivedUpdate(subject: Any) = count += 1
}