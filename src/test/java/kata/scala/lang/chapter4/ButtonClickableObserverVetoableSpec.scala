package kata.scala.lang.chapter4
import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
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