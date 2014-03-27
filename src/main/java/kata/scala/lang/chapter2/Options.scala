object Options {
  val stateCapitals = Map(
    "Alabama" -> "Montgomery",
    "Alaska" -> "Juneau",
    "Wyoming" -> "Cheyenne")

  println(stateCapitals.get("Alabama"))
  println(stateCapitals.get("Houston"))

  println(stateCapitals.get("Alabama").get)
  println(stateCapitals.get("Houston").getOrElse("N/A (null)"))

  def foo(i: Int) = {
    if (i < 0) None
    else Some(i * i)
  }
  
  foo(4)
}