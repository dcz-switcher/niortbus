package com.niortreactnative.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.niortreactnative.R

/**
 * Created by davidc on 09/10/2017.
 */

class HourListAdapter(hours:Array<String>) : RecyclerView.Adapter<HourListAdapter.ViewHolder>(){


    private var hours = hours

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent?.context).inflate(R.layout.hour_list_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.hour?.text = hours[position]
    }

    override fun getItemCount(): Int {
        return hours.size
    }

    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        var hour:TextView = itemView.findViewById(R.id.hour) as TextView
    }
}