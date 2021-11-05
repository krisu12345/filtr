package com.example.kolejnalekcja

import android.graphics.BitmapFactory
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

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.)
        val przycisk = findViewById<ToggleButton>(R.id.taknie)
        przycisk.textOn = "Włącz filtr"
        przycisk.setOnClickListener {
            przycisk.textOff = "Wyłącz filtr"
            przycisk.textOn = "Włącz filtr"
        }
    }


}