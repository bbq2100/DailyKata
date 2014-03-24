package kata.scala.akka

object StartShapeDrawingActor extends App {
  ShapeDrawingActor.start
  ShapeDrawingActor ! new Circle(new Point(0.0, 0.0), 1.0)
  ShapeDrawingActor ! new Rectangle(2, 5)
  ShapeDrawingActor ! new Triangle(new Point(0.0, 0.0), new Point(0.0, 0.0), new Point(0.0, 0.0))
  ShapeDrawingActor ! 42
  ShapeDrawingActor ! "exit"
}

