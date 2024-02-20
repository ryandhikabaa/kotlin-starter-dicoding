package org.example.fundamental

fun main (){


    println(setUser("Ryandhika", 22))
}

fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}