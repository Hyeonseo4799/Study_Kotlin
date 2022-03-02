package com.example.studyKotlin.Kotlin

// 04. 함수
// - 어떤 input 을 넣어주면 어떤 output이 나오는 것

// 함수 선언
// fun 함수명 (변수명 : 타입, 변수명 : 타입 ...) : 반환형 {
//     함수 내용
//     return 반환값
// }
fun plus(fir: Int, sec: Int): Int {
    val result: Int = fir + sec
    return result
}

// 디폴트 값을 갖는 함수 만들기
fun plusFive(fir: Int, second: Int = 5): Int {
    val result: Int = fir + second
    return result
}

// 반환값이 없는 함수 만들기 - 1
fun printPlus(fir: Int, sec: Int): Unit {
    val result: Int = fir + sec
    println(result)
}

// 반환값이 없는 함수 만들기 - 2
fun printPlus2(fir: Int, sec: Int) {
    val result: Int = fir + sec
    println(result)
}

// 간단하게 함수를 선언하는 방법
fun plusSimple(fir: Int, sec: Int) = fir + sec

// 가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main(array: Array<String>) {
    // 함수를 호출하는 방법
    //  CTRL + P 를 누르면 인자의 타입을 확인할 수 있다.
    val result = plus(5, 10)
    println(result)

    //  인수를 명시적으로 전달하는 방법
    val result2 = plus(fir = 20, sec = 30)
    println(result2)
    val result3 = plus(sec = 100, fir = 10)
    println(result3)

    // 디폴트 값을 갖는 함수 호출하기
    val result4 = plusFive(10, 20)
    println(result4)
    val result5 = plusFive(10)
    println(result5)

    // 반환값이 없는 함수 호출하기
    printPlus(10, 20)

    // 간단하게 선언한 함수 호출하기
    val result6 = plusSimple(50, 50)
    println(result6)

    // 가변인자를 갖는 함수 호출하기
    plusMany(1,2,3)
    plusMany(100)
}