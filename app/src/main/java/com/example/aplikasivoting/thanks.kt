package com.example.aplikasivoting

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class thanks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thanks)

        // Delay of 3 seconds before navigating to MainMenu
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
            finish() // Close ThanksActivity
        }, 3000) // 3000 milliseconds = 3 seconds
    }
}
