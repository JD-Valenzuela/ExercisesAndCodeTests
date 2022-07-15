package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private fun diceRoll() {
        val dice = Dice(6)
        val diceRoll =  dice.roll()
        val textviewResult: TextView = findViewById(R.id.textView)
        textviewResult.text = diceRoll.toString()
    }

    class Dice(val diceSides: Int){
        fun roll(): Int {
            return (1..diceSides).random()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceRollButton: Button = findViewById(R.id.button)

        diceRollButton.setOnClickListener {
            diceRoll()
        }
    }
}
