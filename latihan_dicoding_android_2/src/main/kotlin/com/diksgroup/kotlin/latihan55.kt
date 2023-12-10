package com.diksgroup.kotlin
// Import dan Packages
// Seluruh konten pada Kotlin, seperti kelas dan fungsi, dibungkus dalam sebuah package. Package tersebut digunakan
// untuk mengelompokkan kelas, fungsi dan variabel yang mempunyai kemiripan fungsionalitas. Untuk menggunakan kelas,
// fungsi maupun variabel yang berada pada suatu package, kita harus menuliskan secara lengkap alamat package tersebut.
// Sebagai contoh kita akan menggunakan kelas Random

//val beberapaInteger = kotlin.random.Random(0).nextInt(1,10)
/*
kode menunjukkan kelas Random berada pada package kotlin.random, tapi apakah perlu menuliskan kode sepanjang itu untuk
menggunakan sebuah kelas? Tentu tidak, untuk meminimalisir hal tersebut kita cukup mengimpor package kelas Random.
Dengan begitu kita tidak perlu menuliskan kode yang panjang secara berulang.
 */

// Importing Package
// Untuk mengimpor suatu package class, fungsi atau variabel, kita cukup menuliskan keyword import kemudian dilanjutkan
// dengan alamat spesifiknya
//import packagename.ClassName
//import packagename.functionName
//import packagename.propertyName

// karena class Random berada pada package kotlin.random maka penulisan menjadi
//import kotlin.random.Random

//Setelah kita impor kelas Random beserta alamat package-nya, kita dapat menuliskan kelas Random secara langsung tanpa
// menulis seluruh alamat package-nya. Tentunya hal ini akan membuat waktu dalam menuliskan kode lebih efisien.

//val beberapaInt = Random.nextInt(1,10)
/*
Biasanya terdapat banyak kelas, fungsi ataupun variabel dalam sebuah package. Contohnya kita akan menggunakan beberapa
fungsi dan variabel matematika pada package kotlin.math
 */

//import kotlin.math.PI
//import kotlin.math.cos
//import kotlin.math.sqrt
//
//fun main(){
//println(PI)
//    println(cos(120.0))
//    println(sqrt(49.0))
/*
output:
3.141592653589793
0.8141809705265618
7.0
 */

//}
/*
dapat mengganti nama sebuah kelas, fungsi atau variabel yang kita import dengan menggunakan alias yang direpresentasikan
 dengan kata kunci as
 */

//import kotlin.math.PI
//import kotlin.math.cos as cosinus
//import kotlin.math.sqrt as akar
//fun main(){
//println(PI)
//    println(cosinus(120.0))
//    println(akar(49.0))
//    }
/*
output:
3.141592653589793
0.8141809705265618
7.0
 */
/*
keyword as digunakan ketika menggunakan class, fungsi, variabel yang memiliki nama yang sama namun berbeda package-nya.
Ini bertujuan untuk menghindari ambiguitas.
 */
//--------------------------
/*
mengimpor seluruh kelas, fungsi dan variabel yang berada pada suatu package dengan menggunakan tanda  * pada akhir package tersebut
 */

import kotlin.math.*
fun main(){
    println(PI)
    println(cos(120.0))
    println(sqrt(49.0))
}
/*
output:
3.141592653589793
0.8141809705265618
7.0
 */