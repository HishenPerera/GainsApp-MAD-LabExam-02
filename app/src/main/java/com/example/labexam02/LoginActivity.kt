package com.example.labexam02

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton: Button = findViewById(R.id.loginBtn)
        loginButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            AlertDialog.Builder(this)
                .setTitle("Login Successful")
                .setMessage("You have successfully login to Gains!")
                .setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                .show()
        }

        val registerLink: TextView = findViewById(R.id.regLink)
        registerLink.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}