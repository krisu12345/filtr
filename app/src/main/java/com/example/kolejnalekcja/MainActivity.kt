package com.example.kolejnalekcja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ToggleButton
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val przycisk = findViewById<ToggleButton>(R.id.taknie)
        przycisk.textOn = "Włącz filtr"
        przycisk.setOnClickListener {
            przycisk.textOff = "Wyłącz filtr"
            przycisk.textOn = "Włącz filtr"
        }
    }


}