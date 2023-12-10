package com.diksgroup.kotlin

fun main(){
//    for loop

//for dapat digunakan pada range, collections, arrays dan apapun yg menyediakan iterator
//    val bilangan = 1..6
//    for(b in bilangan){
//        println("urutan adalah $b!")
//    }
//    output:
/*
  urutan adalah 1!
    urutan adalah 2!
    urutan adalah 3!
    urutan adalah 4!
    urutan adalah 5!
    urutan adalah 6!
 */

//    -------------------
//    val bilangan2 = 1.rangeTo(6)
//    for(b in bilangan2){
//        println("urutan adalah $b!")
//    }
    //    output:
/*
  urutan adalah 1!
    urutan adalah 2!
    urutan adalah 3!
    urutan adalah 4!
    urutan adalah 5!
    urutan adalah 6!
 */
//    ------------------------------------
//    val bilanganGanjil = 1.rangeTo(10) step 2
//    for(i in bilanganGanjil){
//        println("nilai ganjil adalah $i!")
//    }

//    output:
    /*
    * nilai ganjil adalah 1!
    * nilai ganjil adalah 3!
    * nilai ganjil adalah 5!
    * nilai ganjil adalah 7!
    * nilai ganjil adalah 9!
    *
    * */
//    kode diatas menambahkan ekstensi step yg aakan mengembalikan nilai baru dengan tipe IntProgression dengan jarak
//    nilai 3
//-----------------------------------------
// dapat mengakses indeks untuk setiap elemen yg ada pada ranges dengan memanfaatkan fungsi withIndex()
//    val bilanganGanjil = 1.rangeTo(10) step 2
//    for((index, value) in bilanganGanjil.withIndex()){
//        println("nilai $value, dengan index $index")
//    }

//    output
   /* nilai 1, dengan index 0
    nilai 3, dengan index 1
    nilai 5, dengan index 2
    nilai 7, dengan index 3
    nilai 9, dengan index 4
*/

//    --------------------------------------
// perulangan bisa memanfaatkan salah satu ekstensi pada kotlin yaitu forEach
//val bilanganGanjil = 1.rangeTo(10) step 2
//    bilanganGanjil.forEach{
//        value -> println("nilai adalah $value")
//    }
//    output
    /*
    * nilai adalah 1
nilai adalah 3
nilai adalah 5
nilai adalah 7
nilai adalah 9
    * */
//    kode diatas menggunakan foreach merupakan sebuah lambda expression yg hanya memiliki 1 argumen yaitu
//    nilai tunggal yg dicakup pada bilanganGanjil.
//    ---------------------
//    untuk mendapatkan indeks dari tiap nilai yg dicakup bisa menggunakan ekstensi forEachIndexed
//    val bilanganGanjil = 1.rangeTo(10) step 2
//    bilanganGanjil.forEachIndexed{
//        index, value -> println("nilai $value dengan index $index")
//    }

//    output:
    /*
    nilai 1 dengan index 0
nilai 3 dengan index 1
nilai 5 dengan index 2
nilai 7 dengan index 3
nilai 9 dengan index 4
     */

//    forEachIndexed memiliki 2 argumen. pertama adalah index yg merupakan indeks dari tiap nilai,
//    kedua adalah value yg merupakan nilai tunggal yg dicakup oleh ranges itu sendiri.
//    ----------------------------------
//    jika hanya ingin menggunakan argumen index, maka bisa mengubah argumen value menjadi _
val bilanganGanjil = 1.rangeTo(10) step 2
bilanganGanjil.forEachIndexed{
    index, _ -> println("urutan $index")
}

//    output:
/*
* urutan 0
urutan 1
urutan 2
urutan 3
urutan 4
*
* */
//    sebenernya ini sebuah aturan dimana ketika argumen dari sebuah lambada expression tidak digunakan, kita
//    disarankan mengubahnya menjadi _ untuk menggantikan nama dari argumen tersebut
//    ----------------------

}

