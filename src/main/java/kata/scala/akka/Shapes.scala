package kata.scala.akka {
  class Point(val x: Double, val y: Double) {
    override def toString() = "Point(" + x + " , " + y;
  }

  abstract class Shape() {
    def draw(): Unit
  }

  class Circle(val center: Point, val radius: Double) extends Shape {
    override def draw() = println("Circle.draw: " + this)
  }

  class Rectangle(val width: Double, val height: Double) extends Shape {
    override def draw() = println("Rectange.draw: " + this)
  }

  class Triangle(val point1: Point, val point2: Point, val point3: Point) extends Shape {
    override def draw() = println("Triangle.draw: " + this)
  }
}