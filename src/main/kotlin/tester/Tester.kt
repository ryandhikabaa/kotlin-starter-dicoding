package org.example.tester

enum class Rainbow(val color : String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}

fun main (){
    var a = 10

    when (a) {
        a + a -> print("Ok")
    }
}

