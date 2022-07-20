package com.example.foodie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import com.example.foodie.Activity.Activity.MainActivity2


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }




    fun getstart(view: View) {
        intent=Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}
