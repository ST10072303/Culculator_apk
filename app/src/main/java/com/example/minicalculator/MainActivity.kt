package com.example.minicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Establishing variables

        //User interaction
        var input1 = findViewById<EditText>(R.id.input1)
        var input2 = findViewById<EditText>(R.id.input2)
        var add = findViewById<Button>(R.id.btnAdd)
        var sub = findViewById<Button>(R.id.btnSub)
        var multiply = findViewById<Button>(R.id.btnMult)
        var divide = findViewById<Button>(R.id.btnDiv)


        //Displays

        var result = findViewById<TextView>(R.id.resultDisplay)



        //Button functions

        add.setOnClickListener{
            //code for addition
            var answer= input1.text.toString().toInt() + input2.text.toString().toInt()

            //code for moving to display
            result.text = input1.text.toString().plus("+")
                .plus(input2.text.toString()).plus("=")
                .plus(answer)


        }
        sub.setOnClickListener {
            //code for subtraction
            var answer = input1.text.toString().toInt() - input2.text.toString().toInt()

            //code for moving to display
            result.text = input1.text.toString().plus("-")
                .plus(input2.text.toString()).plus("=")
                .plus(answer)


        }

        multiply.setOnClickListener{
            //code for multiplication
            var answer = input1.text.toString().toInt() * input2.text.toString().toInt()

            //code for moving to display
            result.text = input1.text.toString().plus("x")
                .plus(input2.text.toString()).plus("=")
                .plus(answer)

        }

        divide.setOnClickListener{
            //code for division
            var answer = input1.text.toString().toInt() / input2.text.toString().toInt()

            //code for moving to display
            result.text = input1.text.toString().plus("÷")
                .plus(input2.text.toString()).plus("=")
                .plus(answer)

        }
    }
}