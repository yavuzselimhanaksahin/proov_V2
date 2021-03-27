package com.yavuzselimhanaksahin.kimlikkanitlama

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    val fname = arrayOf("Dr parag","bir","iki")

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var fname : TextView
        init {
           fname = itemView.findViewById(R.id.textView)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.mylayout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fname.text = fname[position]

    }

    override fun getItemCount(): Int {
        return fname.size
    }
}