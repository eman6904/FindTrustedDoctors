package com.example.doctorsapp.activities

import android.graphics.Paint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorsapp.R
import com.example.doctorsapp.models.*

class AppointmentPart2Activity : AppCompatActivity() {
    companion object{
        var  selectedYear=0
        var selectedMonth = 0 // Months are zero-based
        var selectedDay = 0
        val monthes=ArrayList<String>()
    }

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

        val listsGroup= ListsGroup()
        listsGroup.setDoctorDetails()
        val position = intent.getIntExtra("position",0)
        val item=listsGroup.doctorsDetails[position]

        val adapter = AppointmentAdapter(listsGroup.doctorsDetails[position].availableTimeList)
        recycler1.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recycler1.adapter = adapter
        //////////////////////////////////////////////////////////////////////////
        val adapter2 = AppointmentAdapter(listsGroup.doctorsDetails[position].beforeRememberList)
        recycler2.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recycler2.adapter = adapter2
        //////////////////////////////////////////////////////////////////////////
        val datePicker = findViewById<DatePicker>(R.id.datePicker)

        datePicker.setOnDateChangedListener { view, year, monthOfYear, dayOfMonth ->

            selectedYear = year
            selectedMonth = monthOfYear // Months are zero-based
            selectedDay = dayOfMonth

        }
        ///////////////////////////////////////////////////////////////////////////

        monthes.add("January")
        monthes.add("February")
        monthes.add("March")
        monthes.add("April")
        monthes.add("May")
        monthes.add("June")
        monthes.add("July")
        monthes.add("August")
        monthes.add("September")
        monthes.add("October")
        monthes.add("November")
        monthes.add("December")

        //to display dialog
       val confirm_btn=findViewById<Button>(R.id.confirm_btn)
        confirm_btn.setOnClickListener(){

            val alertbuilder = AlertDialog.Builder(this,R.style.dialog)
            val view = layoutInflater.inflate(R.layout.dialog, null)
            alertbuilder.setView(view)
            val alertDialog = alertbuilder.create()
            alertDialog.show()

            val done=view.findViewById<Button>(R.id.done_btn)
            val edit_appointment=view.findViewById<TextView>(R.id.edit_appointment)
            val appointment_details=view.findViewById<TextView>(R.id.appointment_details)

            appointment_details.text="You booked an appointment with ${item.doctorName} who is " +
                    "${item.doctorSpecialist} on $selectedDay th  ${monthes[selectedMonth]}"
            done.setOnClickListener(){
                alertDialog.dismiss()
            }
        }

        ///////////////////////////////////////////////////////////////////////////////////

    }
}