package com.uan.mydatingapp.ui

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.uan.mydatingapp.R

class ActivityProfileRating : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_rating)

        val ratingBar = findViewById<RatingBar>(R.id.pr_ratingBar)

        val btnBack = findViewById<Button>(R.id.btn_bck_overview)
        //val title = findViewById<TextView>(R.id.story_title)
        //val storyTextView = findViewById<TextInputEditText>(R.id.story_text_content)

        val bundle = intent.extras

        if (bundle != null) {
            //title.text = bundle.getString("storyTitle")
            //var story = bundle.getString("storyContent")

            //storyTextView.setText(story)
        }

        ratingBar.setOnRatingBarChangeListener(object : RatingBar.OnRatingBarChangeListener {
            override fun onRatingChanged(p0: RatingBar?, p1: Float, p2: Boolean) {
                Toast.makeText(this@ActivityProfileRating, "You rated : $p1 on this user", Toast.LENGTH_SHORT).show()
            }
        })

        btnBack.setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }
    }
}