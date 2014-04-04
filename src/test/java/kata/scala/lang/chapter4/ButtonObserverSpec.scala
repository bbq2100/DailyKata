
import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.matcher.MustMatchers
import org.junit.Test

object ButtonObserverSpec extends Specification {
  "A Button Observer" should {
    "observe button clicks" in {
      val observerableButton = new ObservableButton("Okay")
      val buttonObserver = new ButtonCountObserver
      observerableButton.addObserver(buttonObserver)
      
      for(i <- 1 to 3) observerableButton.click()
      buttonObserver.count mustEqual 3
    }
  }
}

object ButtonObserverTraitMixinSpec extends Specification{
  "A Button Observer" should {
    "observer button clicks" in {
      val observableButton = new Button("Okay") with Subject {  // mixin trait on fly: on object declaration
        override def click() = {
          super.click
          notifyObservers
        }
      }
      val buttonObserver = new ButtonCountObserver
      observableButton.addObserver(buttonObserver)
      
      for(i <- 1 to 3) observableButton.click()
      buttonObserver.count mustEqual 3
    }
  }
}
