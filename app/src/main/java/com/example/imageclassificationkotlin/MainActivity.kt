package com.example.imageclassificationkotlin

import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.google.mlkit.nl.entityextraction.*


class MainActivity : AppCompatActivity() {
    var resultTv: TextView? = null
    var dataBtn: Button? = null
    var dataEd: EditText? = null

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        resultTv = findViewById(R.id.textView)
        dataBtn = findViewById(R.id.button)
        dataEd = findViewById(R.id.editTextTextPersonName)


        dataBtn?.setOnClickListener(View.OnClickListener { extractEntites(dataEd?.getText().toString()) })


        // Load Smart reply model

    }

    fun extractEntites(text: String?) {

    }

    override fun onDestroy() {
        super.onDestroy()

    }

}