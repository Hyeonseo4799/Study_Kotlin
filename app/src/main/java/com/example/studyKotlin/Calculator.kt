package com.example.studyKotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        var sum = 0
        var temp = 0

        one.setOnClickListener {
            sum = btnClick(1, sum)
            result.text = sum.toString()
        }

        two.setOnClickListener {
            sum = btnClick(2, sum)
            result.text = sum.toString()
        }

        three.setOnClickListener {
            sum = btnClick(3, sum)
            result.text = sum.toString()
        }

        four.setOnClickListener {
            sum = btnClick(4, sum)
            result.text = sum.toString()
        }

        five.setOnClickListener {
            sum = btnClick(5, sum)
            result.text = sum.toString()
        }

        six.setOnClickListener {
            sum = btnClick(6, sum)
            result.text = sum.toString()
        }

        seven.setOnClickListener {
            sum = btnClick(7, sum)
            result.text = sum.toString()
        }

        eight.setOnClickListener {
            sum = btnClick(8, sum)
            result.text = sum.toString()
        }

        nine.setOnClickListener {
            sum = btnClick(9, sum)
            result.text = sum.toString()
        }

        zero.setOnClickListener {
            sum = btnClick(0, sum)
            result.text = sum.toString()
        }

        clear.setOnClickListener {
            sum = 0
            result.text = sum.toString()
        }

        plus.setOnClickListener {
            temp += sum
            sum = 0
            result.text = temp.toString()
        }
    }
}

fun btnClick(number: Int, sum: Int): Int {
    return if (sum == 0)
        number
    else
        (sum * 10) + number
}