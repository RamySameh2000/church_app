package com.example.churchseatingapp

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MenCenterActivity : AppCompatActivity() {
    var counte = 0
    var counter68 = 0
    var counter69 = 0
    var counter70 = 0
    var counter71 = 0
    var counter72 = 0
    var counter73 = 0
    var counter74 = 0
    var counter75 = 0
    var counter76 = 0
    var counter77 = 0
    var counter78 = 0
    var counter79 = 0
    var counter80 = 0
    var counter81 = 0
    var counter82 = 0
    var counter83 = 0
    var counter84 = 0
    var counter85 = 0
    var counter86 = 0
    var counter87 = 0
    var counter88 = 0
    var counter89 = 0
    var counter90 = 0


    private var db2 = FirebaseDatabase.getInstance()
    private var root2: DatabaseReference =
        db2.getReference().child("Bottom church").child("Men Center")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_men_center)
        var available_number2 = 36;
        var taken_number2 = 0;
        var text3 = findViewById<TextView>(R.id.av2)
        var text4 = findViewById<TextView>(R.id.ta2)

        var btn68: Button = findViewById(R.id.btn68)
        btn68.setOnClickListener {


            if (counter68 % 2 == 0) {
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                root2.child("Seat1").setValue(true)
                btn68.setBackgroundColor(Color.RED)

                ++counter68
            } else {
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()
                root2.child("Seat1").setValue(false)
                btn68.setBackgroundColor(Color.WHITE)
                ++counter68
            }
        }

        var btn69: Button = findViewById(R.id.btn69)
        btn69.setOnClickListener {
            if (counter69 % 2 == 0) {
                root2.child("Seat2").setValue(true)
                btn69.setBackgroundColor(Color.RED)
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter69
            } else {
                root2.child("Seat2").setValue(false)
                btn69.setBackgroundColor(Color.WHITE)
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()
                ++counter69
            }

        }

        var btn70: Button = findViewById(R.id.btn70)
        btn70.setOnClickListener {
            if (counter70 % 2 == 0) {
                root2.child("Seat3").setValue(true)
                btn70.setBackgroundColor(Color.RED)
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter70
            } else {
                root2.child("Seat3").setValue(false)
                btn70.setBackgroundColor(Color.WHITE)
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()
                ++counter70
            }
        }

        var btn71: Button = findViewById(R.id.btn71)
        btn71.setOnClickListener {
            if (counter71 % 2 == 0) {
                root2.child("Seat4").setValue(true)
                btn71.setBackgroundColor(Color.RED)
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter71
            } else {
                root2.child("Seat4").setValue(false)
                btn71.setBackgroundColor(Color.WHITE)
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()
                ++counter71
            }
        }
        var btn72: Button = findViewById(R.id.btn72)
        btn72.setOnClickListener {
            if (counter72 % 2 == 0) {
                root2.child("Seat5").setValue(true)
                btn72.setBackgroundColor(Color.RED)
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter72
            } else {
                root2.child("Seat5").setValue(false)
                btn72.setBackgroundColor(Color.WHITE)
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()
                ++counter72
            }
        }
        var btn73: Button = findViewById(R.id.btn73)
        btn73.setOnClickListener {
            if (counter73 % 2 == 0) {
                root2.child("Seat6").setValue(true)
                btn73.setBackgroundColor(Color.RED)
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter73
            } else {
                root2.child("Seat5").setValue(false)
                btn73.setBackgroundColor(Color.WHITE)
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()
                ++counter73
            }
        }
        var btn74: Button = findViewById(R.id.btn74)
        btn74.setOnClickListener {
            if (counter74 % 2 == 0) {
                root2.child("Seat6").setValue(true)
                btn74.setBackgroundColor(Color.RED)
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter74
            } else {
                root2.child("Seat6").setValue(false)
                btn74.setBackgroundColor(Color.WHITE)
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter74
            }
        }
        var btn75: Button = findViewById(R.id.btn75)
        btn75.setOnClickListener {
            if (counter75 % 2 == 0) {
                root2.child("Seat7").setValue(true)
                btn75.setBackgroundColor(Color.RED)
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter75
            } else {
                root2.child("Seat7").setValue(false)
                btn75.setBackgroundColor(Color.WHITE)
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()
                ++counter75
            }
        }


        var btn76: Button = findViewById(R.id.btn76)
        btn76.setOnClickListener {
            if (counter76 % 2 == 0) {
                root2.child("Seat7").setValue(true)
                btn76.setBackgroundColor(Color.RED)
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter76
            } else {
                root2.child("Seat7").setValue(false)
                btn76.setBackgroundColor(Color.WHITE)
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()
                ++counter76
            }
        }
        var btn77: Button = findViewById(R.id.btn77)
        btn77.setOnClickListener {
            if (counter77 % 2 == 0) {
                root2.child("Seat8").setValue(true)
                btn77.setBackgroundColor(Color.RED)
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter77
            } else {
                root2.child("Seat8").setValue(false)
                btn77.setBackgroundColor(Color.WHITE)
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()
                ++counter77
            }
        }
        var btn78: Button = findViewById(R.id.btn78)
        btn78.setOnClickListener {
            if (counter78 % 2 == 0) {
                root2.child("Seat9").setValue(true)
                btn78.setBackgroundColor(Color.RED)
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter78
            } else {
                root2.child("Seat9").setValue(false)
                btn78.setBackgroundColor(Color.WHITE)
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()
                ++counter78
            }
        }
        var btn79: Button = findViewById(R.id.btn79)
        btn79.setOnClickListener {
            if (counter79 % 2 == 0) {
                root2.child("Seat10").setValue(true)
                btn79.setBackgroundColor(Color.RED)
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter79
            } else {
                root2.child("Seat10").setValue(false)
                btn79.setBackgroundColor(Color.WHITE)
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()
                ++counter79
            }
        }
        var btn80: Button = findViewById(R.id.btn80)
        btn80.setOnClickListener {
            if (counter80 % 2 == 0) {
                root2.child("Seat11").setValue(true)
                btn80.setBackgroundColor(Color.RED)
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter80
            } else {
                root2.child("Seat11").setValue(false)
                btn80.setBackgroundColor(Color.WHITE)
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()
                ++counter80
            }
        }
        var btn81: Button = findViewById(R.id.btn81)
        btn81.setOnClickListener {
            if (counter81 % 2 == 0) {
                root2.child("Seat12").setValue(true)
                btn81.setBackgroundColor(Color.RED)
                available_number2--
                taken_number2++
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()

                ++counter81
            } else {
                root2.child("Seat12").setValue(false)
                btn81.setBackgroundColor(Color.WHITE)
                available_number2++
                taken_number2--
                text3.text = available_number2.toString()
                text4.text = taken_number2.toString()
                ++counter81
            }
        }

    }





}
