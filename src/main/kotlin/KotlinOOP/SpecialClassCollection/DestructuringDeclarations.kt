package org.example.KotlinOOP.SpecialClassCollection

fun main(){
    val dataUser = DataUser("nrohmen", 17)

//    Menggunakan komponen ke N
//    val name = dataUser.component1()
//    val age = dataUser.component2()

//     atau bisa juga gunakan
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
}