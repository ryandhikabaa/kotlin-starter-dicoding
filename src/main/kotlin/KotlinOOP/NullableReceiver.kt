package org.example.KotlinOOP



fun main() {
    val value: Int? = null
    val value1: Int? = null

    println(value?.sliceNullable)
    println(value1?.sliceNullable)
}

val Int.sliceNullable: Int
    get() = this.div(2)

