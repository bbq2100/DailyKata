object HighOrderFunctions {
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)                  //> sum: (f: Int => Int, a: Int, b: Int)Int

  def fact(x: Int): Int =
    if (x == 0) 1
    else fact(x - 1)                              //> fact: (x: Int)Int

  sum(x => x, 1, 3)                               //> res0: Int = 6
  sum(x => x * x * x, 1, 2)                       //> res1: Int = 9
  sum(fact, 1, 13)                                //> res2: Int = 13

}

package tailRecursion {
  object tail {
    def sum(f: Int => Int)(a: Int, b: Int): Int = {
      def loop(a: Int, acc: Int): Int = {
        if (a > b) acc
        else loop(a + 1, f(a) + acc)
      }
      loop(a, 0)
    }
  }
}