package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// AppCompatActivity is a Kotlin subclass of Android that provides, and should
// always be extended by any custom Activities in order to support the max
// number of Android OS's.
class MainActivity : AppCompatActivity() {
    // Android apps don't have a "main" method. Instead, the main activity is
    // defined in the activity's manifest XML file.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roleButton: Button = findViewById(R.id.role_button)
        roleButton.text = "Let's Roll"
    }
}
