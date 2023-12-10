package com.diksgroup.kotlin

fun main(){
//    String Template
//menambahkan karakter $ sebelum variabel yang akan disisipkan dalam string
    val nama = "Dhiki Adriansyah"
//    println("nama saya adalah $nama")
//    output:
//    nama saya adalah Dhiki Adriansyah
//    -----------------------------------
//    bisa menyisipkan objek lain misal Int atau Double
    val umur = 24
//    print("nama saya adalah $nama, saya berusia $umur tahun ")
//    output:
//    nama saya adalah Dhiki Adriansyah, saya berusia 24 tahun
    //-----------------------------
//    bisa menyisipkan sebuah expression ke dalam sebuah string template. caranya sisipkan expression ke dalam
//    curly braces yang diikuti karakter $
    val jam = 7
    print("kantor ${if(jam > 7) "sudah tutup" else "sedang buka"}")
//    output:
//    kantor sedang buka
}