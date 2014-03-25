object StringUtil {
  def joiner(strings: List[String], seperator: String = " ") = strings.mkString(seperator)

  println(joiner(List("Programming", "Scala"), seperator = " |-| "))
  println(joiner(List("Programming", "Scala")))
}

object OptionalUserProfileInfo {
  val UnknownLocation = ""
  val UnknownAge = -1
  val UnknownWebSite = ""
}

class OptionalUserProfileInfo(
  location: String = OptionalUserProfileInfo.UnknownLocation,
  age: Int = OptionalUserProfileInfo.UnknownAge,
  webSite: String = OptionalUserProfileInfo.UnknownWebSite)

object OptionalUserApp {
  println(new OptionalUserProfileInfo)
  println(new OptionalUserProfileInfo(age = 24))
  println(new OptionalUserProfileInfo(age = 24, location = "Darmstadt"))
}