package com.example.apmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sign_in : AppCompatActivity() {
    private lateinit var btnregis: Button
    private lateinit var btnlogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_menu)

        btnregis = findViewById(R.id.btn_registrasi)
        btnregis.setOnClickListener {
            startActivity(Intent(this, Regis_activity::class.java))
        }

        btnlogin = findViewById(R.id.btn_login)
        btnlogin.setOnClickListener {
            startActivity(Intent(this, mainMenu_activity::class.java))
        }
    }
}