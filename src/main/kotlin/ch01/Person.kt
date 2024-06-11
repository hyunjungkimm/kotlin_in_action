package org.example.chapter1

data class Person(val name : String, val age : Int?=null)

fun main(args:Array<String>){
    val persons = listOf(
        Person("영희"),
                        Person("철수", age = 29)
    )
    val oldest = persons.maxBy { it.age ?:0 }
    println("나이가 가장 많은 사람: $oldest")

    println("Hello world")
    println(max(2,3))
    println(max2(2,1))
    println(max3(1,2))

    val question = "삶.."
    val answer = 24
    val answer2 : Int = 24
    val yearsToCompute = 7.5
    val answer3 : Int
    answer3 = 4

    val languages = arrayListOf("Java")
    languages.add("Kotlin")
    println(languages)

    var answer4 = 12
    //answer = "ab"

    val name = if(args.size > 0) args[0] else "Kotlin"
    println("Hello, $name !")
    println("\$x")

    if(args.size > 0) {
        println("Hello, ${args[0]}!")
    }

    println("Hello, ${name}님 반가워요")
    println("Hello, ${if (args.size > 0) args[0] else "Someone"} !")

}

fun max(a: Int, b: Int) : Int {
    return if(a > b) a else b
}

fun max2(a: Int, b: Int) : Int = if(a>b) a else b

fun max3(a: Int, b: Int) = if(a > b) a else b






