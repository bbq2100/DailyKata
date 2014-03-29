object PatternMatching {
	val bools = List(true,false,"Hehe")

  for (bool <- bools) {
    bool match {
      case true => println(bool + " Head")
      case false => println(bool + " Tails")
      case _ => println(bool + " Wat?")
    }
  }

	
}