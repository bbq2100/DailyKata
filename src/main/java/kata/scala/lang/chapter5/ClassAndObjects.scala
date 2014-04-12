object ClassAndObjects {

  class DeclareType{
    type asd
  }
  
  def foo(args: List[String]) = args.toString
//  def foo(args: List[Int]) = args.toString // same type after erasure !
}