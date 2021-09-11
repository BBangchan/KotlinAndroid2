package com.example.kotlin_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese","Hamburger","Pizza","McDonalds", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)


        selectedFoodTxt.text = "Burger King"
        decideBtn.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodTxt.text = foodList[randomFood]
        }
        addFoodBtn.setOnClickListener{
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
            println(foodList)
        }
    }

}

