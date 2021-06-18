package com.example.apmob

import android.content.Intent
import android.os.Bundle

import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class Agenda : AppCompatActivity() {
    private lateinit var back : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.agenda)

        back = findViewById(R.id.backButton)
        back.setOnClickListener {
            startActivity(Intent(this, mainMenu_activity::class.java))
        }


    }
}