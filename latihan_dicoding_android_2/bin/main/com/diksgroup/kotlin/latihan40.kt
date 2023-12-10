package com.diksgroup.kotlin
// Fold, Drop, dan Take

/*
kotlin collection adalah struktur data mumpuni yg banyak menyediakan fungsi untuk memudahkan dalam mengelola dan
manipulasi data.
modul sebelumnya mempelajar beberapa fungsi seperti map(), sum(), sorted().

pada sub-modul mempelajari beberapa fungsi tingkat lanjut manfaatkan untuk mengelola data seperti disebutkan diatas.

FOld
melakukan perhitungan setiap nilai yg berada di dalam sebuah collection tanpa harus melakukan iterasi item tersebut satu-persatu menggunakan fungsi fold()

* */



fun main(){
//    val bilanganGenap = listOf(2,4,6,8,10,12,14)
//    val hasil = bilanganGenap.fold(10) {
//            sekarang, item ->
//        println("sekarang: $sekarang")
//        println("item: $item")
//        println()
//        sekarang + item
//    }
//
//    println("hasil fold: $hasil")

    /*
    output:
    sekarang: 10
    item: 2

    sekarang: 12
    item: 4

    sekarang: 16
    item: 6

    sekarang: 22
    item: 8

    sekarang: 30
    item: 10

    sekarang: 40
    item: 12

    sekarang: 52
    item: 14

    hasil fold: 66

     */

    /*
    fungsi fold() memerlukan 2 argumen: nilai awal untuk perhitungan dan lambda expression yang nilai kembaliannya
    digunakan untuk menentukan nilai awal selanjutnya.
    dalam lambda expression terdapat 2 argumen yaitu argumen sekarang merupakan merepresentasikan nilai awal  dan
    argumen item merupakan masing-masing item yang berada pada numbers.
     */
//----------------------
    /*
    fungsi fold lainnya adalah foldRight().
    fungsi foldRight() merupakan proses iterasi dari indeks terakhir dan posisi dari argumen pada lambda expression nya
    pun berbeda, di mana argumen item berada pada posisi pertama dan argumen current berada pada posisi kedua.
     */


//    val bilanganPrima = listOf(2,3,5,7,11)
//    val hasil = bilanganPrima.foldRight(17){
//        item, sekarang ->
//        println("sekarang $sekarang")
//        println("item $item")
//        println()
//        item + sekarang
//    }
//
//    println("hasil fold: $hasil")
/*
output:
sekarang 17
item 11

sekarang 28
item 7

sekarang 35
item 5

sekarang 40
item 3

sekarang 43
item  2

hasil fold: 45

 */


    // DROP
//    merupakan untuk memangkas item yg berada di dalam sebuah objek collection berdasarkan jumlah yg kita tentukan.
    // contoh mempunyai sebuah collection seperti berikut:
//    val bilanganAsli = listOf(1,2,3,4,5,6,7,8)

//    val hasil = bilanganAsli.drop(3) // fungsi drop untuk memangkas 3 item dari collection
//    println(hasil)
/*
output:
4,5,6,7,8
 */
//    ------------------------
    /*
    contoh memangkas nilai dari inteks terakhir
     */
//    val hasil2 = bilanganAsli.dropLast(3) // fungsi dropLast untuk memangkas dari indeks terakhir
//    println(hasil2)
    /*
    output:
    [1,2,3,4,5]
     */
    //-----------------
// Take
//    untuk menyaring item yg berada di dalam sebuah objek collection. pemanggilan fungsi drop() kita perlu menentukan
//    jumlah item yg akan disaring.
val bilanganAsli = listOf(1,2,3,4,5,6,7,8)
//    val hasil = bilanganAsli.take(4)
//    println(hasil)
    /*
    output:
    [1,2,3,4]
     */


    // contoh takeLast() untuk menjalankan operasi dari posisi atau indeks terakhir
val hasil2 = bilanganAsli.takeLast(4)
    println(hasil2)
    /*
    output:
    [5,6,7,8]
     */
}