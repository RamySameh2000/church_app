package com.example.churchseatingapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.c1btn)
        btn.setOnClickListener {
            val intent = Intent(this, TopChurchActivity::class.java)
            startActivity(intent)
        }


        val btn2 = findViewById<Button>(R.id.c2btn)
        btn2.setOnClickListener {
            val i = Intent(this, BottomChurchActivity::class.java)
            startActivity(i)
        }



    }
}