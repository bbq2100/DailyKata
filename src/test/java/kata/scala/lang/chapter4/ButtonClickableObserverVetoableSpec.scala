package kata.scala.lang.chapter4
import org.specs2.mutable.Specification

object ButtonClickableObserverVetoableSpec extends Specification {
  "A Button Observer with Vetoable Clicks" should {
    "observer only the first button click" in {
      val observableButton = new SimpleButton("Okay") with ObservableClicks with VetoableClick // implementation (overriding) lookup from right to left
      val buttonClickCountObserver = new ButtonCountObserver
      observableButton.addObserver(buttonClickCountObserver)

      for (i <- 1 to 3) observableButton.click()
      buttonClickCountObserver.count mustEqual 1
    }
  }

}