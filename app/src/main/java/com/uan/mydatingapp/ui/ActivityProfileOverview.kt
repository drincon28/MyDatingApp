package com.uan.mydatingapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.uan.mydatingapp.R

class ActivityProfileOverview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profiles_overview)

        val btnProfileDetails = findViewById<ImageButton>(R.id.pl_imagebtn)

        btnProfileDetails.setOnClickListener {
            val i = Intent(this@ActivityProfileOverview, ActivityProfileRating::class.java)
            startActivity(i)
        }
    }
}