package com.example.myapplication.adapter

import android.view.View
import android.widget.TextView
import androidx.constraintlayout.utils.widget.ImageFilterView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.ItemModel

class ItemsViewHolder(
    private val view: View
): RecyclerView.ViewHolder(view) {

    fun bind(itemsModel: ItemModel){
        val heading = view.findViewById<TextView>(R.id.tv_heading)
        val message = view.findViewById<TextView>(R.id.tv_message)
        val date = view.findViewById<TextView>(R.id.tv_date)

        heading.text = itemsModel.heading
        message.text = itemsModel.message
        date.text = itemsModel.date





        var changeStar = true

    }
}