package kata.scala.lang.chapter4

import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner
import org.specs2.mutable.Specification

@RunWith(classOf[JUnitRunner])
object ButtonObserverTraitMixinSpec extends Specification {
  "A Button Observer" should {
    "observer button clicks" in {
      val observableButton = new ComplicatedButton("Okay") with Subject { // mixin trait directly, on object declaration
        override def click() = {
          super.click
          notifyObservers
        }
      }
      val buttonObserver = new ButtonCountObserver
      observableButton.addObserver(buttonObserver)

      for (i <- 1 to 3) observableButton.click()
      buttonObserver.count mustEqual 3
    }
  }
}
