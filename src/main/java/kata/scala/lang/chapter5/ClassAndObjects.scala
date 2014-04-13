object ClassAndObjects {

  class DeclareType{
    type asd
  }
  
  def foo(args: List[String]) = args.toString
//  def foo(args: List[Int]) = args.toString // same type after erasure !
  
  class Foo(private var name: String){}
  val foo = new Foo("HI")
  
  
}