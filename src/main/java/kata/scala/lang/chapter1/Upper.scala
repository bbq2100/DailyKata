package kata.scala.lang.chapter1

object UpperApp extends App {
  println(Upper upper ("hAllo","WelT"))
}

object UpperBloated{
  def upper(strings:String*) : Seq[String] = {
    strings.map((s:String) => s.toUpperCase())
  }
}

object Upper{
  def upper(strings : String*) = strings.map(_.toUpperCase())
}