package com.example.doctorsapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.doctorsapp.R

class RegisterAsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_as)

        val doctorRegistration=findViewById<CardView>(R.id.doctor_registration)
        val patientRegistration=findViewById<CardView>(R.id.patient_registration)

        if (getSupportActionBar() != null) {
            getSupportActionBar()!!.hide()
        }

        doctorRegistration.setOnClickListener(){

            val intent= Intent(this, DoctorSignUpActivity::class.java)
            startActivity(intent)
        }

        patientRegistration.setOnClickListener(){

            val intent= Intent(this, PatientSignUpActivity::class.java)
            startActivity(intent)
        }
    }
}