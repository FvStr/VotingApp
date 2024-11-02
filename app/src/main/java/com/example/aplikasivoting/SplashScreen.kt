package com.example.aplikasivoting

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Delay for 3 seconds, then navigate to MainActivity
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, login::class.java))
            finish()  // Close SplashActivity so it's not in the back stack
        }, 3000)  // 3 seconds delay
    }
}
