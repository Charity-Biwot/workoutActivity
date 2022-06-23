package com.example.workouttrackactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.workouttrackactivity.databinding.ActivityHomeBinding
import com.example.workouttrackactivity.databinding.ActivitySignupBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
//        tilFirstname = findViewById(R.id.tilFirstname)
//        etFirstname = findViewById(R.id.etFirstname)
//        tilLastname = findViewById(R.id.etLastname)
//        etPassword = findViewById(R.id.etPassword)
//        tilPassword = findViewById(R.id.tilPassword)
//        tilConfirmpassword = findViewById(R.id.tilConfirmpassword)
//        etConfirmpassword = findViewById(R.id.etConfimpassword)
//        tilEmail = findViewById(R.id.tilEmail)
//        etEmail = findViewById(R.id.etEmail)
//        tvLogin = findViewById(R.id.tvLogin)
//        btnSignup = findViewById(R.id.btnSignup)

       binding.tvLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
       binding.btnSignup.setOnClickListener {
            validateSignup()
        }
    }

    fun validateSignup() {
        var Firstname = binding.etFirstname.text.toString()
        var Lastname = binding.etLastname.text.toString()
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()
        var Confirmpassword = binding.etConfimpassword.text.toString()
        if (Firstname.isBlank()) {
            binding.tilFirstname.error = "Firstname is required"
        }
        if (Lastname.isBlank()) {
            binding.etLastname.error = "Lastname is required"
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Email is required"
        }
        if (password.isBlank()) {
            binding.tilPassword.error = "Password is required"
        }
        if (Confirmpassword.isBlank()) {
            binding.tilConfirmpassword.error = "ConfirmPassword is required"

        }

        if (Confirmpassword != password)
        binding.tilPassword.error = "Password is incorrect"
    }
}










