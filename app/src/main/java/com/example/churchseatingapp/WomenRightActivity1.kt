package com.example.churchseatingapp

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WomenRightActivity1 : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_women_right1)

        var btn60 = findViewById<Button>(R.id.btn60)
        btn60.setOnClickListener {
        if (counter % 2 == 0) {



            btn60.setBackgroundColor(Color.RED)

            ++counter

        } else {



            btn60.setBackgroundColor(Color.WHITE)

            ++counter


        }

    }
}}