package org.example.chapter2

import java.util.*

class Iteration {

}

fun main(args: Array<String>) {
    val oneToTen = 1..10
    for (number in oneToTen) {
        println(number)
    }

    for(i in 1..100) {
        print(fizzBuzz(i));
    }

    println()

    for(i in 100 downTo 1 step 2) {
        print(fizzBuzz(i));
    }

    println()

    for(i in 1 until 100) {
        print(fizzBuzz(i));
    }

    println()

    val binaryReps = TreeMap<Char,String>()
    for(c in 'A' .. 'F') {
        val binary = Integer.toBinaryString(c.code) //아스키 코드를 2진 표현으로 바꿈
        binaryReps[c] = binary
    }

    for((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    val list = arrayListOf('a','b','c','d','e')
    for((index, element)in list.withIndex()) {
        println("$index: $element")
    }

    println(isLetter('q'))
    println(isNotDigit('x'))

    println(recognize('8'))

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}

fun fizzBuzz(i : Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun isLetter(c : Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z' -> "It's a letter!"
    else -> "I don't know"
}

