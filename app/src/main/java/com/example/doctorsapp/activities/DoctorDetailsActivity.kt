package com.example.doctorsapp.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorsapp.R
import com.example.doctorsapp.models.AppointmentAdapter
import com.example.doctorsapp.models.ListsGroup
import com.example.doctorsapp.models.ServicesAdapter

class DoctorDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_details)

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
        ////////////////////////////////////////////////////////////////////////

        val profile_image=findViewById<ImageView>(R.id.profile_image)
        val ratingBar=findViewById<RatingBar>(R.id.ratingbar)
        val doctor_name=findViewById<TextView>(R.id.doctor_name)
        val doctor_specialist=findViewById<TextView>(R.id.doctor_specialist)
        val doctor_experience=findViewById<TextView>(R.id.doctor_experience)
        val follow=findViewById<TextView>(R.id.follow)
        val book_btn=findViewById<Button>(R.id.book_btn)
        val recycler=findViewById<RecyclerView>(R.id.recycler)
        val back=findViewById<ImageView>(R.id.back)

        val listsGroup= ListsGroup()
        listsGroup.setDoctorDetails()
        val position = intent.getIntExtra("position",0)
        val item=listsGroup.doctorsDetails[position]

        doctor_name.text=item.doctorName
        doctor_experience.text=item.doctorExperience
        doctor_specialist.text=item.doctorSpecialist
        profile_image.setImageResource(item.profile_image)
        follow.text=item.doctor_following
        ratingBar.rating= item.ratingBar.toFloat()

        follow.setOnClickListener(){
            if(item.doctor_following=="follow") {
                item.doctor_following = "following"
                follow.text = item.doctor_following

            }
            else {
                item.doctor_following = "follow"
                follow.text = item.doctor_following
            }
        }

        val adapter = ServicesAdapter(item.services)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter

        book_btn.setOnClickListener(){

            val intent=Intent(this,AppointmentActivity::class.java).apply {
                putExtra("position", position)
                putExtra("folowingCase", item.doctor_following)
            }
            startActivity(intent)
        }
        back.setOnClickListener(){

            finish()
        }
    ///////////////////////////////////////////////////////////////////////
    }
}