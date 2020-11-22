package com.uan.mydatingapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.uan.mydatingapp.R

class ResumeProfileLayout: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.resume_profile_layout)

        val btnProfileDetails = findViewById<ImageButton>(R.id.pl_imagebtn)

        btnProfileDetails.setOnClickListener {
            val i = Intent(this@ResumeProfileLayout, ActivityProfileRating::class.java)
            startActivity(i)
        }
    }
}