package com.marcsogasdev.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextview =  findViewById<TextView>(R.id.textView)
        val tvCountClicker =  findViewById<TextView>(R.id.textViewClick)
        var timesClicked =0

        btnClickMe.setOnClickListener{
            btnClickMe.text="HAHA you click me!"
            tvMyTextview.text= "Great, you click de button 👍!"
            timesClicked += 1
            tvCountClicker.text=timesClicked.toString()

            Toast.makeText(this,"Hey I'm a toast!",Toast.LENGTH_SHORT).show()


        }
    }
}