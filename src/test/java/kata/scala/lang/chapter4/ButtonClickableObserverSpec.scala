package kata.scala.lang.chapter4
import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
object ButtonClickableObserverSpec extends Specification {
  "A Button Observer" should {
    "observer button clicks" in {
      val observableButton = new SimpleButton("Okay") with ObservableClicks // composing declaratively behavior
      val buttonClickCountObserver = new ButtonCountObserver
      observableButton.addObserver(buttonClickCountObserver)

      for (i <- 1 to 3) observableButton.click
      buttonClickCountObserver.count mustEqual 3
    }
  }

}