package com.example.birthdaygreet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val birthdayGreetings=findViewById<TextView>(R.id.birthdayGreetings)

        val name=intent.getStringExtra(NAME_EXTRA)
        birthdayGreetings.text="Happy Birthday \n $name !! \n Stay Blessed ... "





    }
}