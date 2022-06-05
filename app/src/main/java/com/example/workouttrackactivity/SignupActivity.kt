package com.example.workouttrackactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignupActivity : AppCompatActivity() { lateinit var tilFirstname: TextInputLayout
    lateinit var etFirstname: TextInputEditText
    lateinit var tilLastname: TextInputEditText
    lateinit var etLastname: TextInputEditText
    lateinit var etEmail: TextInputEditText
    lateinit var tilEmail: TextInputLayout
    lateinit var tilPassword: TextInputLayout
    lateinit var etPassword: TextInputEditText
    lateinit var tilConfirmpassword: TextInputLayout
    lateinit var etConfirmpassword: TextInputEditText
    lateinit var btnSignup: Button
    lateinit var tvLogin:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        tilFirstname = findViewById(R.id.tilFirstname)
        etFirstname = findViewById(R.id.etFirstname)
       tilLastname = findViewById(R.id.etLastname)
        etPassword = findViewById(R.id.etPassword)
        tilPassword = findViewById(R.id.tilPassword)
        tilConfirmpassword = findViewById(R.id.tilConfirmpassword)
        etConfirmpassword = findViewById(R.id.etConfimpassword)
        tilEmail = findViewById(R.id.tilEmail)
        etEmail = findViewById(R.id.etEmail)
        tvLogin = findViewById(R.id.tvLogin)
        btnSignup = findViewById(R.id.btnSignup)

        tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        btnSignup.setOnClickListener {
            validateSignup()
        }
    }

    fun validateSignup() {
        var Firstname = etFirstname.text.toString()
        var Lastname = etLastname.text.toString()
        var email = etEmail.text.toString()
        var password = etPassword.text.toString()
        var Confirmpassword = etConfirmpassword.text.toString()
        if (Firstname.isBlank()) {
            tilFirstname.error = "Firstname is required"
        }
        if (Lastname.isBlank()) {
            etLastname.error = "Lastname is required"
        }
        if (email.isBlank()) {
            tilEmail.error = "Email is required"
        }
        if (password.isBlank()) {
            tilPassword.error = "Password is required"
        }
        if (Confirmpassword.isBlank()) {
            tilConfirmpassword.error = "ConfirmPassword is required"

        }
    }
}




