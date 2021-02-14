package com.example.helloworld

fun main(){
    var samsung = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    var iphone = MobilePhone("IOS", "Apple", "7")
    iphone.chageBattery(50)
}

class MobilePhone(osName: String, brand: String, model: String){

    private var battery = 0

    init {
        println("Initializer a new MobilePhone object with " +
                "osName = $osName,  brand = $brand and model = $brand")
    }

    fun chageBattery(charge : Int){
        println("Battery before chage = $battery with charge the battery status is ${battery + charge}")
        battery += charge
    }
}

