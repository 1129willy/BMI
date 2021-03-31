package com.example.app_frist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.app_frist.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*



class  MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState : Bundle?){
        super .onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        input_height
        input_weight
    }
    fun bmi (view:View) {
        val weight = input_weight.text.toString().toFloat()
        val height = input_height.text.toString().toFloat()
        val bmi = weight / (height * height)
        Log.d("BMI",bmi.toString())
        Toast.makeText(this,bmi.toString(),Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
                .setMessage(bmi.toString())
                .setTitle("your bmi")
                .setPositiveButton("ok",null)
                .setNeutralButton("cancel",null)
                .show()
    }
}



