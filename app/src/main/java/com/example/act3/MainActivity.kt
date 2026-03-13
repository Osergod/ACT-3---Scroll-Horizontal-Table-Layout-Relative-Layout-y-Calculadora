package com.example.act3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val act11 = findViewById<Button>(R.id.Act11)
        val act12 = findViewById<Button>(R.id.Act12)
        val act13 = findViewById<Button>(R.id.Act13)
        val act14 = findViewById<Button>(R.id.Act14)

        act11.setOnClickListener {
            val intent = Intent(this, Activity_11::class.java)
            startActivity(intent)
        }

        act12.setOnClickListener {
            val intent = Intent(this, Activity_12::class.java)
            startActivity(intent)
        }

        act13.setOnClickListener {
            val intent = Intent(this, Activity_13::class.java)
            startActivity(intent)
        }

        act14.setOnClickListener {
            val intent = Intent(this, Activity_14::class.java)
            startActivity(intent)
        }
    }
}