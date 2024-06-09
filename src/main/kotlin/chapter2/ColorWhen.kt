package chapter2

import org.example.chapter2.color.Color
import org.example.chapter2.color.Color.*


fun getMnemonic(color: Color) =
    when(color) {
        RED -> "Richard"
        ORANGE -> "Of"
        YELLOW -> "York"
        GREEN -> "Gave"
        BLUE -> "Battle"
        INDIGO -> "In"
        VIOLET -> "Vain"
    }

fun getWarmth(color : Color) =
    when(color) {
        RED, ORANGE, YELLOW -> "warm"
        GREEN -> "neutral"
        BLUE, INDIGO, VIOLET -> "cold"
    }

fun mix(c1: Color, c2: Color) =
    when(setOf(c1, c2)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(BLUE, VIOLET) -> INDIGO
        else -> throw Exception("Dirty Color")
    }

fun mixOptimized(c1 : Color, c2 : Color) =
    when {
        (c1 == RED && c2 == YELLOW)  || (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
        (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> throw Exception("Dirty color")
    }

fun main( args : Array<String>) {
    println(BLUE.rgb())
    println(getMnemonic(BLUE))
    println(getWarmth(VIOLET))
    println(mix(VIOLET, BLUE))
    println(mixOptimized(YELLOW, BLUE))
}