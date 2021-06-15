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
    private lateinit var auth: FirebaseAuth
    private lateinit var getEmail: EditText
    private lateinit var getPassword: EditText
    private lateinit var btnRegister: Button
    private lateinit var binding: SignInMenuBinding
    private lateinit var btnlogin: Button

    override fun onCreate(savedInstanceStates: Bundle?){
        super.onCreate(savedInstanceStates)
        binding = SignInMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, mainMenu_activity::class.java))
        }



        auth = Firebase.auth
        binding.btnRegistrasiMain.setOnClickListener(){
            val intent = Intent(this, Regis_activity::class.java)
            startActivity(intent)
        }
    }
    private fun createUser(){
        val email = getEmail.text.toString().trim()
        val password = getPassword.text.toString().trim()
        if(email.isEmpty()){
            Toast.makeText(this, "Your email is empty", Toast.LENGTH_SHORT).show()
        }
        if(password.isEmpty()){
            Toast.makeText(this, "Your password is empty", Toast.LENGTH_SHORT).show()
        }
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("GoogleSignInActivity", "createUserWithEmail:success")
                    val user = auth.currentUser
//                        updateUI(sign_in_menu)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("GoogleSignInActivity", "createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
//                        updateUI(null)
                }
            }
    }



}
