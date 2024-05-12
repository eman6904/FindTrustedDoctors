package com.example.doctorsapp.models

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorsapp.R

class DoctorAdapter (private val list:ArrayList<DoctorModel>):
    RecyclerView.Adapter<DoctorAdapter.ViewHolder>() {
    inner class ViewHolder(val view: View) :
        RecyclerView.ViewHolder(view) {

        val profile_image=view.findViewById<ImageView>(R.id.profile_image)
        val ratingBar=view.findViewById<RatingBar>(R.id.ratingbar)
        val doctor_name=view.findViewById<TextView>(R.id.doctor_name)
        val doctor_specialist=view.findViewById<TextView>(R.id.doctor_specialist)
        val doctor_experience=view.findViewById<TextView>(R.id.doctor_experience)
        val follow=view.findViewById<TextView>(R.id.follow)
        val more_details=view.findViewById<Button>(R.id.details_btn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.doctor_model, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item=list[position]
        holder.doctor_name.text=item.doctorName
        holder.doctor_experience.text=item.doctorExperience
        holder.doctor_specialist.text=item.doctorSpecialist
        holder.profile_image.setImageResource(item.profile_image)
        holder.follow.text=item.doctor_following
        holder.follow.setOnClickListener(){
            if(item.doctor_following=="follow") {
                item.doctor_following = "following"
                holder.follow.text = item.doctor_following

            }
            else {
                item.doctor_following = "follow"
                holder.follow.text = item.doctor_following

            }
        }
        holder.ratingBar.rating= item.ratingBar.toFloat()

    }
    override fun getItemCount(): Int {
        return list.size
    }
}