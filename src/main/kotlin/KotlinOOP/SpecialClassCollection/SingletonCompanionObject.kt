package org.example.KotlinOOP.SpecialClassCollection


// Singleton Object
object CentralLibrary {
    fun borrowBookById(id: Int) {
        print("Book with $id has been borrowed")
    }
}

// Companion object
class Library {
    companion object{
        fun borrowBookById(id: Int) {
            println("Book with $id has been borrowed")
        }
    }
}

fun main() {
    CentralLibrary.borrowBookById(21)

    Library.Companion.borrowBookById(21)
    Library.borrowBookById(21)
}