package cn.qsiyu


class TestClass(private var name: String, private var age: Int) {

  private var sex: Char = _
  private var address: String = _

  def this(name: String, age: Int, sex: Char) = {
    this(name, age)
    this.sex = sex
  }

  def this(age: Int, address: String) = {
    this(null, age)
    this.address = address
  }

  def setName(name: String) = {
    this.name = name
  }

  def getName(): String = {
    this.name
  }

  /*override def toString: String = {
    val list = List(name, age, sex, address)
    list.mkString(",")
  }*/
  override def toString = s"$sex, $address, $name, $age"
}

object TestClass {
  def main(args: Array[String]): Unit = {
    //    val qyt = new TestClass("qyt", 21)
    val qyt = new TestClass(18, "河北霸州")
    qyt.setName("齐宇田")
    qyt.sex = '男'
    println(qyt)
  }
}