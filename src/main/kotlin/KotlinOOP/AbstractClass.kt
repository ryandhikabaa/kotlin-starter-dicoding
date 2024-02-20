package org.example.KotlinOOP

abstract class AnimalAbstract(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}

fun main(){
//    Dengan begitu kelas Animal tidak dapat kita inisialisasikan menjadi sebuah objek.
//    Cannot create an instance of an abstract class
//    val animal = AnimalAbstract("dicoding animal", 2.6, 1, true)
}
