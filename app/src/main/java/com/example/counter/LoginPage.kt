package com.example.counter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LoginPage : AppCompatActivity()
{
    lateinit var name: TextView
    lateinit var phone: TextView
    lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)


        name=findViewById(R.id.namee)
        submitButton=findViewById(R.id.submitt)
        phone=findViewById(R.id.phonee)



        submitButton.setOnClickListener {

            var nameInput :String= name.text.toString()
            var mobileInput: String = phone.text.toString()
            if (nameInput.length==0 || mobileInput.length==0)
                Toast.makeText(applicationContext,"Fill in the datails first",Toast.LENGTH_SHORT).show()
            else if (mobileInput.length<10 || mobileInput.length>10)
                Toast.makeText(applicationContext,"Invalid Mobile Number",Toast.LENGTH_SHORT).show()
            else
            {
                var intent= Intent(this@LoginPage,ReasonActivity::class.java)
                intent.putExtra("naaam",nameInput)
                Toast.makeText(applicationContext,"Sign in Succesfull",Toast.LENGTH_SHORT).show()
                startActivity(intent)

            }

        }
    }
}