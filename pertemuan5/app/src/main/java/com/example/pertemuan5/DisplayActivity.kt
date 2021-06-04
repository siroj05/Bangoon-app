package com.example.pertemuan5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display.*

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val messageNim = intent.getStringExtra("EXTRA_NIM")
        val messageProdi = intent.getStringExtra("EXTRA_PRODI")
        val messageUsia = intent.getStringExtra("EXTRA_USIA")
        tvDisplayMessage.text = message
        DisplayNim.text = messageNim
        displayProdi.text = messageProdi
        displayUsia.text = messageUsia

    }
}