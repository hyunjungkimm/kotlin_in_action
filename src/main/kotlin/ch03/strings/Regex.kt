package org.example.ch03.strings

fun main(array : Array<String>) {

    //자바
    //"12.345-6.A".split("."); - []
    //코틀린
    println("12.345-6.A".split(".", "-")) //하나 이상의 인자를 받도록 오버라이딩한 spilt 확장함수
    println("12.345-6.A".split("\\.|-".toRegex()))  // toRegex 확장 함수 : 문자열을 정규식으로 변환 가능

    parsePath("/Users/yole/kotlin-book/chapter.adoc")
    parsePath2("/Users/yole/kotlin-book/chapter.adoc")
    lineBreak()
}

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, name: $fileName, ext: $extension")
    println("fullName: $fullName")
}

fun parsePath2(path : String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if(matchResult != null) {
        val(directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun lineBreak() {
    val kotlinLogo = """|   //
                       .|  //
                       .|  /  \"""
    println(kotlinLogo.trimMargin("."))

    val file2 = "C:\\Users\\yole\\kotlin-book\\chapter.adoc"
    println(file2)
    val file3 = """C:\Users\yole\kotlin-book\chapter.adoc"""
    println(file3)

    val price = """${'$'}99.9"""
    println(price)//$99.9
}