package com.example.helloworld

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println( "The drivable is braking")
    }
}

// Super Class, Parent Class, Base Class of Vehicle
open class Car(override val maxSpeed: Double, val name: String , val brand: String) : Drivable{
    open var range: Double = 0.0

    fun ExtendRange(amount: Double){
        if( amount > 0)
            range += amount
    }

    // this line is the same as bellow override fun drive(): String  = "Driving the interface drive"
    override fun drive(): String {
        return "Driving the interface drive"
    }

    open fun drive(distance: Double){
        println( "Drove for $distance KM")
    }
}

// Sub Class Child class of Derived class of car
class ElectricCar(maxSpeed: Double, name : String , brand : String, batteryLife: Double)
    : Car(maxSpeed, name, brand){

    var chargerType = "Type1"
    override var range = batteryLife * 6

    override fun drive(distance: Double){
        println( "Drove for $distance KM on electrivity")
    }

    override fun drive(): String {
        return  "Drove for $range KM on electrivity"
    }

    override fun brake() {
        super.brake()
        println("brake inside of electric car")
    }
}

fun main(){
    var audiA3 = Car( 200.0,"A3", "Audi")
    var teslaS = ElectricCar(240.0,  "S-Model", "Tesla", 85.0)
    teslaS.chargerType = "Type2"
    //teslaS.ExtendRange(200.0)

    //teslaS.drive()
    teslaS.brake()
    audiA3.brake()

    // Ploymorphism
    // audiA3.drive(200.0)
    // teslaS.drive(200.0)
}