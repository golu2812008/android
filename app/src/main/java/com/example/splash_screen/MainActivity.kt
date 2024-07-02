package com.example.splash_screen

import android.content.Intent
import android.os.Bundle

import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.*
import com.example.splash_screen.databinding.ActivityMainBinding
import com.google.firebase.firestore.FirebaseFirestore


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.login_btn)
        button.setOnClickListener {
            val intent = Intent(this, loginPageActivity::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.signup_btn)
        button2.setOnClickListener {
            val intent = Intent(this, Sign_up::class.java)
            startActivity(intent)
        }
        }

    }

