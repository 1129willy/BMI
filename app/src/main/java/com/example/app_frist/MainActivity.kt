package com.example.app_frist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class  MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState : Bundle?){
        super .onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main(){
    println("hello world")
    val w =65f
    val h = 1.7f
    val bmi = w/(h*h)
    println("your bmi = $bmi")

    val p=person()
    p.weight = 64F
    p.height = 1.7F
    println("your class bmi = ${p.getbmi()}")

}
class person
{
    var weight : Float=0F
    var height : Float=0F
    fun getbmi() :Float{
        var bmi= weight/(height*height)
        return  bmi
    }
}
