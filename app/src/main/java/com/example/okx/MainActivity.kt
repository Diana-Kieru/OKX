package com.example.okx

import android.graphics.Paint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Find the TextView
        findViewById<TextView>(R.id.tvHelpText)?.apply {
            paintFlags = paintFlags or Paint.UNDERLINE_TEXT_FLAG
        }
    }
}