package com.example.studyKotlin.Kotlin

// 23. 접근 제어자

// Private 키워드를 사용하면 외부에서 사용할 수 없다.

class runningCar() {
    fun runFast() {
        run()
    }
    private fun run() {

    }

    // private을 사용하는 경우
    // -> 해당 기능을 직접 사용하지 않고, 다른 기능을 보조하는 역할을 하는 경우
    // -> 외부에 공개하고 싶지 않은 경우

}

fun main(args: Array<String>) {
    val testAccess = TestAccess("아무개")
    testAccess.test()
    println(testAccess.name)

}

class TestAccess(var name: String = "홍길동") {
    fun test() {
        println("테스트")
    }
}