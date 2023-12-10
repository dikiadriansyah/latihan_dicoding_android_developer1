package com.diksgroup.kotlin
// Constraint Type Parameter
/*
Dalam penerapan generic, kita bisa membatasi tipe apa saja yang dapat digunakan sebagai parameter. Untuk menentukkan
batasan tersebut, bisa dengan menambahkan tanda titik dua (:) setelah tipe parameter yang kemudian diikuti oleh tipe
yang akan dijadikan batasan
 */
//class DaftarAngka<T : Number>: List<T>{
//    override fun get(index: Int): T{
//
//    }
//}
/*
kode di atas kita telah menentukan Number sebagai batasan tipe argumen. Dengan begitu, kita hanya bisa memasukkan
tipe argumen Number pada kelas ListNumber. Dan ketika kita memasukkan selain Number, maka akan terjadi eror
 */
//fun main(){
//val bungkus = DaftarAngka<Long>()
//    val bungkus2 = DaftarAngka<Int>()
////    val bungkus3 = DaftarAngka<String>() // error : Type argument is not within its bounds
//}

//----------------
/*
contoh lai dari constraint type parameter
 */

//fun <T : Number> List<T>.sumNumber() : T {
//    /* .. */
//}

/*
fungsi diatas merupakan extensions function dari kelas List yang mempunyai tipe parameter. Sama seperti
deklarasi generic pada sebuah fungsi, tipe parameter T pada fungsi tersebut juga akan digunakan sebagai receiver dan
return type. Perbedaannya terletak pada cara memanggilnya. Fungsi tersebut akan tersedia pada variabel List dengan
tipe argumen yang memiliki supertype Number.
 */
//fun main(){
//    val bungkus1 = listOf(1,2,3,4,5,6,7)
//    bungkus1.sumNumber()
//    val names = listOf("dicoding", "academy")
//    names.sumNumber() // error : inferred type String is not a subtype of Number
//}
//fun <T : Number> List<T>.sumNumber() : T {
//    /* .. */
//}