trait AbstractSubject {
  type Observer

  private var observers = List[Observer]()
  def addObserver(observer: Observer) = observers ::= observer
  def notifyObserver = observers foreach (notify(_))

  def notify(observer: Observer): Unit
}

trait SubjectForReceiveUpdateObservers extends AbstractSubject {
  type Observer = { def receiveUpdate(subject: Any) }

  def notify(observer: Observer): Unit = observer.receiveUpdate(this)
}

trait SubjectForFunctionalObservers extends AbstractSubject {
  type Observer = (AbstractSubject) => Unit

  def notify(observer: Observer): Unit = observer(this)
}

object AbstractType {

}