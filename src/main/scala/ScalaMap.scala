class ScalaMap{

}

object ScalaMap {
  def main(args: Array[String]): Unit = {
    val map = Map(1->"tom",2->"sam",3->"jetty")
    for((k,v)<-map){
      println(k,":",v);
    }
    println("111")
  }
}
