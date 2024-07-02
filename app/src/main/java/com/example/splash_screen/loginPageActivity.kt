package com.example.splash_screen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class loginPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)
        val logbtn = findViewById<Button>(R.id.button2)
        logbtn.setOnClickListener {
            val intent = Intent(applicationContext,::class.java)
            startActivity(intent)
        }

    }
}