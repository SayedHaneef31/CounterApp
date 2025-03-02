package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ReasonActivity : AppCompatActivity()
{
    lateinit var nameDeclare: TextView
    lateinit var counterButton: TextView
    lateinit var tap:Button
    lateinit var reset:Button

    var c=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reason)

        nameDeclare=findViewById(R.id.nameDeclareee)
        counterButton=findViewById(R.id.counterrr)
        tap=findViewById(R.id.tappppp)
        reset=findViewById(R.id.resetttt)

        var str: String = intent.getStringExtra("naaam").toString()
        val firstName: List<String> = str.split(" ")

        nameDeclare.text="Hello "+firstName[0]+","

        tap.setOnClickListener {
            c=c+1
            counterButton.text=c.toString()
        }
        reset.setOnClickListener {
            c=0;
            counterButton.text=c.toString()
        }


    }
}