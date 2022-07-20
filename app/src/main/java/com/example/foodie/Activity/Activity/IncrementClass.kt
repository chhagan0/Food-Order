package com.example.foodie.Activity.Activity

import android.view.View
import androidx.lifecycle.ViewModel

class IncrementClass :ViewModel(){
    var count=0
    fun increase(view:View){
          count++
    }
    fun decrease(r: View){
        count--
    }

}