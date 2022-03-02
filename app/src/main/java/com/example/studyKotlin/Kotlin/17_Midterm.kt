package com.example.studyKotlin.Kotlin

// 1번 문제
// List를 두 개 만든다
// 첫 번째 list에는 0부터 9까지 값을 넣는다 (반복문 사용)
// 두 번째 List에는 첫 번째 List의 값을 하나씩 확인한 후
// 짝수면 True, 홀수면 False를 넣어준다

// 2번 문제
// 학점을 구하자
// 80 ~ 90 -> A
// 70 ~ 79 -> B
// 60 ~ 69 -> C
// 나머지 F

// 3번 문제
// 전달받은 숫자의 각 자릿수의 합을 구하자
// 조건: 전달받은 숫자는 무조건 두자리 숫자이다

// 4번 문제
// 구구단을 출력하자

fun main(args: Array<String>) {
    list()          // 1번 문제
    rank()          // 2번 문제
    num()           // 3번 문제
    timestable()    // 4번 문제
}

fun list() {
    val mNumberList = mutableListOf<Int>()
    val mBooleanList = mutableListOf<Boolean>()

    for(i in 0..9) {
        mNumberList.add(i)
    }

    mNumberList.forEach { item ->
        if(item % 2 == 0)
            mBooleanList.add(true)
        else
            mBooleanList.add(false)
    }
    println(mNumberList)
    println(mBooleanList)
}

fun rank() {
    val score = 88
    val rank = if (score in 80..90) 'A' else if(score in 70..79) 'B' else if(score in 60..69) 'C' else 'F'
    println(rank)
}

fun num() {
    var num = 15
    var sum = 0

    while(num > 0) {
        val temp = num % 10
        sum += temp
        num /= 10
    }
    println(sum)
}

fun timestable() {
    // 4번 문제
    for (i in 2..9) {
        for (j in 1..9) {
            println("$i * $j = ${i*j}")
        }
    }
}