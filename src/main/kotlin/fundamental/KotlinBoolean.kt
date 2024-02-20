package org.example.fundamental

fun main(){
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    var isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    println("Office is open : $isOpen")

//    Conjunction atau AND (&&)
    isOpen = now >= officeOpen && now <= officeClosed

    println("Office is open : $isOpen")

//    Disjunction atau OR (||)
    val isClose = now < officeOpen || now > officeClosed

    println("Office is closed : $isClose")

//    Negation atau NOT (!)
    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }
}