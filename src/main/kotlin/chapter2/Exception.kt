package org.example.chapter2

import java.io.BufferedReader
import java.io.StringReader

class Exception {



}

fun main(array : Array<String>) {
    isPercentage(10)

    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))

    val reader2 = BufferedReader(StringReader("not a number"))
    readNumber2(reader2)

    readNumber3(reader2)
}

fun readNumber3(reader : BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    }catch(ex : NumberFormatException){
        null
    }
    println(number)
}

fun readNumber2(reader : BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch(e : NumberFormatException) {
        return
    }

    println(number)
}

fun readNumber(reader: BufferedReader) : Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch(e : NumberFormatException){
        return null
    } finally {
        reader.close()
    }
}

fun isPercentage(number: Int) {
   val percentage =
        if(number in 0..100) number
        else
            throw IllegalArgumentException("Percentage must be between 0 and 100: ${number}")

    println(percentage)
}