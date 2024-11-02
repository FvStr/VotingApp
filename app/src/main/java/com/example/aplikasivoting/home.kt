package com.example.aplikasivoting

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class home : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Find the buttons by their IDs
        val profilButton: Button = view.findViewById(R.id.profilButton)
        val profilButton2: Button = view.findViewById(R.id.profilButton2)

        // Set OnClickListener for profilButton to navigate to Paslon1 activity
        profilButton.setOnClickListener {
            val intent = Intent(activity, Paslon1::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for profilButton2 to navigate to Paslon2 activity
        profilButton2.setOnClickListener {
            val intent = Intent(activity, paslon2::class.java)
            startActivity(intent)
        }

        return view
    }
}
