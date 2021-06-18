package com.example.apmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Profile : AppCompatActivity() {
    private lateinit var homeBtn : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        homeBtn = findViewById(R.id.homeBtn)
        homeBtn.setOnClickListener {
            startActivity(Intent(this, mainMenu_activity::class.java))
        }
    }
}