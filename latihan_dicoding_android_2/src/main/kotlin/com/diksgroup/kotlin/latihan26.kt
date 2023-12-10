package com.diksgroup.kotlin

//fun main(){
//    Functional Programming

//    kotlin adalah Multiparadigm Programming Language. selain bahasa Pemrograman Berorientasi Objek(PBO) sebagai
//    penulisan sintaksnya dan Functional Programming (FP)

//    val list = dapatkanPengguna()
//    fun dapatkanUsername(): List<String>{
//        val nama = mutableListOf<String>()
//        for(pengguna in list){
//            nama.add(pengguna.nama)
//        }
//        return nama
//    }
//    kode diatas untuk mendapatkan nilai tertentu dari sebuah list. karena kotlin bisa dituliskan dengan
//    gaya fungsional, maka ditulis sebagai berikut:
//    fun dapatkanUsernameDua():List<String>{
//        return list.map{
//            it.name
//        }
//    }
//------------------------------
//    println(name("Adriansyah"))
// output:
/*
Dhiki Adriansyah
 */

//}
//val name = {
//    val firstname = "diki"
//    val lastname = "adriansyah"
//    "$firstname $lastname"
//}

//val name: (String)->String = {
//    value->
//    val firstname = "Dhiki"
//
//    "$firstname $value"
//}

//----------------------------------------
//high order function
//fun main(){
//    printName("Adriansyah", {
//        value->
//        val first = "Dhiki"
//        "$first $value"
//    })
// output:
/*
Dhiki Adriansyah
 */

    // ---------------------
//    cetakHasil(14, penjumlahan)
// output:
//    28

//}

//fun printName(value: String, name:(String)->String){
//println(name(value))
//}

//val name: (String)->String = {
//    value->
//    val first = "Dhiki"
//    "$first $value"
//}

//fun cetakHasil(value: Int, penjumlahan: (Int)->Int){
//    val hasil = penjumlahan(value)
//    println(hasil)
//}
//
//var penjumlahan: (Int)->Int={
//    value-> value+value
//}

//---------------------
// extensions function
//fun main(){
//    14.cetakInt()
//}
//fun Int.cetakInt(){
//    print("nilai $this")
////output:
////    nilai 14
//}


//fun main(){
//val diki = "Diki Adriansyah".firstAndLast()
//val first = diki["first"]
//val last = diki["last"]
//println("Pertama $first Terakhir $last")

    // output:
//    Pertama D Terakhir i
//}

//fun String.firstAndLast(): Map<String, Char>{
//    return mapOf(
//        "first" to first(),
//        "last" to last()
//    )
//}
//----------------
//extensions property

//fun main(){
//    println(24.slice)
//}
//val Int.slice: Int
//get() = this/2



//fun main(){
//    val nama = "Dhiki Adriansyah".firstAndLast
//    val depan = nama["depan"]
//    val belakang = nama["belakang"]
//    println("Pertama $depan  Terakhir $belakang")
//}
//
//val String.firstAndLast: Map<String, Char>
//get()=mapOf(
//    "depan" to first(),
//    "belakang" to last()
//)
//-------------------------------------
// Scope Functions
//fun main(){
//    val nama = StringBuilder()
//    nama.append("Dhiki")

//    nama.apply{
//        append("Dhiki")
//        append(" Adriansyah")
//    }
//    println(nama.toString())
    /*
    output:
    Dhiki Adriansyah
     */
//}
//--------------------------------
// collection function
//fun main(){
//    val bilangan = 1..11
//    println(bilangan.take(4))
/*
output:
[1,2,3,4]
 */
//}
//--------------------------
//Object-oriented Programming(OOP)
fun main(){
    val pengguna = Pengguna("Dhiki Adriansyah")
pengguna.cetakNama()
}

class Pengguna(val nama: String){
fun cetakNama(){
    println(nama)
}
}