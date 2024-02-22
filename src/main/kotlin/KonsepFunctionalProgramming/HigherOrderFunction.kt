package org.example.KonsepFunctionalProgramming

fun main (){
//    printName("Academy", name)
    printName("Academy"){ value ->
    val first = "Dicoding"

    "$first $value"
    }
}

fun printName(value: String, name: (String) -> String){
    println(name(value))
}

//val name: (String) -> String = { value ->
//    val first = "Dicoding"
//
//    "$first $value"
//}