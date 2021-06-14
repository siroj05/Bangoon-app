//package com.example.apmob
//
//import android.content.Intent
//import android.os.Bundle
//import android.util.Log
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import com.google.android.gms.auth.api.signin.GoogleSignIn
//import com.google.android.gms.auth.api.signin.GoogleSignInAccount
//import com.google.android.gms.auth.api.signin.GoogleSignInClient
//import com.google.android.gms.auth.api.signin.GoogleSignInOptions
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.auth.GoogleAuthProvider
//
//class GoogleSignInActivity:AppCompatActivity(){
//    private lateinit var googleSignInClient: GoogleSignInClient
//    private lateinit var firebaseAuth: FirebaseAuth
//    private lateinit var binding: ActivityMainBinding
//
//    private companion object{
//        private const val RC_SIGN_IN = 100
//        private const val TAG = "GOOGLE_SIGN_IN_TAG"
//    }
//    override fun onCreate(savedInstanceStates: Bundle?){
//        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        val googleSignInOptions = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN)
//                .requestIdToken(R.string.default_web_client_id)
//                .requestEmail()
//                .build()
//        googleSignInClient = GoogleSignIn.getClient(this, googleSignInOptions)
//
//        //firebase auth
//        firebaseAuth = FirebaseAuth.GetInstance()
//        checkUser()
//
//        //bind tombol google
//        binding.btnAddTodo.setOnClickListener{
//            //start loggin in
//            Log.d(TAG, "onCreate: begin Google SignIn")
//            val intent = googleSignInClient.signInIntent
//            startActivityForResult(intent, RC_SIGN_IN)
//        }
//    }
//    private fun checkUser(){
//
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if(requestCode == RC_SIGN_IN){
//            Log.d(TAG, "onActivityResult: Google")
//            val accountTask = GoogleSignIn.getSignedInAccountFromIntent(data)
//            try{
//                //success sign in
//                val account = accountTask.getResult(ApiException::class.java)
//                firebaseAuthWithGoogleAccount(account)
//            }
//            catch(e: Exception){
//                //failed sign in
//                Log.d(TAG, "onActivityResult: ${e.message}")
//
//            }
//        }
//    }
//
//    private fun firebaseAuthWithGoogleAccount(account: GoogleSignInAccount?) {
//        Log.d(TAG, "firebaseAuthWithGoogleAccount: ")
//        val credential = GoogleAuthProvider.getCredential(account!!.idToken, null)
//        firebaseAuth.signInWithCredential(credential)
//                .addOnSuccessListener{authResult->
//                    //success login
//                    Log.d(TAG, "firebaseAuthWithGoogleAccount: LoggedIn")
//
//                    //get logged in user
//                    val firebaseUser = firebaseAuth.currentUser
//                    //get user info
//                    val uid = firebaseUser!!.uid
//                    val email = firebaseUser!!.email
//                    Log.d(TAG, "firebaseAuthWithGoogleAccount: UID: $uid")
//                    Log.d(TAG, "firebaseAuthWithGoogleAccount: Email: $email")
//                    if(authResult.additionalUserInfo.isNewUser){
//                        //new user
//                        Log.d(TAG, "firebaseAuthWithGoogleAccount: Account created...$email")
//                        Toast.makeText(this@GoogleSignInActivity,"Account created...$email", Toast.LENGTH_SHORT).show()
//                    }
//                    else{
//
//                    }
//                }
//    }
//
//}
