package com.example.studyKotlin.Kotlin

// 08. 제어 흐름
// if, else
fun main(args: Array<String>) {
    var a: Int = 5
    val b: Int = 10

    // if else 사용하는 방법 (1)
    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
    }
    println("같다")

    // if else 사용하는 방법 (2)
    if (a > b) {
        println("a가 b보다 크다")
    }

    // if else if else 사용하는 방법
    if (a > b) {
        println("a가 b보다 크다")
    } else if (a == b) {
        println("같다")
    } else {

    }

    // 값을 리턴하는 if 사용방법 (1)
    val max = if (a > b) {
        a // 5
    } else {
        b // 10
    }
    println(max)

    // 값을 리턴하는 if 사용방법 (2)
    val max2 = if (a > b) a else b
    println(max2)

}