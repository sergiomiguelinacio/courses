package com.example.helloworld

fun main(){
    val listOfDoubles: ArrayList<Double> = ArrayList<Double>()
    listOfDoubles.add(2.0)
    listOfDoubles.add(10.0)
    listOfDoubles.add(2.5)
    listOfDoubles.add(4.5)
    listOfDoubles.add(6.0)

    var average: Double = 0.0

    for(i in listOfDoubles){
        average += i
    }

    average /= listOfDoubles.size

    println("Average is $average")
}