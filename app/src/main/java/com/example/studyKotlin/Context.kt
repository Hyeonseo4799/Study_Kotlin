package com.example.studyKotlin

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Context : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)

        // 자식은 부모 타입이다.
        // this는 Context의 자식이므로 this를 넣어줄 수 있다.
        val context : Context = this
        val applicationContext = applicationContext
    }
}