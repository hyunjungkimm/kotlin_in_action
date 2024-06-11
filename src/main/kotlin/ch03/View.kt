package org.example.ch03

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("View show off")
fun Button.showOff() = println("Button show off")

//확장 프로퍼티 선언
val String.lastChar: Char
  get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    val view : View = Button()
    view.click()

    view.showOff()

    //확장 프로퍼티 선언
    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}
