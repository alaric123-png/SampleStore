package com.example.samplestore

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.buttonUpdate)
        val errorTextView = findViewById<TextView>(R.id.errorTextView)

        button.setOnClickListener {
            val inputText = editText.text.toString().trim()
            if (inputText.isNotEmpty()) {
                textView.text = inputText
                editText.text.clear()
                errorTextView.text = ""
                errorTextView.visibility = TextView.GONE

            } else {
                errorTextView.text = getString(R.string.error_empty_field)
                errorTextView.visibility = TextView.VISIBLE
            }
        }
    }
}