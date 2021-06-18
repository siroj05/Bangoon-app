package com.example.apmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
//testing
class Profile : AppCompatActivity() {
    private lateinit var homeBtn : ImageView
    private lateinit var auth: FirebaseAuth
    private lateinit var logout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        auth = Firebase.auth
        homeBtn = findViewById(R.id.homeBtn)
        homeBtn.setOnClickListener {
            startActivity(Intent(this, mainMenu_activity::class.java))
        }
        logout = findViewById(R.id.logoutBtn)
        logout.setOnClickListener{
            Firebase.auth.signOut()
            startActivity(Intent(this, mainMenu_activity::class.java))
        }
    }
}