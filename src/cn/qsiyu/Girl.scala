package cn.qsiyu


class Girl(val fv: Double) extends Ordered[Girl] {
  override def compare(that: Girl): Int = if (that.fv - this.fv > 0) -1 else 1

  override def toString: String = s"girl : $fv"

}


object Girl {
  def main(args: Array[String]): Unit = {
    val girl1 = new Girl(98)
    val girl2 = new Girl(99.1)
    println(girl1 > girl2)
    import java.util
    import java.util.Collections
    val list = new util.ArrayList[Girl]()
    list.add(girl1)
    list.add(girl2)
    Collections.sort(list)

    import scala.collection.JavaConversions._
    list.foreach(println)
  }
}
