package com.example.helloworld

fun main(){
    var samsung = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
    var iphone = MobilePhone("IOS", "Apple", "7")
}

class MobilePhone(osName: String, brand: String, model: String){

    init {
        println("Initializer a new MobilePhone object with " +
                "osName = $osName,  brand = $brand and model = $brand")
    }
}

