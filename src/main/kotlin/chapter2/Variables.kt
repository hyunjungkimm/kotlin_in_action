package org.example.chapter2

class Variables

fun main(args: Array<String>) {
    val popcorn = 5
    val hotdog = 7
    var customers = 10

    customers = 8
    println(customers)

    val customers2 = 10
    println("There are ${customers2} customers")
    println("There are ${customers2 + 1} customers")

    val name = "Mary"
    val age = 20

    println("${name} is ${age} years old")
}