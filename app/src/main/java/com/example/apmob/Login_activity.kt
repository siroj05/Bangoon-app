package com.example.apmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login_activity : AppCompatActivity() {
    private lateinit var btnsignin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnsignin = findViewById(R.id.signin)
        btnsignin.setOnClickListener {
            startActivity(Intent(this, Sign_in::class.java))
        }



    }
}