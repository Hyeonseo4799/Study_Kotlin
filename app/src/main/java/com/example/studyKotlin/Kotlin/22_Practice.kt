package com.example.studyKotlin.Kotlin

fun main(args: Array<String>) {
    val night = Night(20, 4)
    val monster = Monster(15, 5)

    night.attack(monster)
    monster.attack(night)
}

class Night(private var hp: Int, private var power: Int) {
    fun attack(monster: Monster) {
        monster.defense(power)
    }

    fun defense(damage : Int) {
        hp -= damage
        if(hp > 0) {
            heal()
            println("기사 현재 체력 : $hp")

        }
        else println("기사가 죽었습니다.")
    }

    private fun heal() {
        // 아무때나 사용하는게 아니라
        // 공격을 받고 죽지 않았을 때 사용
        hp += 3
    }
}

class Monster(private var hp: Int, private var power: Int) {
    fun attack(night : Night) {
        night.defense(power)
    }

    fun defense(damage : Int) {
        hp -= damage
        if(hp > 0) println("몬스터 현재 체력 : $hp")
        else println("몬스터가 죽었습니다.")
    }
}