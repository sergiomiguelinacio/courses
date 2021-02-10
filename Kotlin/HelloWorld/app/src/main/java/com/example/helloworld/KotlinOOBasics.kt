package com.example.helloworld

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