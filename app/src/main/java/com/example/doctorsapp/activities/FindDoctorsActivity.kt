package com.example.doctorsapp.activities

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorsapp.R
import com.example.doctorsapp.models.DoctorAdapter
import com.example.doctorsapp.models.ListsGroup
import com.example.doctorsapp.models.LiveAdapter

class FindDoctorsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_doctors)
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
        /////////////////////////////////////////////////////////////////
        val recycler=findViewById<RecyclerView>(R.id.recycler)
        val listsGroup= ListsGroup()
        listsGroup.setDoctorDetails()
        val adapter = DoctorAdapter(listsGroup.doctorsDetails)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter
       /////////////////////////////////////////////////////////////////

    }
}