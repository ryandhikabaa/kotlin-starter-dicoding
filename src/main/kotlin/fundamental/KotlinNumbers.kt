package org.example.fundamental

fun main(){
    val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")

//    Konversi Nilai angka
    val stringNumber = "23"
    val intNumber = 3

    println(intNumber + stringNumber.toInt())

//    Dengan Kotlin kita juga bisa menuliskan nilai numerik yang “readable” dengan menggunakan tanda underscores seperti berikut:
    val readableNumber = 1_000_000
    println(readableNumber)
}