package com.example.studyKotlin.Kotlin

// 28. 인터페이스
// - 인터페이스도 구현이 있는 함수를 만들 수 있다.
// - 인터페이스에 구현이 있는 함수는 그 인터페이스를 구현하는 클래스에서 함수를 구현할 필요가 없다.
fun main(args: Array<String>) {
    val student = Student__()
    student.eat()
    student.sleep()
}
interface Person__ {
    fun eat() {

    }
    fun sleep() {

    }
    abstract fun study()
    // abstract를 붙인 함수는 반드시 구현해야 한다
}

class Student__ : Person__ {
    override fun study() {

    }
}

class SoccerPlayer__ : Person__ {
    override fun study() {

    }
}