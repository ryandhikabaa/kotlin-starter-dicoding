package org.example.KotlinOOP.SpecialClassCollection

class House {
    // Properti atau anggota outer class
    val buildingArea = 100
    val totalRooms = 4

    inner class Room {
        // Properti atau anggota inner class
        val totalRooms = 4
        fun measureRoomArea() {
            // Inner class dapat mengakses properti atau anggota outer class
//            @ digunakan qualified this jika ada nama yang sama namun lebih spesifik yang mana
            print(buildingArea/this@House.totalRooms)
        }
    }
}

fun main(){
    val house = House()
    val room = house.Room()
    room.measureRoomArea()
}