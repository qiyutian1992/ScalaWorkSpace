package cn.qsiyu

import scala.util.Random

object HelloScala {
  def info(protagonist: List[String])(author: String)(bookName: String): String = {
    "书名 : " + bookName + ", 作者 : " + author + ", 主人公 : " + protagonist.mkString(",")
  }

  def main(args: Array[String]): Unit = {
    val tp = (1, 4, 9)
    tp match {
      case (x, y, z) if (x != 1) => println("0")
      case (x, 4, _) if (x > 2) => println("1")
      case (2, 4, x) => println("2")
      case (1, 4, x) => println(s"$x")
    }
  }
}
