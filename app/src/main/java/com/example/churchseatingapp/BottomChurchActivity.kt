package com.example.churchseatingapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BottomChurchActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_church)
        title = "Bottom Church"

        var btn1: Button = findViewById(R.id.ad)
        btn1.setOnClickListener {
            var intent = Intent(this, AdminActivity::class.java)
            startActivity(intent)
        }

        var btn2: Button = findViewById(R.id.mnl)
        btn2.setOnClickListener {
            var intent = Intent(this, MenLeftActivity1::class.java)
            startActivity(intent)
        }

        var btn3 = findViewById<Button>(R.id.mnc)
        btn3.setOnClickListener {

            var int = Intent(this, MenCenterActivity::class.java)
            startActivity(int)
        }

        var btn4 = findViewById<Button>(R.id.womenc)
        btn4.setOnClickListener {
            var int2 = Intent(this, WomenCenterActivity1::class.java)
            startActivity(int2)
        }

        var btn5 : Button = findViewById(R.id.womenr)
        btn5.setOnClickListener {
            var  i = Intent( this , WomenRightActivity1::class.java)
            startActivity(i)
        }

    }
}