package com.example.apmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class mainMenu_activity : AppCompatActivity() {
    private lateinit var btnagenda: Button
    private lateinit var btnreminder: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        btnagenda = findViewById(R.id.agenda)
        btnagenda.setOnClickListener {
            startActivity(Intent(this, Agenda::class.java))
        }

        btnreminder = findViewById(R.id.reminder)
        btnreminder.setOnClickListener {
            startActivity(Intent(this, Set_reminder::class.java))
        }
    }
}