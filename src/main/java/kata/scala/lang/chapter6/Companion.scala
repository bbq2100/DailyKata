object Companion {

  class Module{
    val name = "Wat"
  }
  
  object Module{
    def apply = new Module
  }
  
  val a = Module
  
}