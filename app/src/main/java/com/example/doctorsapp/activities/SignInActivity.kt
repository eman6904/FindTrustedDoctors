package com.example.doctorsapp.activities

import android.content.Intent
import android.graphics.Paint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.doctorsapp.R

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val title=findViewById<TextView>(R.id.title)
        val sign_in_btn=findViewById<CardView>(R.id.sign_in)
        // to hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar()!!.hide()
        }
        //to change status bar color
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.light_blue)
        }
        //to set underline with text
        title.paintFlags = Paint.UNDERLINE_TEXT_FLAG
        sign_in_btn.setOnClickListener(){

            val intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}