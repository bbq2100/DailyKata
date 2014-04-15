abstract class AbstractClass{
  var count: Int
  val name: String
}

class ConcreteClass extends AbstractClass{
  var count = 9
  val name = "wat"
  override def toString = "name: "+ name+" count: "+count
}

object AbstractFieldOverriding {
	println(new ConcreteClass)
  
}