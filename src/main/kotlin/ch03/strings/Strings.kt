package org.example.ch03.strings

var opCount = 0

const val UNIX_LINE_SEPARATOR = "\n"

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    println("Operation performed ${opCount} times")
}

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) : String {
    val result = StringBuilder(prefix)
    for((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)


fun String.lastChar() : Char = get(length - 1)

fun main(args : Array<String>) {
    reportOperationCount()
    performOperation()
    performOperation()
    reportOperationCount()

    println("Kotlin".lastChar())

    val list = listOf(1,2,3)
    println(list.joinToString(separator = ";", prefix = "(", postfix = ")"))

    val list2 = arrayListOf(1,2,3)
    println(list2.joinToString(" "))

    println(listOf("one", "two", "three").join(" "))
}