package com.example.act3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)

        val btnReturn = findViewById<Button>(R.id.btnReturnTable)
        btnReturn.setOnClickListener { finish() } // vuelve a Activity_12
    }
}