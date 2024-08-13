package com.example.lesson4

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val emailButton = findViewById<TextView>(R.id.email)
        val phoneButton = findViewById<TextView>(R.id.phone)

        emailButton.setOnClickListener {
            Toast.makeText(this, emailButton.contentDescription, Toast.LENGTH_SHORT).show()
        }

        phoneButton.setOnClickListener {
            Toast.makeText(this, phoneButton.contentDescription, Toast.LENGTH_SHORT).show()
        }
    }
}