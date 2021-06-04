package android.example.pertemuan5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener {
            Log.d("MainActivity","Button Di Click")
            val text = "Hello Toast"
            val duration = Toast.LENGTH_LONG

            Toast.makeText(applicationContext, "Hello Toast", Toast.LENGTH_SHORT).show()
//            toast.show()
            sendMessage(it)
        }
    }

    fun sendMessage(view: View){
        val inputNama = inputName.text.toString()
        //           val editText = findViewById<EditText>(R.id.editText)
        //          val message = editText.text.toString()
        val intent = Intent (this, DisplayActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, "HALO ${inputNama}")
        }
        startActivity(intent)
    }
}