package com.example.aplikasivoting

import android.content.Intent
import android.os.Bundle
import android.widget.Button // Pastikan Button diimpor
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Paslon1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_paslon1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.chooseButton)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Mengatur klik pada tombol chooseButton
        findViewById<Button>(R.id.chooseButton).setOnClickListener {
            // Pindah ke halaman konfirmasi pilihan
            val intent = Intent(this, ConfirmationActivity::class.java)
            startActivity(intent)
        }
    }
}
