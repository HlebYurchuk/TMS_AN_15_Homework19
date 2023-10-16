package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidhomework.adapter.ItemsAdapter
import com.example.myapplication.model.ItemModel

 val listItems:MutableList<ItemModel> = mutableListOf( ItemModel(
    "m4a1",
    "m4a1",
    "28.11.2022"
),
    ItemModel(
        "m4a1",
        "AUG",
        "27.11.2022"
    ),
    ItemModel(
        "m4a1",
        "AWP",
        "26.11.2022"
    ),
    ItemModel(
        "m4a1",
        "p2000",
        "25.11.2022"
    ),
    ItemModel(
        "m4a1=awp",
        "m4a1",
        "24.11.2022"
    ),)

class MainActivity : AppCompatActivity() {
    private lateinit var itemsAdapter: ItemsAdapter
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemsAdapter = ItemsAdapter()
        val recyclerView = findViewById<RecyclerView>(R.id.rc_item)
        recyclerView.layoutManager = LinearLayoutManager(baseContext)
        recyclerView.adapter = itemsAdapter

        itemsAdapter.submitList(listItems)

        val goToEntryFieldActivity = findViewById<Button>(R.id.bnToEntryField)
        goToEntryFieldActivity.setOnClickListener {
            startActivity(Intent(this,EntryFieldActivity::class.java))
        }
    }
}