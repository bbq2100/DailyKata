import java.util.Calendar

object Exceptions {

  val then = null
  val now = Calendar.getInstance()

  try {
    now.compareTo(then)
  } catch {
    case e: NullPointerException => println("NullPointer exception")
    case unknown: Throwable =>
  }

}