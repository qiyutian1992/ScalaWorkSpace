package cn.qsiyu

object ImplicitTest {

  implicit class Caulate(x: Int) {
    def add() = x * 10
  }

  def main(args: Array[String]): Unit = {
    val b = 10
    println(b.add)
  }

  /*隐式方法|函数
    implicit def double2Int(double: Double) = {
    println("this is double2Int")
    double.toInt
  }

  implicit val funDouble2Int = (double: Double) => {
    println("this is funDouble2Int")
    double.toInt
  }

  def main(args: Array[String]): Unit = {
    val int: Int = 3.14;
    println(int)
  }*/

  /* 隐式参数
  def add(x: Int)(implicit y: Int, z: Int) = y + z;

  def add2(implicit z: Int, y: Int) = y + z

  def main(args: Array[String]): Unit = {
    implicit val a :Int = 10;
//    implicit val b : Int = 12;
    val i1 = add(1)
    println(i1)
    val i2 = add2
    println(i2)
  }*/


}
