package com.example.foodie.Activity.Activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import com.example.foodie.Cart
import com.example.foodie.MainActivity

import com.example.foodie.R
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    lateinit var navController: NavController
    lateinit var drawerLayout: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        tokri.setOnClickListener {
            var intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }


    }


    fun peppronipizzacard(view: View) {
        val intent = Intent(this, pepperonipizacard::class.java)
        startActivity(intent)
    }

    fun cheeseburger(view: View) {
        val intent = Intent(this, CheeseBurger::class.java)
        startActivity(intent)

    }

    fun vegetablepizza(view: View) {
        val intent = Intent(this, vegetablepizza::class.java)
        startActivity(intent)
    }

    fun VegetableBurger(view: View) {
        val intent = Intent(this, VegetableBurger::class.java)
        startActivity(intent)
    }

    fun sandvich(view: View) {
        val intent = Intent(this, Sandvich::class.java)
        startActivity(intent)
    }

    fun fruitpizza(view: View) {
        val intent = Intent(this, FruitPizza::class.java)
        startActivity(intent)
    }

    fun photo(view: View) {
        intent = Intent(this, About::class.java)
        startActivity(intent)
    }

    fun home(view: View) {
        intent = Intent(this, About::class.java)
        startActivity(intent)
    }

    fun homee(view: View) {
        intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}


