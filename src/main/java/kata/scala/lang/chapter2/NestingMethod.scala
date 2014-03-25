package kata.scala.lang.chapter2

object NestingMethod {

  def factorial(i: Int): Int = {
    def fact(i: Int, accumulator: Int): Int = {
      if (i == 0) accumulator
      else fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }

  println(factorial(5))

}