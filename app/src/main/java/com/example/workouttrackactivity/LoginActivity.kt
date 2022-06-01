package com.example.workouttrackactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tilEmail: TextInputLayout
    lateinit var etEmail: TextInputEditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etPassword: TextInputEditText
    lateinit var tvSign: TextView
    lateinit var btnLogin: Button
    lateinit var tvSIGN: TextView
    lateinit var etSIGN: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tilEmail = findViewById(R.id.tilEmail)
        etEmail = findViewById(R.id.etEmail)
        tilPassword = findViewById(R.id.tilPassword)
        etPassword = findViewById(R.id.etPassword)
        tvSign = findViewById(R.id.tvSign)
        btnLogin = findViewById(R.id.btnLogin)
        tvSign.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)

        }
        btnLogin.setOnClickListener {
            validateLogin()
        }
    }


 fun validateLogin() {
     var email=tilEmail.editText.toString()
     var password=tilPassword.editText.toString()
     if(email.isBlank()) {
         tilEmail.error = "Email is required"
     }
     }
 }
