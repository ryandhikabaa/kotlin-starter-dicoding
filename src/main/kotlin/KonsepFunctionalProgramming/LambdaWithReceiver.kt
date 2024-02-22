package org.example.KonsepFunctionalProgramming

fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(message)
}

/*
   output : Hello from lambda
*/