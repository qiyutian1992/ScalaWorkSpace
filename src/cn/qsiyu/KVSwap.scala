package cn.qsiyu

/**
  * User: QYT
  * WeChat: jianlai2008
  * created: 2018/6/28 16:40
  */
object KVSwap extends App {

  val lst = List("Id1-The Spark", "Id2-The Hadoop", "Id3-The Spark")
  //  lst.map(x => x.split(" ").map(x => x.split("-"))).grouped(3).toList.map(_.map(_.map(x=>((x(1),x(2),(x(1),x(3)))))))
  lst.flatMap(elem => {
    val fields: Array[String] = elem.split("-")
    val wordArray: Array[String] = fields(1).split(" ")
    wordArray.map(word => (word, fields.head))
  }).groupBy(_._1).mapValues(_.map(_._2)).toList.sortBy(-_._2.length).map(x => {
    x._1 + "-" + x._2.mkString(" ")
  })
}
