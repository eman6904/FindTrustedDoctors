package com.example.doctorsapp.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.cardview.widget.CardView
import com.example.doctorsapp.R

class DoctorSignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_sign_up)

        val signUp_btn=findViewById<CardView>(R.id.sign_up)

        // to hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar()!!.hide()
        }
        // to change status bar color
        if (Build.VERSION.SDK_INT >= 21) {
            val window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.statusBarColor = this.resources.getColor(R.color.light_blue)
        }

        signUp_btn.setOnClickListener(){

            val intent= Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }

}