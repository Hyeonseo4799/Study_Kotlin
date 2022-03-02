package com.example.studyKotlin.Kotlin

fun main(args: Array<String>) {
    val monster = SuperMonster(100, 10)
    val night = SuperNight(130, 8)
    monster.attack(night)
    monster.bite(night)
}

// 상속이 만들어낸 특징
// - 자식 클래스는 부모 클래스의 타입이다
// - 부모 클래스는 자식 클래스의 타입이 아니다.

open class Character(var hp: Int, val power: Int) {
    fun attack(character: Character, power: Int = this.power) {
        character.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("${javaClass.simpleName}의 남은 체력은 $hp 입니다.")
        else println("죽었습니다.")
    }
}

// 자식 클래스가 인스턴스화 되기 위해선 부모 클래스가 선행되어 인스턴스화 되어야 한다.
class SuperMonster(hp: Int, power: Int) : Character(hp, power) {
    fun bite(character: Character) {
        super.attack(character, power + 2)
    }
}

class SuperNight(hp: Int, power: Int) : Character(hp, power) {
    private val defensePower = 2
    override fun defense(damage: Int) {
        super.defense(damage - defensePower)
    }
}