package com.example.churchseatingapp

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.churchseatingapp.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase


open class MenLeftActivity1 : AppCompatActivity() {
    var counter = 0
    var counter2 = 0
    var counter3 = 0
    var counter4 = 0
    var counter5 = 0
    var counter6 = 0
    var counter7 = 0
    var counter8 = 0
    var counter9 = 0
    var counter10 = 0
    var counter11 = 0
    var counter12 = 0
    var counter13 = 0
    var counter14 = 0
    var counter15 = 0
    var counter16 = 0
    var counter17 = 0
    var counter18 = 0
    var counter19 = 0
    var counter20 = 0
    var counter21 = 0
    var counter22 = 0
    var counter23 = 0
    var counter24 = 0
    var counter25 = 0
    var counter26 = 0
    var counter27 = 0
    var counter28 = 0
    var counter29 = 0
    var counter30 = 0
    var counter31 = 0
    var counter32 = 0
    var counter33 = 0
    var counter34 = 0
    var counter35 = 0
    var counter36 = 0
    var counter37 = 0
    var counter38 = 0
    var counter39 = 0
    var counter40 = 0
    var counter41 = 0
    var counter42 = 0
    var counter43 = 0
    var counter44 = 0
    var counter45 = 0
    var counter46 = 0
    var counter47 = 0
    var counter48 = 0
    var counter49 = 0
    var counter50 = 0
    var counter51 = 0
    var counter52 = 0
    var counter53 = 0
    var counter54 = 0
    var counter55 = 0
    var counter56 = 0
    var counter57 = 0
    var counter58 = 0
    var counter59 = 0
    var counter60 = 0
    var counter61 = 0
    var counter62 = 0
    var counter63 = 0
    var counter64 = 0
    var counter65 = 0
    var counter66 = 0
    var counter67 = 0


    private var db = FirebaseDatabase.getInstance()
    private var root : DatabaseReference = db.getReference().child("Bottom church").child("Men Left")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_men_left1)


        var available_number = 64;
        var taken_number = 0;

        var text = findViewById<TextView>(R.id.Available)
        var text2 = findViewById<TextView>(R.id.Taken)

        var btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {


            if (counter % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                root.child("Seat 1").setValue(true)
                btn1.setBackgroundColor(Color.RED)

                ++counter

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()
                root.child("Seat 1").setValue(false)
                btn1.setBackgroundColor(Color.WHITE)

                ++counter


            }

        }

        var btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            if (counter2 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn2.setBackgroundColor(Color.RED)

                ++counter2

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn2.setBackgroundColor(Color.WHITE)

                ++counter2


            }
        }

        var btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {
            if (counter3 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn3.setBackgroundColor(Color.RED)

                ++counter3

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn3.setBackgroundColor(Color.WHITE)

                ++counter3


            }
        }

        var btn4: Button = findViewById(R.id.btn4)
        btn4.setOnClickListener {
            if (counter4 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn4.setBackgroundColor(Color.RED)

                ++counter4

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn4.setBackgroundColor(Color.WHITE)

                ++counter4


            }
        }

        var btn5: Button = findViewById(R.id.btn5)
        btn5.setOnClickListener {
            if (counter5 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn5.setBackgroundColor(Color.RED)

                ++counter5

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn5.setBackgroundColor(Color.WHITE)

                ++counter5


            }
        }

        var btn6 = findViewById<Button>(R.id.btn6)
        btn6.setOnClickListener {
            if (counter6 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn6.setBackgroundColor(Color.RED)

                ++counter6

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn6.setBackgroundColor(Color.WHITE)

                ++counter6


            }
        }

        var btn7: Button = findViewById(R.id.btn7)
        btn7.setOnClickListener {
            if (counter7 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn7.setBackgroundColor(Color.RED)

                ++counter7

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn7.setBackgroundColor(Color.WHITE)

                ++counter7


            }
        }

        var btn8: Button = findViewById(R.id.btn8)
        btn8.setOnClickListener {
            if (counter8 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn8.setBackgroundColor(Color.RED)

                ++counter8

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn8.setBackgroundColor(Color.WHITE)

                ++counter8


            }
        }

        var btn9: Button = findViewById(R.id.btn9)
        btn9.setOnClickListener {
            if (counter9 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn9.setBackgroundColor(Color.RED)

                ++counter9

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn9.setBackgroundColor(Color.WHITE)

                ++counter9


            }
        }

        var btn10 = findViewById<Button>(R.id.btn10)
        btn10.setOnClickListener {
            if (counter10 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn10.setBackgroundColor(Color.RED)

                ++counter10

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn10.setBackgroundColor(Color.WHITE)

                ++counter10


            }
        }

        var btn11 = findViewById<Button>(R.id.btn11)
        btn11.setOnClickListener {
            if (counter11 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn11.setBackgroundColor(Color.RED)

                ++counter11

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn11.setBackgroundColor(Color.WHITE)

                ++counter11


            }
        }

        var btn12 = findViewById<Button>(R.id.btn12)
        btn12.setOnClickListener {
            if (counter12 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn12.setBackgroundColor(Color.RED)

                ++counter12

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn12.setBackgroundColor(Color.WHITE)

                ++counter12


            }
        }

        var btn13 = findViewById<Button>(R.id.btn13)
        btn13.setOnClickListener {
            if (counter13 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn13.setBackgroundColor(Color.RED)

                ++counter13

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn13.setBackgroundColor(Color.WHITE)

                ++counter13


            }
        }

        var btn14 = findViewById<Button>(R.id.btn14)
        btn14.setOnClickListener {
            if (counter14 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn14.setBackgroundColor(Color.RED)

                ++counter14

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn14.setBackgroundColor(Color.WHITE)

                ++counter14


            }
        }

        var btn15 = findViewById<Button>(R.id.btn15)
        btn15.setOnClickListener {
            if (counter15 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn15.setBackgroundColor(Color.RED)

                ++counter15

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn15.setBackgroundColor(Color.WHITE)

                ++counter15


            }
        }

        var btn16 = findViewById<Button>(R.id.btn16)
        btn16.setOnClickListener {
            if (counter16 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn16.setBackgroundColor(Color.RED)

                ++counter16

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn16.setBackgroundColor(Color.WHITE)

                ++counter16


            }
        }

        var btn17 = findViewById<Button>(R.id.btn17)
        btn17.setOnClickListener {
            if (counter17 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn17.setBackgroundColor(Color.RED)

                ++counter17

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn17.setBackgroundColor(Color.WHITE)

                ++counter17


            }
        }

        var btn18 = findViewById<Button>(R.id.btn18)
        btn18.setOnClickListener {
            if (counter18 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn18.setBackgroundColor(Color.RED)

                ++counter18

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn18.setBackgroundColor(Color.WHITE)

                ++counter18


            }
        }

        var btn19 = findViewById<Button>(R.id.btn19)
        btn19.setOnClickListener {
            if (counter19 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn19.setBackgroundColor(Color.RED)

                ++counter19

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn19.setBackgroundColor(Color.WHITE)

                ++counter19


            }
        }

        var btn20 = findViewById<Button>(R.id.btn20)
        btn20.setOnClickListener {
            if (counter20 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn20.setBackgroundColor(Color.RED)

                ++counter20

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn20.setBackgroundColor(Color.WHITE)

                ++counter20


            }
        }

        var btn21 = findViewById<Button>(R.id.btn21)
        btn21.setOnClickListener {
            if (counter21 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn21.setBackgroundColor(Color.RED)

                ++counter21

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn21.setBackgroundColor(Color.WHITE)

                ++counter21


            }
        }

        var btn22 = findViewById<Button>(R.id.btn22)
        btn22.setOnClickListener {
            if (counter22 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn22.setBackgroundColor(Color.RED)

                ++counter22

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn22.setBackgroundColor(Color.WHITE)

                ++counter22


            }
        }

        var btn23 = findViewById<Button>(R.id.btn23)
        btn23.setOnClickListener {
            if (counter23 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn23.setBackgroundColor(Color.RED)

                ++counter23

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn23.setBackgroundColor(Color.WHITE)

                ++counter23


            }
        }

        var btn24 = findViewById<Button>(R.id.btn24)
        btn24.setOnClickListener {
            if (counter24 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn24.setBackgroundColor(Color.RED)

                ++counter24

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn24.setBackgroundColor(Color.WHITE)

                ++counter24


            }
        }


        var btn25 = findViewById<Button>(R.id.btn25)
        btn25.setOnClickListener {
            if (counter25 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn25.setBackgroundColor(Color.RED)

                ++counter25

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn25.setBackgroundColor(Color.WHITE)

                ++counter25


            }
        }

        var btn26 = findViewById<Button>(R.id.btn26)
        btn26.setOnClickListener {
            if (counter26 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn26.setBackgroundColor(Color.RED)

                ++counter26

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn26.setBackgroundColor(Color.WHITE)

                ++counter26


            }
        }


        var btn27 = findViewById<Button>(R.id.btn27)
        btn27.setOnClickListener {
            if (counter27 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn27.setBackgroundColor(Color.RED)

                ++counter27

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn27.setBackgroundColor(Color.WHITE)

                ++counter27


            }
        }


        var btn28 = findViewById<Button>(R.id.btn28)
        btn28.setOnClickListener {
            if (counter28 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn28.setBackgroundColor(Color.RED)

                ++counter28

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn28.setBackgroundColor(Color.WHITE)

                ++counter28


            }
        }

        var btn29 = findViewById<Button>(R.id.btn29)
        btn29.setOnClickListener {
            if (counter29 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn29.setBackgroundColor(Color.RED)

                ++counter29

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn29.setBackgroundColor(Color.WHITE)

                ++counter29


            }
        }

        var btn30 = findViewById<Button>(R.id.btn30)
        btn30.setOnClickListener {
            if (counter30 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn30.setBackgroundColor(Color.RED)

                ++counter30

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn30.setBackgroundColor(Color.WHITE)

                ++counter30


            }
        }

        var btn31 = findViewById<Button>(R.id.btn31)
        btn31.setOnClickListener {
            if (counter31 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn31.setBackgroundColor(Color.RED)

                ++counter31

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn31.setBackgroundColor(Color.WHITE)

                ++counter31


            }
        }

        var btn32 = findViewById<Button>(R.id.btn32)
        btn32.setOnClickListener {
            if (counter32 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn32.setBackgroundColor(Color.RED)

                ++counter32

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn32.setBackgroundColor(Color.WHITE)

                ++counter32


            }
        }

        var btn33 = findViewById<Button>(R.id.btn33)
        btn33.setOnClickListener {
            if (counter33 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn33.setBackgroundColor(Color.RED)

                ++counter33

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn33.setBackgroundColor(Color.WHITE)

                ++counter33


            }
        }

        var btn34 = findViewById<Button>(R.id.btn34)
        btn34.setOnClickListener {
            if (counter34 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn34.setBackgroundColor(Color.RED)

                ++counter34

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn34.setBackgroundColor(Color.WHITE)

                ++counter34


            }
        }

        var btn35 = findViewById<Button>(R.id.btn35)
        btn35.setOnClickListener {
            if (counter35 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn35.setBackgroundColor(Color.RED)

                ++counter35

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn35.setBackgroundColor(Color.WHITE)

                ++counter35


            }
        }

        var btn36 = findViewById<Button>(R.id.btn36)
        btn36.setOnClickListener {
            if (counter36 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn36.setBackgroundColor(Color.RED)

                ++counter36

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn36.setBackgroundColor(Color.WHITE)

                ++counter36


            }
        }

        var btn37 = findViewById<Button>(R.id.btn37)
        btn37.setOnClickListener {
            if (counter37 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn37.setBackgroundColor(Color.RED)

                ++counter37

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn37.setBackgroundColor(Color.WHITE)

                ++counter37


            }
        }

        var btn38 = findViewById<Button>(R.id.btn38)
        btn38.setOnClickListener {
            if (counter38 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn38.setBackgroundColor(Color.RED)

                ++counter38

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn38.setBackgroundColor(Color.WHITE)

                ++counter38


            }
        }

        var btn39 = findViewById<Button>(R.id.btn39)
        btn39.setOnClickListener {
            if (counter39 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn39.setBackgroundColor(Color.RED)

                ++counter39

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn39.setBackgroundColor(Color.WHITE)

                ++counter39


            }
        }

        var btn40: Button = findViewById(R.id.btn40)
        btn40.setOnClickListener {
            if (counter40 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn40.setBackgroundColor(Color.RED)

                ++counter40

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn40.setBackgroundColor(Color.WHITE)

                ++counter40


            }
        }

        var btn41: Button = findViewById(R.id.btn41)
        btn41.setOnClickListener {
            if (counter41 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn41.setBackgroundColor(Color.RED)

                ++counter41

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn41.setBackgroundColor(Color.WHITE)

                ++counter41


            }
        }

        var btn42: Button = findViewById(R.id.btn42)
        btn42.setOnClickListener {
            if (counter42 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn42.setBackgroundColor(Color.RED)

                ++counter42

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn42.setBackgroundColor(Color.WHITE)

                ++counter42


            }
        }

        var btn43: Button = findViewById(R.id.btn43)
        btn43.setOnClickListener {
            if (counter43 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn43.setBackgroundColor(Color.RED)

                ++counter43

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn43.setBackgroundColor(Color.WHITE)

                ++counter43


            }
        }

        var btn44: Button = findViewById(R.id.btn44)
        btn44.setOnClickListener {
            if (counter44 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn44.setBackgroundColor(Color.RED)

                ++counter44

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn44.setBackgroundColor(Color.WHITE)

                ++counter44


            }
        }

        var btn45: Button = findViewById(R.id.btn45)
        btn45.setOnClickListener {
            if (counter45 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn45.setBackgroundColor(Color.RED)

                ++counter45

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn45.setBackgroundColor(Color.WHITE)

                ++counter45


            }
        }

        var btn46: Button = findViewById(R.id.btn46)
        btn46.setOnClickListener {
            if (counter46 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn46.setBackgroundColor(Color.RED)

                ++counter46

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn46.setBackgroundColor(Color.WHITE)

                ++counter46


            }
        }

        var btn47: Button = findViewById(R.id.btn47)
        btn47.setOnClickListener {
            if (counter47 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn47.setBackgroundColor(Color.RED)

                ++counter47

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn47.setBackgroundColor(Color.WHITE)

                ++counter47


            }
        }

        var btn48: Button = findViewById(R.id.btn48)
        btn48.setOnClickListener {
            if (counter48 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn48.setBackgroundColor(Color.RED)

                ++counter48

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn48.setBackgroundColor(Color.WHITE)

                ++counter48


            }
        }

        var btn49: Button = findViewById(R.id.btn49)
        btn49.setOnClickListener {
            if (counter49 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn49.setBackgroundColor(Color.RED)

                ++counter49

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn49.setBackgroundColor(Color.WHITE)

                ++counter49


            }
        }

        var btn50: Button = findViewById(R.id.btn50)
        btn50.setOnClickListener {
            if (counter50 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn50.setBackgroundColor(Color.RED)

                ++counter50

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn50.setBackgroundColor(Color.WHITE)

                ++counter50


            }
        }

        var btn51: Button = findViewById(R.id.btn51)
        btn51.setOnClickListener {
            if (counter51 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn51.setBackgroundColor(Color.RED)

                ++counter51

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn51.setBackgroundColor(Color.WHITE)

                ++counter51


            }
        }

        var btn52: Button = findViewById(R.id.btn52)
        btn52.setOnClickListener {
            if (counter52 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn52.setBackgroundColor(Color.RED)

                ++counter52

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn52.setBackgroundColor(Color.WHITE)

                ++counter52


            }
        }

        var btn53: Button = findViewById(R.id.btn53)
        btn53.setOnClickListener {
            if (counter53 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn53.setBackgroundColor(Color.RED)

                ++counter53

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn53.setBackgroundColor(Color.WHITE)

                ++counter53


            }
        }

        var btn54: Button = findViewById(R.id.btn54)
        btn54.setOnClickListener {
            if (counter54 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn54.setBackgroundColor(Color.RED)

                ++counter54

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn54.setBackgroundColor(Color.WHITE)

                ++counter54


            }
        }

        var btn55: Button = findViewById(R.id.btn55)
        btn55.setOnClickListener {
            if (counter55 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn55.setBackgroundColor(Color.RED)

                ++counter55

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn55.setBackgroundColor(Color.WHITE)

                ++counter55


            }
        }

        var btn56: Button = findViewById(R.id.btn56)
        btn56.setOnClickListener {
            if (counter56 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn56.setBackgroundColor(Color.RED)

                ++counter56

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn56.setBackgroundColor(Color.WHITE)

                ++counter56


            }
        }

        var btn57: Button = findViewById(R.id.btn57)
        btn57.setOnClickListener {
            if (counter57 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn57.setBackgroundColor(Color.RED)

                ++counter57

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn57.setBackgroundColor(Color.WHITE)

                ++counter57


            }
        }

        var btn58: Button = findViewById(R.id.btn58)
        btn58.setOnClickListener {
            if (counter58 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn58.setBackgroundColor(Color.RED)

                ++counter58

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn58.setBackgroundColor(Color.WHITE)

                ++counter58


            }
        }


        var btn59: Button = findViewById(R.id.btn59)
        btn59.setOnClickListener {
            if (counter59 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn59.setBackgroundColor(Color.RED)

                ++counter59

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn59.setBackgroundColor(Color.WHITE)

                ++counter59


            }
        }

        var btn60: Button = findViewById(R.id.btn60)
        btn60.setOnClickListener {
            if (counter60 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn60.setBackgroundColor(Color.RED)

                ++counter60

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn60.setBackgroundColor(Color.WHITE)

                ++counter60


            }
        }

        var btn61: Button = findViewById(R.id.btn61)
        btn61.setOnClickListener {
            if (counter61 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn61.setBackgroundColor(Color.RED)

                ++counter61

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn61.setBackgroundColor(Color.WHITE)

                ++counter61


            }
        }

        var btn62: Button = findViewById(R.id.btn62)
        btn62.setOnClickListener {
            if (counter62 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn62.setBackgroundColor(Color.RED)

                ++counter62

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn62.setBackgroundColor(Color.WHITE)

                ++counter62


            }
        }

        var btn63: Button = findViewById(R.id.btn63)
        btn63.setOnClickListener {
            if (counter63 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn63.setBackgroundColor(Color.RED)

                ++counter63

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn63.setBackgroundColor(Color.WHITE)

                ++counter63


            }
        }

        var btn64: Button = findViewById(R.id.btn64)
        btn64.setOnClickListener {
            if (counter64 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn64.setBackgroundColor(Color.RED)

                ++counter64

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn64.setBackgroundColor(Color.WHITE)

                ++counter64


            }
        }

        var btn65: Button = findViewById(R.id.btn65)
        btn65.setOnClickListener {
            if (counter65 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn65.setBackgroundColor(Color.RED)

                ++counter65

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn65.setBackgroundColor(Color.WHITE)

                ++counter65


            }
        }

        var btn66: Button = findViewById(R.id.btn66)
        btn66.setOnClickListener {
            if (counter66 % 2 == 0) {

                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn66.setBackgroundColor(Color.RED)

                ++counter66

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn66.setBackgroundColor(Color.GRAY)

                ++counter66


            }
        }

        var btn67: Button = findViewById(R.id.btn67)
        btn67.setOnClickListener {



            if (counter67 % 2 == 0) {


                available_number--
                taken_number++
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn67.setBackgroundColor(Color.RED)

                ++counter67

            } else {

                available_number++
                taken_number--
                text.text = available_number.toString()
                text2.text = taken_number.toString()

                btn67.setBackgroundColor(Color.WHITE)


                ++counter67


            }
        }



        }

    }
