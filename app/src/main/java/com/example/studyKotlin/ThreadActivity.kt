package com.example.studyKotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_thread.*

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        val runnable = object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread is made")
            }

        }
        val thread = Thread(runnable)

        button.setOnClickListener {
            thread.start()
        }

        Thread(object: Runnable {
            override fun run() {
                Log.d("thread-2", "Thread2 is made")
            }
        }).start()


        Thread(Runnable {
            Thread.sleep(2000)
            Log.d("thread-3", "Thread3 is made")
            runOnUiThread {
                button.setBackgroundColor(getColor(R.color.red))
            }
        }).start()
        
    }
}