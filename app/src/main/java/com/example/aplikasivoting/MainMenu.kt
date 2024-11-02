package com.example.aplikasivoting

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainMenu : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bottomNavigationView = findViewById(R.id.bottom_nav)

        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.button_faq -> {
                    replaceFragment(faq())
                    true
                }
                R.id.button_home -> {
                    replaceFragment(home())
                    true
                }
                R.id.button_user -> {
                    replaceFragment(user())
                    true
                }

                else -> false
            }
        }

        replaceFragment(home())
    }
    private fun replaceFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit()
    }
}