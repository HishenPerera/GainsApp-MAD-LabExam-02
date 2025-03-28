package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button // Import Button
import android.widget.ImageView

class NotificationActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        val navUser: ImageView = findViewById(R.id.navHomeUser)
        navUser.setOnClickListener {
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }

        val navWork: ImageView = findViewById(R.id.navHomeWork)
        navWork.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val navNoti: ImageView = findViewById(R.id.navHomeNoti)
        navNoti.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

    }
}