package com.example.samplestore

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameField: EditText = findViewById(R.id.username)
        val passwordField: EditText = findViewById(R.id.password)
        val loginButton: Button = findViewById(R.id.login_button)
        val errorTextView: TextView = findViewById(R.id.error_message)

        loginButton.setOnClickListener {
            val username = usernameField.text.toString()
            val password = passwordField.text.toString()

            if (username == "Espresso" && password == "Prueba") {
                // Login exitoso, ocultar mensaje de error si está visible
                errorTextView.visibility = View.GONE
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            } else {
                // Mostrar mensaje de error
                errorTextView.text = getString(R.string.error_login)
                errorTextView.visibility = View.VISIBLE
            }
        }
    }
}
