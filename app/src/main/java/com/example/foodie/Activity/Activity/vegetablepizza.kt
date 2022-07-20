package com.example.foodie.Activity.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.foodie.R
import kotlinx.android.synthetic.main.activity_vegetablepizza.*

class vegetablepizza : AppCompatActivity() {
    lateinit var incrementClass: IncrementClass
    lateinit var settextt: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vegetablepizza)
        settextt=  findViewById(R.id.settextt)
        incrementClass = ViewModelProvider(this)[IncrementClass::class.java]
        settext()
        pepperoniaddtoart.setOnClickListener {
            Toast.makeText(this, "Add to cart ", Toast.LENGTH_SHORT).show()
        }

    }
    fun settext() {
        settextt.text = incrementClass.count.toString()
    }

    fun increase(view: View) {
        incrementClass.increase(view)
        settext()
    }
    fun decrease(r: View){
        incrementClass.decrease(r)
        settext()
    }
}