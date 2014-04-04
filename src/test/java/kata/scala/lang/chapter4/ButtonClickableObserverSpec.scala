package kata.scala.lang.chapter4
import org.specs2.mutable.Specification

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