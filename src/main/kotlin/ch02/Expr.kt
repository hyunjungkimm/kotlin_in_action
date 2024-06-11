package org.example.chapter2

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(expr: Expr): Int {
    if(expr is Num) {
        val n = expr as Num
        return n.value
    }
    if(expr is Sum) {
        return eval(expr.left) + eval(expr.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun eval2 (expr: Expr) : Int {
    if(expr is Num) {
        return expr.value
    }else if(expr is Sum) {
        return eval(expr.left) + eval(expr.right)
    }else {
        throw IllegalArgumentException("Unknown expression")
    }
}

fun eval3(expr: Expr) : Int =
    when(expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun evalWithLogging(e: Expr) : Int =
    when(e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: ${left} + ${right}")
            left + right
        }
        else -> throw java.lang.IllegalArgumentException("Unknown expression")
    }


fun main(args : Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval2(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval3(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}