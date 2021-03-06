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


    // when expressions
    var season = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    when(age){
        !in 0..20 -> println("now you may drink in th US")
        in 18..20 -> println("you may vote now")
        in 16..17 -> println("you're too young")
    }

    var x : Any = "13.37f"

    when(x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is String")
        else -> println("$x is none of the above")
    }

    var y = 1
    while(y <= 10){
        print("$y")
        y++
    }
    println("\nWhile loop is done")

    var z = 100
    while(z >= 0){
        print("$z")
        z -= 2
    }
    println("\nWhile loop is done")

    z = 15
    do{
        println("$z")
        z++
    }while(z < 10)
    println("\ndo While loop is done")

    var feltTemp = "cold"
    var roomTemp = 10

    while(feltTemp == "cold"){
        roomTemp++
        if(roomTemp >= 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    for(num in 1..10){
        print("$num")
    }

    for(i in 1 until 10){
        print("$i ")
    }

    println("_________")

    for(i in 10 downTo  1 step 2){ // Same as - for(i im 10.downTo(1).step(2))
        print("$i ")
    }
    println("Functions")
    // Functions
    var addUpResult = addUp(5,3)
    println("Addup is $addUpResult")

    var averageResult = average(5.3,13.37)
    println("Average is $averageResult")

    println("Nullables")

    var notNullName : String = "Sergio"
    // name = null -> compilation ERROR
    var nullableName : String? = "Sergio"
    //nullableName = null

    var len = notNullName.length
    var len2 = nullableName?.length // this line is the sames as the lines below

    if(nullableName != null){
        var len2 = nullableName.length
    }
    else{
        null
    }

    //println(nullableName?.toLowerCase())


    nullableName?.let {println(it.length)} // same as a if and else


    // ?: Elvis Operator
    val nameNullable = nullableName ?: "Guest"
    println("name is $nameNullable")

    // not null assertion
    println(nullableName!!.toLowerCase()) // this throw an exception because of line nullableName = null

    //safe chain call
    // val wifeAge: String? = user?.wife?.age ?: 0
}

fun addUp(a: Int, b: Int) : Int {
    return a + b
}

fun average(a: Double, b: Double): Double {
    return (a+b)/2
}

fun myfunction(){
    print("Called from myFunction")
}