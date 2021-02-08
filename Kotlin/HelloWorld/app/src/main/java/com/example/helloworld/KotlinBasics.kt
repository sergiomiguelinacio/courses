package com.example.helloworld

fun main() {
    // immutable variable
    // type string
    val myName = "Sergio"

    // type int 32 bit
    // type inference, finds out the type from context
    var myAge = 31

    // Integer TYPES: Byte(8 bit), Short (16 bit),
    // Int (32 bit), Long (64bit)
    val myByte : Byte = 13
    val myShort : Short = 125
    val myInt : Int = 123123123
    val myLong : Long = 39_812_309_487_120_300

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.141559265358979323846

    // Boolean
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]

    //print("First character  " + firstCharInStr)


    // Arithmetic Operators (+, -, *, /, %)
    var result = 5 + 3
    val a = 5.0
    val b = 3
    var resultDouble : Double
    resultDouble = a / b
    print(resultDouble)
}