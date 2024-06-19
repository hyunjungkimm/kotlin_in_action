package org.example.ch04

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey")
    protected fun whisper() = println("Let's talk")
}

//public fun TalkativeButton.giveSpeech() { // public 멤버가 자신의 internal 수신 타입인 "TalkativeButton"을 노출함
//    yell() // "yell"에 접근할 수 없음 : "yell"은 "TalkativeButton"의 "private" 멤버임
//    whisper() //"whisper"에 접근할 수 없음 : "whisper"는 "TalkativeButton"의 "protected"멤버임
//}

sealed class Expr {
    class Num(val value:Int): Expr()
    class Sum(val left: Expr, val right: Expr): Expr()
}

fun eval(e: Expr) : Int =
    when(e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.left) + eval(e.right)
    }

//class User(val nickname : String)
class User constructor(_nickname: String) { // 파라미터가 하나만 있는 주 생성자
  val nickname : String
  //초기화 블록
  init {
      nickname = _nickname
  }
}