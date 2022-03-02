package com.example.studyKotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent2.*

class Intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        result.setOnClickListener {
            // 값이 없는 경우를 대비해 defaultValue를 넣어준다.
            val number1 = intent.getIntExtra("number1", 0)
            val number2 = intent.getIntExtra("number2", 0)

            Log.d("number", "" + number1)
            Log.d("number", "" + number2)

            val result = number1 + number2

            val resultIntent = Intent()
            resultIntent.putExtra("result", result)

            setResult(RESULT_OK, resultIntent)
            finish() // Activity 종료
            // Activity는 Stack 구조이므로, Intent2가 종료되면 Intent1이 보인다.
        }
    }
}