package com.example.splashactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Window

import android.view.WindowManager
import kotlin.properties.Delegates


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //to hide title bar of this activity
        //window.requestFeature(Window.FEATURE_NO_TITLE)

        //for full screen activity
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)

        //start main activity after 4sec
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            //finish this activity
            finish()
        },4000)



    }

    override fun onResume() {
        super.onResume()
    }
}