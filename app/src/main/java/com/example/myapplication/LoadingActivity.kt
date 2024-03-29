package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class LoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        val homeIntent = Intent(this@LoadingActivity, MainActivity::class.java)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(homeIntent)
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }

    companion object {
        const val SPLASH_TIME_OUT = 2000
    }

}