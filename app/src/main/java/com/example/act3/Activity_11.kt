package com.example.act3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.ToggleButton
import android.widget.Button
import android.content.Intent

class Activity_11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_11)

        val toggle = findViewById<ToggleButton>(R.id.toggleScroll)
        val scroll = findViewById<HorizontalScrollView>(R.id.hScroll)

        toggle.setOnCheckedChangeListener { _, isChecked ->
            scroll.isHorizontalScrollBarEnabled = isChecked
        }

        val botonVolver = findViewById<Button>(R.id.ReturnButton11)

        botonVolver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}