package com.example.helloworld

fun main(){
    var stringVar : String = "Android Masterclas"
    var floatVar : Float = 13.37F
    var doubleVar : Double = 3.14159265358979
    var shortVar: Short = 25
    var intVar: Int = 2020
    var longVar: Long = 18881234567
    var boolVar : Boolean = true
    var charVar : Char = 'a'


    for(i in 0..10000){
        if(i == 9001)
            println("IT'S OVER 9000!!!")
    }

    var humidityLevel = 80
    var humidity = "humid"

    while( humidity == "humid"){
        humidityLevel -= 5
        println("humidity decreased")
        if(humidityLevel < 60){
            println("it's comfy now")
            humidity =  "comfy"
        }
    }
}