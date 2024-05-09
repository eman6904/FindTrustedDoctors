package com.example.doctorsapp.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorsapp.R

class PostAdapter (private val list:ArrayList<PostModel>):
    RecyclerView.Adapter<PostAdapter.ViewHolder>() {
    inner class ViewHolder(val view: View) :
        RecyclerView.ViewHolder(view) {

        val profile_image=view.findViewById<ImageView>(R.id.profile_image)
        val doctor_name=view.findViewById<TextView>(R.id.doctor_name)
        val menu_icon=view.findViewById<ImageView>(R.id.menu_icon)
        val post_content=view.findViewById<TextView>(R.id.postContent)
        val date=view.findViewById<TextView>(R.id.date)
        val image=view.findViewById<ImageView>(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_model, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item=list[position]
        holder.profile_image.setImageResource(item.profileImage)
        holder.doctor_name.text=item.doctorName
        holder.post_content.text=item.postContent
        holder.date.text=item.date
        holder.menu_icon.setImageResource(item.menuIcon)
        holder.image.setImageResource(item.postImage)

    }
    override fun getItemCount(): Int {
        return list.size
    }
}