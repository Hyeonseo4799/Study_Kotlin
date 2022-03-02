package com.example.studyKotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent.*

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        change_activity.setOnClickListener {
//            val intent = Intent(this@Intent1, Intent2::class.java)

            // Key, Value 방식 -> Key와 Value를 쌍으로 만들어 저장한다 -> Dictionary
//            intent.putExtra("number1", 1)
//            intent.putExtra("number2", 2)
//            startActivity(intent)


//            val intent2 = Intent(this@Intent1, Intent2::class.java)
//            intent2.apply {
//                this.putExtra("number1", 1)
//                this.putExtra("number2", 2)
//            }
//            // startActivity(intent2, 200) -> 전달만 하는 요청
//            startActivityForResult(intent2, 200) // -> 리턴을 받는 요청

            // 암시적 인텐트
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://naver.com"))
            // 링크는 Uri.parse를 해야한다.
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == 200) {
            Log.d("number", "" + requestCode)
            Log.d("number", "" + resultCode)
            val result = data?.getIntExtra("result", 0)
            Log.d("number", "" + result)

        }

        super.onActivityResult(requestCode, resultCode, data)
    }
}