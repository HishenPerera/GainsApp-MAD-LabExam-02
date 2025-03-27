package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button // This import is not needed, you're using an ImageView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class WorkTypesActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worktypes)

        val backButton: ImageView = findViewById(R.id.backWTBtn)
        backButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}