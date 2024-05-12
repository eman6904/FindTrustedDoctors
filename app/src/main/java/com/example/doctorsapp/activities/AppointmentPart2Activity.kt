package com.example.doctorsapp.activities

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorsapp.R
import com.example.doctorsapp.models.*

class AppointmentPart2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointment_part2)

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
        //////////////////////////////////////////////////////////////////////////
        val recycler1=findViewById<RecyclerView>(R.id.recycler1)
        val recycler2=findViewById<RecyclerView>(R.id.recycler2)

        val listsGroup=ListsGroup()
        listsGroup.setDoctorDetails()

        val adapter = AppointmentAdapter(listsGroup.doctorsDetails[0].availableTimeList)
        recycler1.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recycler1.adapter = adapter
        //////////////////////////////////////////////////////////////////////////
        val adapter2 = AppointmentAdapter(listsGroup.doctorsDetails[0].beforeRememberList)
        recycler2.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recycler2.adapter = adapter2
    }
}