package com.example.act3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class Activity_12 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_12)

        val btnTable = findViewById<Button>(R.id.btnTable)
        val btnGrid = findViewById<Button>(R.id.btnGrid)
        val btnLinear = findViewById<Button>(R.id.btnLinear)
        val btnReturn = findViewById<Button>(R.id.btnReturn)

        btnTable.setOnClickListener {
            val intent = Intent(this, TableActivity::class.java)
            startActivity(intent)
        }

        btnGrid.setOnClickListener {
            val intent = Intent(this, GridActivity::class.java)
            startActivity(intent)
        }

        btnLinear.setOnClickListener {
            val intent = Intent(this, LinearActivity::class.java)
            startActivity(intent)
        }

        btnReturn.setOnClickListener {
            finish() // vuelve al MainActivity
        }
    }
}