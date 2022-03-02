package com.example.studyKotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import kotlinx.android.synthetic.main.activity_internet.*

class Internet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_internet)

        var site: String
        button.setOnClickListener {
            site = Internet.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(site))
            startActivity(intent)
        }

        Internet.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("change", "p0 : $p0, p1 : $p1, p2 : $p2, p3 : $p3")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("change", "p1 : $p1, p2 : $p2, p3 : $p3")
            }

            override fun afterTextChanged(p0: Editable?) {
                Log.d("change", "p0 : $p0")
            }
        })
    }
}