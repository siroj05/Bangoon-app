package com.example.apmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.main_menu.*

class MainActivity:AppCompatActivity(){

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)
        agenda.setOnClickListener {
            val intent = Intent(this,Agenda::class.java)
            startActivity(intent)
        }
    }
}