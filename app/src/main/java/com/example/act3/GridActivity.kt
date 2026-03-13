package com.example.act3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GridActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        val btnReturn = findViewById<Button>(R.id.btnReturnGrid)
        btnReturn.setOnClickListener { finish() } // vuelve a Activity_12
    }
}