package org.example.ch04

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

class Button : Clickable, Focusable {
    override fun click() = println("I'm clicked!")
    override fun showOff() {
        super<Focusable>.showOff()
        super<Clickable>.showOff()
    }

}

interface Focusable {
    fun setFocus(b: Boolean) =
        println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

fun main(array:Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}