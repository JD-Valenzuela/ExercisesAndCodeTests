package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // draws dice result to textView
    private fun diceRoll() {
        //calling dice class to roll a random number
        val dice = Dice(6)
        val diceRollCommand =  dice.roll()

        //dice image display
        val diceGraphic: ImageView =findViewById(R.id.imageView)
        when (diceRollCommand){
            1 -> diceGraphic.setImageResource(R.drawable.dice_1)
            2 -> diceGraphic.setImageResource(R.drawable.dice_2)
            3 -> diceGraphic.setImageResource(R.drawable.dice_3)
            4 -> diceGraphic.setImageResource(R.drawable.dice_4)
            5 -> diceGraphic.setImageResource(R.drawable.dice_5)
            6 -> diceGraphic.setImageResource(R.drawable.dice_6)
        }
    }

    //rolls die, throws result back to die roll
    class Dice(val diceSides: Int){
        fun roll(): Int {
            return (1..diceSides).random()
        }
    }

    // executed when app creates MainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //object creation for roll button
        val diceRollButton: Button = findViewById(R.id.button)

        //calls diceRoll function on button click
        diceRollButton.setOnClickListener {
            diceRoll()
        }
    }
}
