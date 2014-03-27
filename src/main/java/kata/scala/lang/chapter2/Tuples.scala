object Tuples {

  def tupleator(x1: Any, x2: Any, x3: Any) = (x1, x2, x3)

  val t = tupleator("Hallo", 4L, 3.3F)
  println(t)

  val (tupleElement1, tupleElement2, tupleElement3) = tupleator("HI", "Hello", "Goodbye")
  println(tupleElement2)
  
  def foo() = {
    val s = "HELLO"
    val i = 34
    (s,i)
  }
  
  println (foo._1, foo._2)
  
  println((1->2)->(3->4))
}