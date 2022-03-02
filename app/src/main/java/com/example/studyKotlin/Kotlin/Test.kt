package com.example.studyKotlin.Kotlin

fun main(args: Array<String>) {
    val night = Night1(50, 6)
    val monster = Monster1(30, 4)

    night.superAttack(monster)
    monster.attack(night)

}

open class Character1(var hp: Int, val power: Int) {
    open fun attack(character: Character1, power: Int = this.power) {
        character.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        println("${javaClass.simpleName}의 남은 체력은 $hp 입니다.")
    }
}

class Night1(hp: Int, power: Int) : Character1(hp, power) {
    private val defencePower = 2
    private val critical = 2

    override fun defense(damage: Int) {
        super.defense(damage - defencePower)
    }

    fun superAttack(character: Character1) {
        character.defense(power * critical)
    }
}

class Monster1(hp: Int, power: Int) : Character1(hp, power) {
    private val secondAttack = 1

    override fun attack(character: Character1, damage: Int) {
        super.attack(character, power + secondAttack)
        println("${javaClass.simpleName}의 두번째 공격!")
    }

    override fun defense(damage: Int) {
        super.defense(damage)
        heal()
    }

    private fun heal() {
        hp += 2
        println("${javaClass.simpleName}가 체력을 회복하였습니다. 현재 체력 : $hp")
    }
}