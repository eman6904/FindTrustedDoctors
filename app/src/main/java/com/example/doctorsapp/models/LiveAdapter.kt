package com.example.doctorsapp.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorsapp.R

class LiveAdapter(private val list:ArrayList<LiveModel>):
    RecyclerView.Adapter<LiveAdapter.ViewHolder>() {
    inner class ViewHolder(val view:View) :
        RecyclerView.ViewHolder(view) {

            val liveIcon=view.findViewById<ImageView>(R.id.live_icon)
            val doctorPic=view.findViewById<ImageView>(R.id.doctor_pic)
            val playIcon=view.findViewById<ImageView>(R.id.play_icon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.live_model, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

         val item=list[position]
         holder.liveIcon.setImageResource(item.liveIcon)
         holder.doctorPic.setImageResource(item.doctorPic)
         holder.playIcon.setImageResource(item.playIcon)

    }
    override fun getItemCount(): Int {
        return list.size
    }
}