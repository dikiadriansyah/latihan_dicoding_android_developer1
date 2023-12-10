package com.dikcoding
// membuat package baru

//package merupakan pembungkus dari kelas (package-level class), fungsi (package-level function) atau
// variabel (package-level variable) berfungsi serupa

//Idealnya sebuah package pada Kotlin dituliskan dengan awalan nama domain perusahaan yang dibalik.
// Contoh, com.dicoding. Kemudian diikuti dengan nama package yang akan digunakan.

//menggunakan fungsi tersebut dengan mengimpor package-level function tersebut.
//import com.dikcoding.oop.utils.PI
//import com.dikcoding.oop.utils.faktorial
//import com.dikcoding.oop.utils.kekuatan
//import com.dikcoding.oop.utils.perkenalan

//--------
// atau bisa penulisan singkat untuk pemanggilan seluruh fungsi atau variabel dalam package tertentu
import com.dikcoding.oop.utils.*

fun main(){
    perkenalan()
    /*
    output:
Hai saya berasal dari com.dikcoding.oop.utils
     */
//-------------------------
    val prosesFaktorial = faktorial(6.0)
    println(prosesFaktorial)
/*
output:
720
 */
//    -----------------------------------
    val prosesKekuatan = kekuatan(4.0,3.0)
println(prosesKekuatan)
    /*
    output:
64.0
     */
//    ----------------
    val jariJari = PI
    println(jariJari)
    /*
    output:
  3.1415926535
     */
//    -------------------
    val luaslingkaran =luasLingkaran(49.0)
    println(luaslingkaran)
    /*
    output:
    307.876080043
     */
}