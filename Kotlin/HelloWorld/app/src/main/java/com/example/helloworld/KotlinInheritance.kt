package com.example.helloworld

// Super Class, Parent Class, Base Class of Vehicle
open class Car(val name: String , val brand: String){
    open var range: Double = 0.0

    fun ExtendRange(amount: Double){
        if( amount > 0)
            range += amount
    }

    open fun drive(distance: Double){
        println( "Drove for $distance KM")
    }
}

// Sub Class Child class of Derived class of car
class ElectricCar(name : String , brand : String, batteryLife: Double)
    : Car(name, brand){

    var chargerType = "Type1"
    override var range = batteryLife * 6

    override fun drive(distance: Double){
        println( "Drove for $distance KM on electrivity")
    }

    fun drive(){
        println( "Drove for $range KM on electrivity")
    }
}

fun main(){
    var audiA3 = Car("A3", "Audi")
    var teslaS = ElectricCar( "S-Model", "Tesla", 85.0)
    teslaS.chargerType = "Type2"
    teslaS.ExtendRange(200.0)

    teslaS.drive()

    // Ploymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)
}