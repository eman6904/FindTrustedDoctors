package com.example.doctorsapp.models

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorsapp.R

class ServicesAdapter (private val list:ArrayList<String>):
    RecyclerView.Adapter<ServicesAdapter.ViewHolder>() {
    inner class ViewHolder(val view: View) :
        RecyclerView.ViewHolder(view) {

        val text=view.findViewById<TextView>(R.id.text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.textmodel2, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item=list[position]
        holder.text.text="${position+1}. $item"

    }
    override fun getItemCount(): Int {
        return list.size
    }
}