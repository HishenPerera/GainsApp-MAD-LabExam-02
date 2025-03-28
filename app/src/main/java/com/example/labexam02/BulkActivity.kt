package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class BulkActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bulk)

        val backButton: ImageView = findViewById(R.id.BBackBtn)
        backButton.setOnClickListener {
            val intent = Intent(this, WorkTypesActivity::class.java)
            startActivity(intent)
        }

        val ratingBar: RatingBar = findViewById(R.id.ratebarbulk) // Find the RatingBar

        ratingBar.setOnRatingBarChangeListener { _, rating, fromUser ->
            if (fromUser) { // Ensure the change was from the user, not programmatically
                // Show alert dialog
                AlertDialog.Builder(this)
                    .setTitle("Bulking Schedule Rating Added")
                    .setMessage("Your rating has been successfully added.")
                    .setPositiveButton("OK") { dialog, _ ->
                        dialog.dismiss()
                        // Navigate to WorkTypesActivity after dismissing the dialog
                        val intent = Intent(this, WorkTypesActivity::class.java)
                        startActivity(intent)
                    }
                    .show()
            }
        }
    }
}