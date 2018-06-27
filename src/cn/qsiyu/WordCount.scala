package cn.qsiyu

object WordCount {
  def main(args: Array[String]): Unit = {
    val wordsArray = Array("hello tom hello jim hello jerry", "hello sheep hello tom hello qyt")
    wordsArray.flatMap(_.split(" "))

  }
}
