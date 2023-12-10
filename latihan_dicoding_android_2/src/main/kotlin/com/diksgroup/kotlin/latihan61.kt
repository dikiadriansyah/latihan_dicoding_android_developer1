package com.diksgroup.kotlin
// Deklarasi Fungsi Generic

/*
Generic pada sebuah fungsi dibutuhkan ketika kita membuat sebuah fungsi yang berhubungan dengan List. Misalnya, list
yang dapat digunakan untuk berbagai tipe dan tidak terpaku pada tipe tertentu.

Fungsi generic memiliki tipe parameternya sendiri. Tipe argumen dari parameternya ditentukan ketika fungsi tersebut
dipanggil. Cara mendeklarasikannya sedikit berbeda dengan kelas generic, Tipe parameter yang berada di dalam
angle bracket harus ditempatkan sebelum nama dari fungsi yang kita tentukan.
 */
/*
Contoh penerapan fungsi generic bisa kita lihat pada deklarasi fungsi slice yang merupakan extensions function dari
kelas List
 */
//public fun <T> List<T>.slice(indices: Iterable<Int>): List<T>{
//
//}
/*
Tipe parameter pada fungsi slice() di atas digunakan sebagai receiver dan return type. Ketika fungsi tersebut dipanggil
 dari sebuah List dengan tipe tertentu, kita bisa menentukan tipe argumennya secara spesifik
 */
fun main(){
//val angka = (1..20).toList()
//print(angka.slice<Int>(1..10))
    /*
    output
    [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
     */

    //---------------------------
    /*
 jika semua nilai yang berada di dalamnya memiliki tipe yang sama, kita bisa menyederhanakan
     */
    val angka = (1..20).toList()
    print(angka.slice(1..10))
    /*
    output
    [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
     */
}

