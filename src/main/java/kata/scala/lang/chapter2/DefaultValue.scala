object StringUtil {
	def joiner(strings: List[String], seperator: String = " ") = strings.mkString(seperator)
	  
	  println(joiner(List("Programming","Scala"), seperator = " |-| "))
	  println(joiner(List("Programming","Scala")))
}