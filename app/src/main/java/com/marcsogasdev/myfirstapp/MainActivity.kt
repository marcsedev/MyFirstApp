package com.marcsogasdev.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextview =  findViewById<TextView>(R.id.textView)

        btnClickMe.setOnClickListener{
            btnClickMe.text="HAHA you click me!"
            tvMyTextview.text= "Great, you click de button 👍!"

        }
    }
}