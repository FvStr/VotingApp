package com.example.aplikasivoting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {

    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var LoginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialize views
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        LoginButton = findViewById(R.id.LoginButton)

        // Set click listener for the login button
        LoginButton.setOnClickListener {
            handleLogin()
        }
    }

    // Function to handle login button click
    private fun handleLogin() {
        val user = username.text.toString()
        val pass = password.text.toString()

        if (user == "user" && pass == "1234") {
            Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()

            // Navigate to MainMenu Activity
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)

            // Finish the current activity to prevent going back to login
            finish()
        } else {
            Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
        }
    }
}
