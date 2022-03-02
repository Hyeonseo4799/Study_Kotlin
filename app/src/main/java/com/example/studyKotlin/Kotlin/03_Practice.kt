package com.example.studyKotlin.Kotlin

// 03. 변수, 자료형 - 실습
var a = 1 + 2 + 3 + 4 + 5 // 연산의 결과값을 변수에 넣어 줄 수 있다.
var b = "1"
var c = b.toInt()
var d = b.toFloat()
var e = "John"
var f = "My name is $e Nice to meet you"

// Null : 존재하지 않는다.
// var abc : Int = null
var abc2 : Int? = null // "null" (x)
var abc3 : Double? = null

var g = a + 3

fun main(array: Array<String>) {
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(abc2)
    println(g)
}
