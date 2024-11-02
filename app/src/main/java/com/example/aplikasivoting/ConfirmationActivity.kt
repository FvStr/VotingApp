package com.example.aplikasivoting

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ConfirmationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmation)

        // Mengatur klik pada tombol konfirmasi pilihan
        val confirmButton: Button = findViewById(R.id.confirmButton)
        val cancelButton: Button = findViewById(R.id.cancelButton)

        confirmButton.setOnClickListener {
            // Navigate to ThanksActivity
            val intent = Intent(this, thanks::class.java)
            startActivity(intent)
            finish() // Close ConfirmationActivity
        }

        cancelButton.setOnClickListener {
            // Close ConfirmationActivity and return to the previous screen
            finish()
        }
    }
}
