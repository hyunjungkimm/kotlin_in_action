package org.example.ch04

import javax.naming.Context
import javax.print.attribute.AttributeSet


class User4(val nickname : String,
           val isSubscribed: Boolean = true)

open class User2(val nickname : String)

class TwitterUser(nickname : String) : User2(nickname)

open class Button2 // 인자가 없는 디폴트 생성자가 만들어짐
class RadioButton : Button2()

class Secretive private constructor() // 이 클래스의 (유일한) 주 생성자는 비공개임

open class View2 {// 클래스 이름뒤에 괄호 없음 : 주생성자 x
    constructor(ctx: Context) {} // 부 생성자
    constructor(ctx: Context, attr : AttributeSet) {} // 부 생성자
}

class MyButton: View2 {
    constructor(ctx: Context) : super(ctx) {} //  상위 클래스의 생성자를 호출함
    constructor(ctx: Context, attr : AttributeSet) : super(ctx, attr) {}  //  상위 클래스의 생성자를 호출함
}

class MyButton2: View2 {
    //constructor(ctx: Context) : this(ctx,MY_STYLE) {} // 이 클래스의 다른 생성자에게 위임함
    constructor(ctx: Context, attr : AttributeSet) : super(ctx, attr) {}  //  상위 클래스의 생성자를 호출함
}

fun main(args: Array<String>) {
    val hyun = User4("현석") // isSubscribed 값에는 디폴트 값이 쓰임
    println(hyun.nickname)
    println(hyun.isSubscribed)
    val gye = User4("계영", false)
    println(gye.nickname)
    println(gye.isSubscribed)
    val hey = User4("혜원", isSubscribed = false)// 생성자 인자 중 일부에 대해 이름을 지정 가능
    println(hey.nickname)
    println(hey.isSubscribed)
}