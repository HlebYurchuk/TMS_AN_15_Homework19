package com.example.androidhomework.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.ItemsViewHolder
import com.example.myapplication.model.ItemModel


class ItemsAdapter(): RecyclerView.Adapter<ItemsViewHolder>() {

    private var listItems = listOf<ItemModel>()

    fun submitList(list: List<ItemModel>){
        listItems = list.toMutableList()
    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        holder.bind(listItems[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        return ItemsViewHolder.from(parent)
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

}