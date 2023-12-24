package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.clickButton)
        button.setOnClickListener {
            Log.v("BUTTON", "Button has been clicked")
            Toast.makeText(this, "Hi! How are you doing?", Toast.LENGTH_LONG).show()
        }
    }
}