package cn.qsiyu.singletonScala

/**
  * User: QYT
  * WeChat: jianlai2008
  * created: 2018/6/28 10:12
  */
class EHan private {

}

object EHan {
  private val eHan: EHan = new EHan

  def instance: EHan = {
    eHan
  }
}