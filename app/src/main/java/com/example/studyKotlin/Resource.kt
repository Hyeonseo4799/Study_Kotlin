package com.example.studyKotlin

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_resource.*

class Resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        // 1
        val ment = resources.getString(R.string.test)
        Log.d("ment", "ment : $ment")

        // 2
        val ment2 = getString(R.string.test)
        Log.d("ment", "ment : $ment2")

        // SDK 버전에 다른 분기 처리
        val color = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getColor(R.color.red)
        } else {
            resources.getColor(R.color.red)
        }
        Log.d("color", "color : $color")
        button.setBackgroundColor(getColor(R.color.black))

    }
}