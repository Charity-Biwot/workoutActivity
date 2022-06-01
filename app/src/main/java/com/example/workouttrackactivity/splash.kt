package com.example.workouttrackactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this,LoginActivity::class.java)
      startActivity(intent)
      finish()

        setContentView(R.layout.activity_splash)
    }
}