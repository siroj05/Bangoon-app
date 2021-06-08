package com.example.apmob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceStates: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.Login)
        btnAddTodo.setOnClickListener(this);
    }

}