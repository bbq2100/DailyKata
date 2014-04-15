object tail_recursive {
  def factorial(n: Int) = {
    def calc(n: Int, accumulator: Int): Int = {
      if (n == 0) accumulator
      else calc(n - 1, n * accumulator)
    }
    calc(n, accumulator = 1)
  }                                               //> factorial: (n: Int)Int

  factorial(5)                                    //> res0: Int = 120
}