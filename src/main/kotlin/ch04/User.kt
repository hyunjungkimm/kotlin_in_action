package org.example.ch04

interface User3 {
     val nickname : String
}

interface User5 {
    val email : String // 하위클래스에서는 반드시 오버라이드
    val nickname : String // 하위클래스에서 오버라이드 안해도 됨
        get() = email.substringBefore('@') // 프로퍼티에 뒷받침하는 필드가 없다. 대신 매번 결과를 계산해서 돌려줌
}

class PrivateUser(override val nickname : String) : User3 // 주 생성자에 있는 프로퍼티
class SubscribingUser(val email : String) : User3 {
    override val nickname : String
        get() = email.substringBefore('@') // 커스텀 게터
}
//class FacebookUser(val accountId : Int) : User3 {
//    override val nickname = getFacebookName(accountId) // 프로퍼티 초기화식
//}


class User1(val name : String = "hi") {
    var address : String = "unspecified"
        set(value : String) {
            println("""
                Address was changed for $name: 
                "$field" -> "$value".""".trimIndent()) // 뒷받침하는 필드값 읽기
            field = value // 뒷받침하는 필드값 변경하기
        }
}

class LengthCounter {
    var counter : Int = 0
        private set
    fun addWord(word : String) {
        counter += word.length
    }
}

fun main() {

val lengthCounter = LengthCounter()
lengthCounter.addWord("hello")
println(lengthCounter.counter)
// lengthCounter.counter = 10 - 에러 발생
/*
 Address was changed for John:
"unspecified" -> "New York".
*/
    val user = User1()
    user.address = "New York"

    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
}