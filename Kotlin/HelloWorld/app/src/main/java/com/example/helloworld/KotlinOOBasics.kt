package com.example.helloworld

import java.lang.IllegalArgumentException

fun main() {
    var sergio = Person("Sergio", "Silva", 31)
    sergio.hobby = "skateboard"
    sergio.age = 34
    println("Sergio is ${sergio.age} years old")
    sergio.stateHooby()
    var john = Person()
    john.hobby = "play video games"
    john.stateHooby()
//    var johnPeterson = Person(lastName = "Peterson")


    myFunction(5)

    var myCar = Car2()
    myCar.maxSpeed = 100
    println("brand is:  ${myCar.myBrand}")
    println("MaxSpeed is ${myCar.maxSpeed}")
    // the setter is private, will get an error
    //myCar.myModel = "M3"
    println("Mode is ${myCar.myModel}")
}

class Person(firstName: String = "John", lastName: String = "Doe"){

    // Member Variable - Properties
    var age : Int? = null
    var hobby: String = "Watch Netflix"
    var personFirstName : String? = null

    // Initializer Block
    init {
        this.personFirstName = firstName
        println("Initializer a new Person object with " +
                "firstName = $firstName and lastName = $lastName")
    }

    // Member secondary Constructor
    constructor(firstName: String, lastName: String, age: Int)
        : this(firstName, lastName){
        this.age = age
        println("Initializer a new Person object with " +
                "firstName = $firstName and lastName = $lastName and age = $age")
        }



    // Member function - Methods
    fun stateHooby(){
        println("$personFirstName\'s hobby is $hobby")
    }
}

// this is a parameter
fun myFunction(a:Int){
    // a is a variable
    var a = 4
    println("a is $a")
}

open class Car2(){
    lateinit var owner : String

    val myBrand : String = "BMW"

        // Custom getter
    get() {
        return field.toLowerCase()
    }

    var maxSpeed: Int = 250
        // this code is autoGenerate in background so could be remove
        //get() = field
        //set(value){
        //   field = value
        //}
        // customer setter
        set(value){
            field = if(value > 0 ) value else throw IllegalArgumentException("Max speed can not me less than 0")
        }

    var myModel: String = "M5"
        private set

    init{
        this.myModel ="M3"
        this.owner = "Frank"
    }
}