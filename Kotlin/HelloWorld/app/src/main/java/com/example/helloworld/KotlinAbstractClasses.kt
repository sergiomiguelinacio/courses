package com.example.helloworld

abstract class Mammal(private val name: String , private val origin: String,
    private val weight: Double) { // Concrete (Non abstract) Properties

    // Abstract Property (Must be overridden by Subclasses)
    abstract var maxSpeed: Double

    // Abstract Methods (Must be implemented by Subclasses)
    abstract fun run()
    abstract fun breath()

    // Concrete (Nonn Abstract) Method
    fun displayDetails(){
        println("Name: $name, Origin: $origin, Wight: $weight, " +
            "Max Speed: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double,
            override var maxSpeed: Double) : Mammal(name, origin, weight) {

    override fun run(){
        // Code to run
        println("Runs on two legs")
    }

    override fun breath(){
        // Code to breath
        println("Breath through mouth or nose")
    }
}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double) : Mammal(name, origin, weight) {

    override fun run() {
        println("Run on four legs")
    }

    override fun breath() {
        println("Breath through the trunk")
    }
}

fun main(){
    val human =  Human("Sergio", "Portugal", 65.0, 28.0)

    val elephant = Elephant("Rosy", "India", 5400.0, 25.0)

    // cannot create an instance from a abstract class
    //val mammal = Mammal("Sergio", "Portugal", 65.0, 28.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}
