package com.example.stress_buster.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import android.view.animation.AlphaAnimation
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.stress_buster.databinding.ActivitySplashScreenBinding
import com.example.stress_buster.R

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set tampilan activity splash
        setContentView(R.layout.activity_splash_screen)

        // Set activity menjadi fullscreen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        // Membuat animasi fade-in untuk logo
        val fadeAnimation = AlphaAnimation(0.0f, 1.0f)
        fadeAnimation.duration = 2000 // Durasi animasi dalam milidetik

        val logoImageView = findViewById<ImageView>(R.id.logoImageView)
        logoImageView.startAnimation(fadeAnimation)
    }
}