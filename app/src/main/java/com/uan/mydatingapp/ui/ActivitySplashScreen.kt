package com.uan.mydatingapp.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.uan.mydatingapp.R

class ActivitySplashScreen : AppCompatActivity() {
    private val splashDur = 4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Looper.myLooper()?.let {
            Handler(it).postDelayed({
                val intent = Intent(this, ActivityProfileOverview::class.java)
                startActivity(intent)
                finish()
            }, splashDur.toLong())
        }
    }
}