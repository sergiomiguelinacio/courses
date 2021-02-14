package com.example.helloworld

data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1, "Sergio")

    user1.name = "Miguel"
    val user2 = User(1, "Miguel")

    println(user1 == user2)

    println("User Details: $user1")

    val updateUser = user1.copy(name = "Sergio Silva")
    println(user1);
    println(updateUser);

    println(updateUser.component1()); // print 1
    println(updateUser.component2()); // print Sergio Silva

    val (id, name) = updateUser
    // line above is the same as the next 2
    //val id = updateUser.id
    //val name = updateUser.name
    println("id=$id, name=$name")


}