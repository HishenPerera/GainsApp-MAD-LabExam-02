package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class EditProfileActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofile)

        val backButton: ImageView = findViewById(R.id.backeditBtn)
        backButton.setOnClickListener {
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }

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

        val updateButton: Button = findViewById(R.id.updateBtn)
        updateButton.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Update Successful")
                .setMessage("Your profile details have been updated successfully.")
                .setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                    val intent = Intent(this, UserProfileActivity::class.java)
                    startActivity(intent)
                }
                .show()
        }
    }
}