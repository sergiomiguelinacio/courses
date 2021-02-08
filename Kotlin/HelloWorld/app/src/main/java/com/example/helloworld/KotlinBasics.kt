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
    //print(resultDouble)

    // Comparison operators (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    //print("isEqual is $isEqual")

    val isNotEqual = 5!=5
    // String interpolation
    //println("isNotEqual is $isNotEqual")
    
    //println("is-5less3 ${-5<3}")
    //println("is5LowerEqual3 ${5<=3}")
    //println("is5GreaterEqual3 ${5>=3}")

    // Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    //println("myNum is $myNum")
    myNum *= 4
    //println("myNum is $myNum")

    // Increment & Decrement operators (++, --)
    myNum++
    //println("myNum is $myNum")
    //println("myNum is ${myNum++}")
    //println("myNum is ${++myNum}")
    //println("myNum is ${--myNum}")

    var heightPerson1 = 170
    var heightPerson2 = 169
    
    if(heightPerson1 > heightPerson2)
    {
        println("use raw force")
    }
    else if(heightPerson1 == heightPerson2)
    {
        println("use your power technique 1337")
    }
    else{
        println("use raw technique")
    }

    val age = 31
    if(age >= 21)
    {
        println("now you may drink in th US")
    }
    else if(age >= 18){
        println("you may vote now")
    }
    else if(age >= 16){
        println("you're too young")
    }


    var name = "Sergio"

    if(name == "Sergio"){
        println("Welcome home Sergio")
    }
    else {
        println("Who are you?")
    }

    var isRainy = true
    if(isRainy)
        println("It's rainy")


}