package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

// AppCompatActivity is a Kotlin subclass of Android that provides, and should
// always be extended by any custom Activities in order to support the max
// number of Android OS's.
class MainActivity : AppCompatActivity() {
    // lateinit is a promise that we will not set it to null.
    lateinit var diceImage: ImageView

    // Android apps don't have a "main" method. Instead, the main activity is
    // defined in the activity's manifest XML file.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roleButton: Button = findViewById(R.id.role_button)
        roleButton.setOnClickListener {
            rollDice()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}
