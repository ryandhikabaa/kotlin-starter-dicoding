package org.example.SpecialClassCollection

fun main(){

//    Slice
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)

    println(slice)

    /*
        output: [4, 5, 6, 7]
        */

//    Distinct ==> saring jika ada yang sama ambil yang pertama
    val total2 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total2.distinct()
    println(distinct)
    /*
        output: [1, 2, 3, 4, 5]
        */

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct2 = text.distinctBy {
        it.length
    }

    println(distinct2)

    /*
        output: [A, CC, EEE, GGGG]
        */

//    fungsi chunked() bisa kita gunakan untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk Array.
    val word = "QWERTY"
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunkedTransform)

    /*
        output: [qwe, rty]
        */

}