package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button // Import Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class UserProfileActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userprofile)

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

        val editButton: ImageView = findViewById(R.id.editBtn)
        editButton.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

        val logoutButton: Button = findViewById(R.id.logoutBtn)
        logoutButton.setOnClickListener {
            // Show logout confirmation dialog
            AlertDialog.Builder(this)
                .setTitle("Logout")
                .setMessage("Are you sure you want to logout?")
                .setPositiveButton("Yes") { dialog, _ ->
                    dialog.dismiss()
                    // Navigate to LoginActivity after logout
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                    finish() // Close the current activity
                }
                .setNegativeButton("No") { dialog, _ ->
                    dialog.dismiss()
                }
                .show()
        }
    }
}