package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.utils.widget.ImageFilterView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.ItemModel

class ItemsViewHolder(
    private val view: View
) : RecyclerView.ViewHolder(view) {

    fun bind(itemsModel: ItemModel) {

        view.findViewById<TextView>(R.id.tv_heading).text = itemsModel.heading
        view.findViewById<TextView>(R.id.tv_message).text = itemsModel.message
        view.findViewById<TextView>(R.id.tv_date).text = itemsModel.date
    }
    companion object {
        fun from(parent: ViewGroup): ItemsViewHolder {
            return ItemsViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_layout, parent, false)
            )
        }
    }
}