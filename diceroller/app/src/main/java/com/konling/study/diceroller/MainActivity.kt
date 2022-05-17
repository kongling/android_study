package com.konling.study.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollbutton: Button = findViewById(R.id.roll_button)
        rollbutton.setOnClickListener { rollDice() }

    }

    private fun rollDice() {
        var randomInt = (1 .. 6).random();
        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show();
        var resultText : TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

    }
}