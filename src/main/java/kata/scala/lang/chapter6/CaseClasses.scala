case class Point(x: Double, y: Double)

abstract class Shape() {
  def draw(): Unit
}

case class Circle(center: Point, radius: Double) extends Shape() {
  def draw() = println("Circle.draw: " + this)
}

case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape() {
  def draw() = println("Rectangle.draw: " + this)
}

object CaseClasses {

  /* implicitly calling apply (factory method) in the automatically created companion class by the compiler
   copying the argument list from primary ctor in apply() => no need for keyword *new*
   */
  
  val shapes = List(
    Circle(Point(0.0, 0.0), 1.0),
    Circle(Point(0.0, 0.0), 1.0),
    Rectangle(Point(0.0, 0.0), 2, 5))

  for (shape <- shapes) {
    println(shape)
  }

  // using unapply (extractor) implicitly in pattern matching
  
  def matchOn(shape: Shape) = shape match{
    case Circle(center, radius)=>
      println(String.format("Circle: center: %s , radius: %s", center,radius.toString))
    case Rectangle(lowerleft, height, _) => 
      println(String.format("lowerleft: %s , height: %s ",lowerleft, height.toString))
    case _=> println("Unknown shape")
  }
  
  shapes foreach {shape => matchOn(shape)}
}