package com.example.apmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Regis_activity : AppCompatActivity() {

    private lateinit var btnregis: Button
    private lateinit var btnlogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_menu)

        btnregis = findViewById(R.id.btn_registrasi)
        btnregis.setOnClickListener {
            startActivity(Intent(this, Sign_in::class.java))
        }

    }
}