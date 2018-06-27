package cn.qsiyu

import scala.io.Source

object IoTest {
  def main(args: Array[String]): Unit = {
    Source.fromFile("d:\\learngit.txt").getLines().foreach(println)

  }
}
