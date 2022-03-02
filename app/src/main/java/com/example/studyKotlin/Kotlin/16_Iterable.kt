package com.example.studyKotlin.Kotlin

// 16. Iterable

fun main(args: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 반복하는 방법 (1)
    for (item in a) {
        if (item == 5) {
            println("item is Five")
        } else {
            println("item is not Five")
        }
    }

    // 반복하는 방법 (2)
    for ( (index, item) in a.withIndex()) {
        println("index : $index value : $item")
    }

    // 반복하는 방법 (3)
    a.forEach {
        println(it)
    }
    
    // 반복하는 방법 (4)
    a.forEach { item ->
        println(item)        
    }
    
    // 반복하는 방법 (5)
    a.forEachIndexed { index, item ->
        println("index : $index value : $item")
    }

    // 반복하는 방법 (6)
    println(a.size)
    for(i in 0 until a.size) {
        // until은 마지막을 포함하지 않는다
        println(a.get(i))
    }

    // 반복하는 방법 (7)
    for (i in 0 until a.size step 2) {
        println(a.get(i))
    }

    // 반복하는 방법 (8)
    for (i in a.size - 1 downTo 0) {
        // 8부터 0까지 반복
        println(a.get(i))
    }

    // 반복하는 방법 (9)
    for (i in a.size - 1 downTo 0 step 2) {
        println(a.get(i))
    }

    // 반복하는 방법 (10)
    for (i in 0..10) {
        // ..은 마지막을 포함한다
        println(i)
    }

    // 반복하는 방법 (11)
    var n1 = 0
    var n2 = 4

    while (n1  < n2) {
        n1++ // while문을 정지 시키기 위한 코드
        println("n1")
    }

    var n3 = 0
    var n4 = 4
    // 반복하는 방법 (12)
    do {
        println("hello")
        n3++
    } while(n3 < n4)
}