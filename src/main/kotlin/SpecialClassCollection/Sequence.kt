package org.example.SpecialClassCollection

fun main(){
    val list = (1..10000).toList()

    val number1 = list.filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number1)

    val number2 = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number2)

    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
// Output: 1 2 3 4 5
}