import scala.util.Random

object PatternMatching {
  val bools = List(true, false, "Hehe")

  for (bool <- bools) {
    bool match {
      case true => println(bool + " Head")
      case false => println(bool + " Tails")
      case _ => println(bool + " Wat?")
    }
  }

  // variable in matcher
  val randomInt = new Random().nextInt(10)

  randomInt match {
    case 7 => println("lucky seven")
    case otherNumber => println("bad luck")
  }

  //  type matching
  val sundries = List("Hi", 1, 1.3F, 'a')

  for (sundry <- sundries) {
    sundry match {
      case sundry: Int => println("Int")
      case sundry: Float => println("Float")
      case otherType => println("wat type?")
    }
  }

  // sequence matching

  val willWork = List("hi", 123, 3, "lol")
  val willNotWork = List("w", 2, 's', 2, 2)
  val emptyList = List()

  for (list <- List(willNotWork, willWork, emptyList)) {
    list match {
      case List(_, _, 3, "lol") => println("List with four elements and the second one is 3")
      case List(_*) => println("List with zero or more elements")
    }
  }

  // :: operator

  def processList(l: List[Any]): Unit = l match {
    case head :: tail =>
      print(head + " ")
      processList(tail)
    case Nil => println("")
  }

  for (list <- List(willNotWork, willWork, emptyList)) {
    print("List: ")
    processList(list)
  }

  // tuple matching

  val tupA = ("Hello", "Goodbye")
  val tupB = ("Hallo", "Tschüss")

  for (tup <- List(tupA, tupB)) {
    tup match {
      case (thingOne, thingTwo) if thingOne == "Hello" => // the if acts as a guard
        println("A two tuple starting with Hello")
      case (thingOne, thingTwo) => println("A two tuple: " + thingOne + " " + thingTwo)
    }
  }

  // deep pattern matching with
  // case classes ; useful when working with actors

  case class Person(name: String, age: Int)

  val alice = new Person("Alice", 25)
  val bob = new Person("Bob", 32)
  val charlie = new Person("Charlie", 45)

  for (person <- List(alice, bob, charlie)) {
    person match {
      case Person("Alice", ageDoesNotMatter) => println("Hi Alice. Come in. " + ageDoesNotMatter)
      case Person(name, age) => println("Sorry you cant enter ! " + name)
    }
  }

  
  
  
  
}
