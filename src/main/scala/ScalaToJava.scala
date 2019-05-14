//和java的互操作
object ScalaToJava extends App {
  import scala.collection.JavaConversions.bufferAsJavaList
  import scala.collection.mutable.ArrayBuffer
}
