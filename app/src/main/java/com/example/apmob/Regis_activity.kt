package com.example.apmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import com.example.apmob.databinding.RegisterMenuBinding

class Regis_activity : AppCompatActivity() {

    private lateinit var btnregis: Button
    private lateinit var binding: RegisterMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegisterMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistrasi.setOnClickListener {
            startActivity(Intent(this, Sign_in::class.java))
        }

    }
}