package com.example.studyKotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView

class PhoneBookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book)

        val phoneBook = ArrayList<PhoneBook>()

        for (i in 0 until 30) {
            phoneBook.add(PhoneBook("${i}번째 사람의 번호", "${i}번째 사람"))
        }

        val inflater = LayoutInflater.from(this@PhoneBookActivity)
        val container = findViewById<LinearLayout>(R.id.container)

        for (i in 0 until 30) {
            val itemView = inflater.inflate(R.layout.phone_book_item, null)
            val name = itemView.findViewById<TextView>(R.id.name)

            name.text = phoneBook[i].name
            container.addView(itemView)
        }
    }
}

class PhoneBook(val phoneNumber: String, val name: String) {

}