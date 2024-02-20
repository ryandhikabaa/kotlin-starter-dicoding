package org.example.KotlinOOP


fun Int.plusThree(): Int {
    return this + 3
}

val Int.slice: Int
    get() = this / 2

infix fun Int.sum(value: Int): Int {
    return this + value
}

fun main (){
//    Extension Functions
    println(10.plusThree())

//    Extension Properties
    println(10.slice)

//    Infix Function
    println(5 sum 3)
}