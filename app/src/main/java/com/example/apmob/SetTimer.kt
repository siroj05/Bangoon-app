package com.example.apmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SetTimer : AppCompatActivity() {
    private lateinit var back2 : ImageView
    private lateinit var save : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.set_timer)

        back2 = findViewById(R.id.backButton2)
        back2.setOnClickListener {
            startActivity(Intent(this, mainMenu_activity::class.java))
        }

        save = findViewById(R.id.btnSave)
        save.setOnClickListener {
            startActivity(Intent(this, Agenda::class.java))
        }
    }
}