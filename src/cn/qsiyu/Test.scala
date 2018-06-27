package cn.qsiyu

import scala.collection.immutable.Range

object Test {


  def main(args: Array[String]): Unit = {
    //    val array = Array[List[Int]](List(1, 2, 3), List(4, 5, 6))
    /*//      val flatten = array.flatten
    //      print(flatten.toBuffer)
    val ints = array.flatMap(x => x.map(y => y * 10))
    //    print(ints.toBuffer)
    val newInts = ints.filter(z => z % 3 == 0)
    print(newInts.toBuffer)*/
    /*val flatten = array.flatten
    val newFlatten = for (i <- flatten; if i % 3 == 0) yield i*/
    /* // flatten 1 2 3 4 5 6
     // newFlatten 3 6
     println(flatten.zip(newFlatten).toBuffer)
     val buffer = flatten.zip(newFlatten).map(zi => zi._1 * zi._2).toBuffer
     println(buffer)*/
    //    flatten.foreach(x => println(x))
    //    array.foreach(v => println(v.slice(1,3).mkString("|")))
    val arr = Array(345, 6, 56, 24, 6, 34, 24)
    //    println(arr.sortBy(x => x).reverse.mkString("|"))
    arr.grouped(3).toList.map(x => println(x.toBuffer.mkString("|")))
  }

}
