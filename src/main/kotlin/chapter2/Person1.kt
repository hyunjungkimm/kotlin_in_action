package chapter2

import org.example.chapter2.createRandomRectangle

class Person(val name: String,
             var isMarried : Boolean)

fun main(args: Array<String>) {
    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)

    person.isMarried = false
    println(person.isMarried)

    println(createRandomRectangle().isSquare)
}
