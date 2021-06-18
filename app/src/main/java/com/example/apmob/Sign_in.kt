package com.example.apmob

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.apmob.databinding.RegisterMenuBinding
import com.example.apmob.databinding.SignInMenuBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.register_menu.*
import kotlinx.android.synthetic.main.sign_in_menu.*

class Sign_in:AppCompatActivity(){
    private lateinit var auth:FirebaseAuth
    private lateinit var login: Button
    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var btnregis : Button
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_menu)

        btnregis = findViewById(R.id.btn_registrasiMain)
        btnregis.setOnClickListener {
            startActivity(Intent( this, Regis_activity::class.java ))
        }

        auth = FirebaseAuth.getInstance()
        email = findViewById(R.id.text_emailSignIn)
        password = findViewById(R.id.text_passwordSignIn)
        login = findViewById(R.id.btn_login)
        login.setOnClickListener{
            loginUser()
        }
    }
    private fun loginUser(){
        Log.d("login","login di sini bang")
        val email = email.text.toString().trim()
        val password = password.text.toString().trim()
        if(email.isEmpty()){
            Toast.makeText(this, "Your email is empty", Toast.LENGTH_SHORT).show()
        }
        if(password.isEmpty()){
            Toast.makeText(this, "Your password is empty", Toast.LENGTH_SHORT).show()
        }
        auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d("debug", "signInWithEmail:success")
                        val user = auth.currentUser
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w("debug", "signInWithEmail:failure", task.exception)
                        Toast.makeText(baseContext, "Authentication failed.",
                                Toast.LENGTH_SHORT).show()
                    }
                }
    }
}
