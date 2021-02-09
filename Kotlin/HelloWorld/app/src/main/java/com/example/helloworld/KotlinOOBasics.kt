package com.example.helloworld

fun main() {
    var sergio = Person("Sergio", "Silva")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")
}

class Person(firstName: String = "John", lastName: String = "Doe"){

    // Initializer Block
    init {
        println("Initializer a new Person object with " +
                "firstName = $firstName and lastName = $lastName")
    }
}