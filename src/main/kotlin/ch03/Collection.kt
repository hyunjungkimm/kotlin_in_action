package org.example.ch03


class Collection<T> {
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
}

fun <T> joinToString(
    collection: kotlin.collections.Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) : String {
    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

//가변 인자 함수
val list = listOf(2,3,5,7,11)



fun main(args: Array<String>) {
    println(Collection<Any>().set.javaClass)
    println(Collection<Any>().list.javaClass)
    println(Collection<Any>().map.javaClass)

    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers = setOf(1, 14, 2)
    println(numbers.max())
    println(numbers.maxOrNull())

    val list = listOf(1, 2, 3, 4, 5)
    println(list)
    println(joinToString(list,"; ", "(", ")" ))
    println(joinToString(list, separator = " ", prefix = " ", postfix = "."))
    println(joinToString(list))
    println(joinToString(list, "; "))
    println(joinToString(list, postfix = "; ", prefix = "# "))

    //가변 인자 함수
    val list2= listOf("args: ", *args)
    println(list2)

    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    val map2 = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    // 구조 분해 선언
    val (number, name) = 1 to "one"
    println(String.format("${number}, ${name}"))
}
