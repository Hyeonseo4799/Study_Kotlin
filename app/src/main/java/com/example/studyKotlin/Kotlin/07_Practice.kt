package com.example.studyKotlin.Kotlin

// 07. 연산자 - 실습
fun main(array: Array<String>) {
    // 산술 연산자
    var a = 10 + 1
    var b = 10 - 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    // 대입 연산자
    val f = 5
//  val 5 = f

    // 복합 대입 연산자
    a += 10
    b -= 10
    c *= 3
    d /= 4
    e %= 2
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    // 증감 연산자
    a++
    b--
    println(a)
    println(b)

    // 비교 연산자
    val g = a > b
    val h = a == b
    val i = h != g
    println(g)
    println(h)
    println(i)


    // 논리 연산자
    var j = h && i
    val k = h || i
    val l = !h
    println(j)
    println(k)
    println(l)
}