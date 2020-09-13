package com.example.madlevel2task1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel2task1.R
import com.example.madlevel2task1.model.PlaceModel
import kotlinx.android.synthetic.main.item_place.view.*

class PlaceAdapter(private val places: List<PlaceModel>) :
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    lateinit var context: Context


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_place, parent, false))
    }


    override fun getItemCount(): Int {
        return places.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(places[position])
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(place: PlaceModel) {
            itemView.ivPlace.setImageDrawable(context.getDrawable(place.imageResId))
            itemView.tvPlace.text = place.name
        }

    }


}