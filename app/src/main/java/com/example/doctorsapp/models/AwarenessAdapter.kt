package com.example.doctorsapp.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorsapp.R

class AwarenessAdapter (private val list:ArrayList<AwarenessModel>):
    RecyclerView.Adapter<AwarenessAdapter.ViewHolder>() {
    inner class ViewHolder(val view: View) :
        RecyclerView.ViewHolder(view) {

        val specialistIcon=view.findViewById<ImageView>(R.id.specialistIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.awareness_model, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item=list[position]
        holder.specialistIcon.setImageResource(item.specialistIcon)

    }
    override fun getItemCount(): Int {
        return list.size
    }
}