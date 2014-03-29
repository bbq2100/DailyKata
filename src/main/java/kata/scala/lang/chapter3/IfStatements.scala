object IfStatements {

  val configFile = new java.io.File("~/xfhvpn.sh")

  val configFilePath = if (configFile.exists()) {
    configFile.getAbsolutePath
  } else {
    "/*"
  }

  println(configFilePath)
  
  
}