package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.icu.text.SimpleDateFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.model.ItemModel
import java.util.Date
import java.util.Locale

class EntryFieldActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry_field)

      // val listItems = listItems

        val addData = findViewById<Button>(R.id.btnRg)
        val headingText = findViewById<EditText>(R.id.etHeading)
        val messageText = findViewById<EditText>(R.id.etMessage)

        addData.setOnClickListener {
            listItems.add(ItemModel(
                headingText.text.toString(),messageText.text.toString(), getCurrentDate()
            ))
            Log.w("hi", listItems.toString())
            startActivity(Intent(this,MainActivity::class.java)) }
        }

     private fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("dd.MM.yyyy", Locale.getDefault())
        return dateFormat.format(Date())
    }
    }
