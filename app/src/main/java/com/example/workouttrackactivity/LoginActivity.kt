package com.example.workouttrackactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Patterns
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import com.example.workouttrackactivity.databinding.ActivityHomeBinding
import com.example.workouttrackactivity.databinding.ActivityLoginBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.util.regex.Pattern

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            validateLogin()
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }


    fun validateLogin() {
        var email = binding.tilEmail.editText.toString()
        var password = binding.tilPassword.editText.toString()
        if (email.isBlank()) {
            binding.tilEmail.error = "Email is required"
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.tilEmail.error = "Email is invalid"
        }
        if (password.isBlank()) {
            binding.tilPassword.error = "password is required"

        }
    }
}
