package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var first: Double = 0.00
    var math: Int = 0
    var put: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        zero.setOnClickListener {
            if (show.text.toString() == "0" && put == 0) {
                show.setText("0")
            } else if (put == 1) {
                show.setText("")
                put = 0
                show.setText("0")
            } else {
                var number = show.text.toString().plus(0)
                show.setText(number)
            }
        }
        one.setOnClickListener {
            if (show.text.toString() == "0" && put == 0) {
                show.setText("1")
            } else if (put == 1) {
                show.setText("")
                put = 0
                show.setText("1")
            } else {
                var number = show.text.toString().plus(1)
                show.setText(number)
            }
        }
        two.setOnClickListener {
            if (show.text.toString() == "0" && put == 0) {
                show.setText("2")
            } else if (put == 1) {
                show.setText("")
                put = 0
                show.setText("2")
            } else {
                var number = show.text.toString().plus(2)
                show.setText(number)
            }
        }
        three.setOnClickListener {
            if (show.text.toString() == "0" && put == 0) {
                show.setText("3")
            } else if (put == 1) {
                show.setText("")
                put = 0
                show.setText("3")
            } else {
                var number = show.text.toString().plus(3)
                show.setText(number)
            }
        }
        four.setOnClickListener {
            if (show.text.toString() == "0" && put == 0) {
                show.setText("4")
            } else if (put == 1) {
                show.setText("")
                put = 0
                show.setText("4")
            } else {
                var number = show.text.toString().plus(4)
                show.setText(number)
            }
        }
        five.setOnClickListener {
            if (show.text.toString() == "0" && put == 0) {
                show.setText("5")
            } else if (put == 1) {
                show.setText("")
                put = 0
                show.setText("5")
            } else {
                var number = show.text.toString().plus(5)
                show.setText(number)
            }
        }
        six.setOnClickListener {
            if (show.text.toString() == "0" && put == 0) {
                show.setText("6")
            } else if (put == 1) {
                show.setText("")
                put = 0
                show.setText("6")
            } else {
                var number = show.text.toString().plus(6)
                show.setText(number)
            }
        }
        seven.setOnClickListener {
            if (show.text.toString() == "0" && put == 0) {
                show.setText("7")
            } else if (put == 1) {
                show.setText("")
                put = 0
                show.setText("7")
            } else {
                var number = show.text.toString().plus(7)
                show.setText(number)
            }
        }
        eight.setOnClickListener {
            if (show.text.toString() == "0" && put == 0) {
                show.setText("8")
            } else if (put == 1) {
                show.setText("")
                put = 0
                show.setText("8")
            } else {
                var number = show.text.toString().plus(8)
                show.setText(number)
            }
        }
        nine.setOnClickListener {
            if (show.text.toString() == "0" && put == 0) {
                show.setText("9")
            } else if (put == 1) {
                show.setText("")
                put = 0
                show.setText("9")
            } else {
                var number = show.text.toString().plus(9)
                show.setText(number)
            }
        }
        btnclear.setOnClickListener {
            show.setText("0")
            first = 0.00
            math = 0
            put = 0
        }
        btndelete.setOnClickListener {
            if (show.text.toString().length <= 1) {
                show.setText("0")
            } else if (show.text.isNotEmpty()) {
                show.text = show.text.dropLast(1)
            }
        }
        btnplus.setOnClickListener {
            if (show.text.toString() > "0") {
                var number = show.text.toString().toDouble()
                first = first + number
                math = 1
                put = 1
            }
        }
        btnminus.setOnClickListener {
            if (show.text.toString() > "0" ) {
                var number = show.text.toString().toDouble()
                first = first + number
                math = 2
                put = 1
            }
        }
        btnmul.setOnClickListener {
            if (show.text.toString() > "0") {
                var number = show.text.toString().toDouble()
                first = first + number
                math = 3
                put = 1
            }
        }
        btndivide.setOnClickListener {
            if (show.text.toString() > "0") {
                var number = show.text.toString().toDouble()
                first = first + number
                math = 4
                put = 1
            }
        }
        btnmod.setOnClickListener {
            if (show.text.toString() > "0") {
                var number = show.text.toString().toDouble()
                first = first + number
                math = 5
                put = 1
            }
        }
        btnresult.setOnClickListener {
            if (show.text.toString() > "0") {
            }
            if (math == 1) {
                var number = show.text.toString().toDouble()
                first = first + number
                show.setText("$first")
            } else if (math == 2) {
                var number = show.text.toString().toDouble()
                first = first - number
                show.setText("$first")
            } else if (math == 3) {
                var number = show.text.toString().toDouble()
                first = first * number
                show.setText("$first")
            } else if (math == 4) {
                var number = show.text.toString().toDouble()
                if (number == 0.00) {
                    show.setText("Error")
                } else {
                    first = first / number
                    show.setText("$first")
                }
            } else if (math == 5) {
                var number = show.text.toString().toDouble()
                if (number == 0.00) {
                    show.setText("Error")
                } else {
                    first = first % number
                    show.setText("$first")
                }
            }
        }
    }
}


