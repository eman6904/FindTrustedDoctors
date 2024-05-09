package com.example.doctorsapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.doctorsapp.R

class FaceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_face)

        val get_started=findViewById<Button>(R.id.get_started)

        if (getSupportActionBar() != null) {
            getSupportActionBar()!!.hide()
        }

        get_started.setOnClickListener(){

            val intent=Intent(this, RegisterAsActivity::class.java)
            startActivity(intent)
        }
    }
}