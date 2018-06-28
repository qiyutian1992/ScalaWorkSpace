package cn.qsiyu

/**
  * User: QYT
  * WeChat: jianlai2008
  * created: 2018/6/28 16:21
  */

object WenduAvg extends App {
  val d1 = Array(("bj", 28.1), ("sh", 28.7), ("gz", 32.0), ("sz", 33.1))
  val d2 = Array(("bj", 27.3), ("sh", 30.1), ("gz", 33.3))
  val d3 = Array(("bj", 28.2), ("sh", 29.1), ("gz", 32.0), ("sz", 30.5))
  val d = d1 ++ d2 ++ d3
  d.groupBy(_._1).mapValues(x => x.map(_._2).sum / x.length).toList.sortBy(-_._2).foreach(println)
}