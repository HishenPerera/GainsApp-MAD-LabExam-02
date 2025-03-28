package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val backLink: ImageView = findViewById(R.id.backBtn)
        backLink.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val registerButton: Button = findViewById(R.id.regBtn)
        registerButton.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Registration Successful")
                .setMessage("You have successfully registered to Gains!")
                .setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                .show()
        }
    }
}