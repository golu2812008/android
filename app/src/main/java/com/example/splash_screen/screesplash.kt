package com.example.splash_screen

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.Runnable
import kotlinx.coroutines.delay


class screesplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screesplash)
            android.os.Handler().postDelayed(Runnable
                {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                },2000)
            }
    }