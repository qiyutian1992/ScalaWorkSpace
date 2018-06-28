package cn.qsiyu

object WordCount extends App {
  val wordsArray = Array("hello tom hello jim", "hello sheep hello tom hello qyt", "hello sheep hello tom hello qyt")
  val wordCount = wordsArray.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.map(_._2).sum).toList.sortBy(-_._2)
  wordCount.toBuffer.foreach(println)

}
