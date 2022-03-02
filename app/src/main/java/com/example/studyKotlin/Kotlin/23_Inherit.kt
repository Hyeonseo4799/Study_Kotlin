package com.example.studyKotlin.Kotlin

// 25. 상속
// 부모로부터 설명서를 물려받는다!
fun main(args: Array<String>) {
    val superCar1 = SuperCar1()
    superCar1.drive()
    superCar1.stop()
}

// 클래스는 기본 접근 제어자가 private이므로 open을 적어야 외부에서 접근할 수 있다.
open class NormalCar1() {
    open fun drive() : String {
        return "달린다"
    }
    fun stop() {

    }
}

class SuperCar1() : NormalCar1() {
    override fun drive(): String {
        val run = super.drive()
        return "빨리 $run"
    }
}

class Bus1() : NormalCar1() {

}