package org.example.controlFlow

fun main (){
    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }

//    Dengan menggunakan forEach , kita tidak perlu lagi menggunakan for secara terpisah seperti sebelumnya. Ia akan otomatis melakukan perulangan pada setiap item dari variabel tersebut sampai akhir. Untuk mendapatkan nilainya, kita definisikan variabel value seperti contoh di atas.
    val ranges2 = 1.rangeTo(10) step 3
    ranges2.forEach { value ->
        println("value is $value!")
    }
}