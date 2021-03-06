package com.example.studyKotlin.Kotlin

// 01. 변수 (= 상자)
//  - 내 마음대로 원하는 값을 넣을 수 있는 상자 -> Variable
//  - 한 번 넣으면 바꿀 수 없는 상자 -> Value

// 변수 선언하는 방법
// var/val 변수명 = 값

var num = 10
var hello = ""
var point = 3.4
val fix = 20

fun main(args: Array<String>) {
    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Bye"
    point = 10.4

    println(num)
    println(hello)
    println(point)
    println(fix)
}