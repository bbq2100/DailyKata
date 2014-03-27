object Imports {

  def writeAboutBigIntegers()={
    import java.math.BigDecimal.{
      ONE=>_, // hiding this field
      TEN,
      ZERO=> JAVAZERO //renaming imported field
    }
    println(JAVAZERO)
  }
  
}