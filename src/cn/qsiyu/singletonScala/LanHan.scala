package cn.qsiyu.singletonScala

/**
  * User: QYT
  * WeChat: jianlai2008
  * created: 2018/6/28 10:13
  */
class LanHan private{

}

object LanHan {

  private var lanHan : LanHan= _

  def apply(): LanHan = {
    if(null == lanHan){
      this.synchronized{
        if(null == lanHan) lanHan = new LanHan
      }
    }
    lanHan
  }

}
