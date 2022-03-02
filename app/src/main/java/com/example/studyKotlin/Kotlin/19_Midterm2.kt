package com.example.studyKotlin.Kotlin

// 1번 문제) 사칙 연산을 수행할 수 있는 클래스

// 2번 문제) 은행 계좌 만들기
// - 계좌 생성 기능 (이름, 생년월일)
// - 잔고를 확인하는 기능
// - 출금 기능
// - 예금 기능

// 3번 문제) TV 클래스
// - on, off 기능
// - 채널 변경 기능
// - 초기 채널은 SBS, MBC, KBS

fun main(array: Array<String>) {
    val calculator1 = Calculator1()
    println(calculator1.plus(1,2))
    println(calculator1.minus(1,2))
    println(calculator1.multiply(1,2))
    println(calculator1.divide(1,2))

    val calculator2 = Calculator2()
    println(calculator2.plus(1,2,3))
    println(calculator2.minus(1,2,3))
    println(calculator2.multiply(1,2,3))
    println(calculator2.devide(1,2,3))

}

class Calculator1 {
    fun plus(n1: Int, n2: Int) = n1 + n2
    fun minus(n1: Int, n2: Int) = n1 - n2
    fun multiply(n1: Int, n2: Int) = n1 * n2
    fun divide(n1: Int, n2: Int) = n1 / n2
}

class Calculator2 {
    fun plus(vararg numbers: Int): Int {
        var result = 0
        numbers.forEach { num ->
            result += num
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result = numbers[0]
        numbers.forEachIndexed { index, num ->
            if (index > 0) {
                result -= num
            }
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result = 1
        numbers.forEach { num ->
            result *= num
        }
        return result
    }

    fun devide(vararg numbers: Int): Int {
        var result = numbers[0]
        numbers.forEachIndexed { index, num ->
            if (index > 0) {
                result /= num
            }
        }
        return result
    }
}

class Account(name: String, birth: String) {
    var balance = 0

    fun deposit(money: Int) {
        balance += money
    }

    fun withdraw(money: Int) {
        balance -= money
    }

    fun check() {
        println(balance)
    }

    constructor(name: String, birth: String, balance: Int) : this(name, birth) {
        this.balance = balance
    }
}

class Television() {
    var isTurned = false
    fun turnOn() {
        println("TV가 켜졌습니다.")
        isTurned = true
    }

    fun turnOff() {
        println("TV가 꺼졌습니다.")
        isTurned = false
    }

    fun change(channel: String) {
        if (isTurned) {
            when (channel) {
                "SBS" -> println("SBS 채널이 켜졌습니다.")
                "KBS" -> println("KBS 채널이 켜졌습니다.")
                "MBC" -> println("MBC 채널이 켜졌습니다.")
            }
        }
    }
}
