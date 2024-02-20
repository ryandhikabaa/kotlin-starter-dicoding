package org.example.fundamental

fun main(){

//    Raw String
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    println("Raw String is now : \n"+line)


//    String Template
    val name = "Kotlin"
    val old = 3
    println("String Template is now : \nMy name is $name, im $old years old")
}