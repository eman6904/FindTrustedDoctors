package com.example.doctorsapp.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorsapp.R
import com.example.doctorsapp.models.ListsGroup

class AppointmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointment)

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
        /////////////////////////////////////////////////////////////////////////////

        val profile_image=findViewById<ImageView>(R.id.profile_image)
        val ratingBar=findViewById<RatingBar>(R.id.ratingbar)
        val doctor_name=findViewById<TextView>(R.id.doctor_name)
        val doctor_specialist=findViewById<TextView>(R.id.doctor_specialist)
        val doctor_experience=findViewById<TextView>(R.id.doctor_experience)
        val follow=findViewById<TextView>(R.id.follow)
        val back=findViewById<ImageView>(R.id.back)
        val price=findViewById<TextView>(R.id.price)

        val listsGroup= ListsGroup()
        listsGroup.setDoctorDetails()
        val position = intent.getIntExtra("position",0)
        val followingCase = intent.getStringExtra("folowingCase")
        val item=listsGroup.doctorsDetails[position]

        item.doctor_following=followingCase!!
        doctor_name.text=item.doctorName
        doctor_experience.text=item.doctorExperience
        doctor_specialist.text=item.doctorSpecialist
        profile_image.setImageResource(item.profile_image)
        follow.text=item.doctor_following
        price.text="$ ${item.price}.00 / hr"
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

        val next_btn=findViewById<Button>(R.id.next_btn)
        next_btn.setOnClickListener(){

            val intent= Intent(this,AppointmentPart2Activity::class.java).apply {

                putExtra("position", position)
            }
            startActivity(intent)
        }
        /////////////////////////////////////////////////////////////////////////////
        back.setOnClickListener(){
            finish()
        }
    }
}