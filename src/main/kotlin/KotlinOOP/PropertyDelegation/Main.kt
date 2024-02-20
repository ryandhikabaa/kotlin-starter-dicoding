package org.example.KotlinOOP.PropertyDelegation

//class Animal {
//    var name: String by DelegateName()
//}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

fun main (){
//    val animal = Animal()
//    animal.name = "Dicoding Miaw"
//    println("Nama Hewan: ${animal.name}")
//
//    val person = Person()
//    person.name = "Dimas"
//    println("Nama Orang: ${person.name}")
//
//    val hero = Hero()
//    hero.name = "Gatotkaca"
//    println("Nama Pahlawan: ${hero.name}")

    // Any
    val animal = Animal()
    animal.name = "Dicoding cat"
    animal.weight = 6.2
    animal.age = 1

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")
}