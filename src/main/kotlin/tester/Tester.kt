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

fun doSomething(vararg input: Int): Float {
    return ((input.sum() / input.size).toFloat())
}
fun main(){
    val result = doSomething(1, 2, 3, 4, 5)
    print(result)
}
