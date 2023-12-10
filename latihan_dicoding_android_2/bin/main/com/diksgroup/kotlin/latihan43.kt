package com.diksgroup.kotlin
//Object Everywhere

// pada sub modul Data Types disebutkan bahwa pada kotlin semua bertindak sebagai objek dimana kita bisa memanggil
// member function dan properti dari sebuah variabel.
// objek merupakan hasil realisasi dari sebuah blueprint atau class yang tentunya memiliki fungsi dan juga properti sama seperti blueprint-nya.
// membuat objek adalah dapat mengakses fungsi dan properti yang terdapat pada kelas

// pada object memiliki nilai primitif  seperti String, Integer, Char, Boolean
fun main(){
//val beberapaKata = "Perkenalkan"
    /*
    pada kode kita melakukan pembuatan variabel yg merupakan sebuah objek dengan nama beberapaKata.
objek merupakan realisasi dari kelas String, maka objek beberapaKata memiliki fungsi dan properti yg merupakan
anggota dari kelas String
     */

//println(beberapaKata.reversed())
//    println(beberapaKata.toUpperCase())
//    println(beberapaKata.toLowerCase())
/*
output:
naklanekreP
PERKENALKAN
perkenalkan
 */

//    Dari completion suggestion yang tersedia pada IntelliJ Idea, kita bisa melihat beberapa fungsi yang dapat
//    digunakan oleh objek someString. Kita bisa menggunakan fungsi reverse() untuk membuat urutan huruf disusun secara
//    terbalik, fungsi toUpperCase() yang dapat membuat huruf menjadi kapital atau fungsi toLowerCase() yang dapat
//    membuat menjadi huruf kecil.
//    -----------------------
//    mengubah tipe data dengan mengakses fungsi yg tersedia dari sebuah objek string.

    val beberapa = "1234"
    val ubahKeInteger = beberapa.toInt()

    val beberapaDua = "3.14"
    val ubahKeDouble = beberapaDua.toDouble()

    println(ubahKeInteger is Int)
    println(ubahKeDouble is Double)
    /*
    output:
    true
    true
     */

    /*
    output nilai true artinya telah berhasil mengubah suatu tipe data String ke tipe data lainnya dengan menggunakan
    fungsi yg terdapat pada objek string.

    Catatan:
  objek merupakan realisasi dari sebuah blueprint yang tentunya memiliki properti dan fungsi yang sama dengan blueprint-nya.
  kegunaan objek adalah untuk mengakses berbagai properti dan fungsi pada kelas.

     */

}