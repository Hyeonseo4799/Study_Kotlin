package com.example.studyKotlin.Kotlin

// 02. 자료형
// 정수형 : Long > Int > Short > Byte
// 실수형 : Double > Float
// 문자 : Char
// 문자열 : String
// 논리형 : Boolean

// 변수 선언하는 방법 (1)
// var/val 변수명 = 값
var number = 10

// 변수 선언하는 방법 (2)
// var/val 변수명 : 자료형 = 값
var number2 : Int = 20
var hello2 : String = "Hello"
var point2 : Double = 3.4

// Variable or Value?
// 1. 변하지 않는 값이라면 Value
// 2. 변할지 모르겠다면 Value

fun main(array: Array<String>) {
    number = 20
//  number = 20.5
//  number는 정수형이므로 실수형 데이터를 담을 수 없다.
}


