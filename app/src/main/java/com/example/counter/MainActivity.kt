package com.example.counter

import android.annotation.SuppressLint    // YE ADD KIYAA HAI
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity()
{
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button=findViewById(R.id.buttonnn)

        button.setOnClickListener {

            var intent= Intent(this@MainActivity,LoginPage::class.java)
            startActivity(intent)
        }



    }
}