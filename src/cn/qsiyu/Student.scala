package cn.qsiyu

/**
  * User: QYT
  * WeChat: jianlai2008
  * created: 2018/6/28 8:50
  */
class Student(val name: String, var age: Int) {
  var gender: Int = _

  def this(name: String, age: Int, gender: Int) {
    this(name, age)
    this.gender = gender
  }

  def learn(): String = {

    println(this.name + "learn")
    name

  }

  override def toString = s"Student($gender, $name, $age)"
}
