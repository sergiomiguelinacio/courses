package com.example.helloworld

fun main() {
    var sergio = Person("Sergio", "Silva")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")


    myFunction(5)
}

class Person(firstName: String = "John", lastName: String = "Doe"){

    // Initializer Block
    init {
        println("Initializer a new Person object with " +
                "firstName = $firstName and lastName = $lastName")
    }
}

// this is a parameter
fun myFunction(a:Int){
    // a is a variable
    var a = 4
    println("a is $a")
}