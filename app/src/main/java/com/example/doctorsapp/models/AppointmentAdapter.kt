package com.example.doctorsapp.models

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.doctorsapp.R

class AppointmentAdapter(private val list:ArrayList<AppointmentDetails>):
    RecyclerView.Adapter<AppointmentAdapter.ViewHolder>() {
    inner class ViewHolder(val view: View) :
        RecyclerView.ViewHolder(view) {

        val text=view.findViewById<TextView>(R.id.content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.text_model, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item=list[position]
        holder.text.text=item.content
        if(item.available) {
            holder.text.setBackgroundResource(R.drawable.circle_shape_light_blue2)
            holder.text.setTextColor(Color.parseColor("#0277BD"))
        }
        else{
            holder.text.setBackgroundResource(R.drawable.circle_shape_light_blue1)
            holder.text.setTextColor(Color.parseColor("#FFFFFFFF"))
        }
        holder.text.setOnClickListener(){

            if(item.available){

                holder.text.setBackgroundResource(R.drawable.circle_shape_light_blue1)
                holder.text.setTextColor(Color.parseColor("#FFFFFFFF"))
                item.available=false
            } else{
                holder.text.setBackgroundResource(R.drawable.circle_shape_light_blue2)
                holder.text.setTextColor(Color.parseColor("#0277BD"))
                item.available=true
            }
        }

    }
    override fun getItemCount(): Int {
        return list.size
    }
}