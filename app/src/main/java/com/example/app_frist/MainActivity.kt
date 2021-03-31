package com.example.app_frist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.app_frist.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*



class  MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState : Bundle?){
        super .onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
    fun bmi (view:View) {
        val weight = weight.text.toString().toFloat()
        val height = height.text.toString().toFloat()
        val bmi = weight / (height * height)
        Log.d("BMI",bmi.toString())
    }
}



