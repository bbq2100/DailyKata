import java.nio.file.Files
import java.nio.file.Path
import scala.collection.immutable.List

object AbstractTypes {

  println(new StringBulkReader("HI") read)
}

abstract class BulkReader {
  type In
  val source: In
  def read: String
}

class StringBulkReader(val source: String) extends BulkReader {
  override type In = String
  override def read = source
}

class FileBulkReader(val source: Path) extends BulkReader {
  override type In = Path
  override def read = {
    Files.readAllBytes(source).toString()
  }
  
  //using reserved names
  def `for`{}
  def `match`{}
}

