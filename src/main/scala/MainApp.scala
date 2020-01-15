
object Main {
  def main(args: Array[String]): Unit = {
    val c: Any = 'c'
    println(s"java.lang.Character: ${classOf[java.lang.Character].isAssignableFrom(c.getClass)}")
    val i: Any = 10
    println(s"java.lang.Integer: ${classOf[java.lang.Integer].isAssignableFrom(i.getClass)}")
    val l: Any = 10L
    println(s"java.lang.Long: ${classOf[java.lang.Long].isAssignableFrom(l.getClass)}")
  }
}
