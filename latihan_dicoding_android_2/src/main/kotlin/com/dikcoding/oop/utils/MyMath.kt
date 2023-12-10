package com.dikcoding.oop.utils

fun perkenalan() = println("Hai saya berasal com.dikcoding.oop.utils")


fun kekuatan(angka: Double, tenaga: Double):Double{
    var hasil = 1.0
    var penghitung = tenaga
    while(penghitung > 0){
        hasil *= angka
        penghitung--
    }
    return hasil
}

fun faktorial(angka: Double): Double{
    var hasil =  1.0
    var penghitung = 1.0
    while(penghitung <= angka){
        hasil *= penghitung
        penghitung++
    }
    return hasil
}

const val PI = 3.1415926535 // package level variable

fun luasLingkaran(radius: Double):Double{
    return PI * 2 * radius
}


