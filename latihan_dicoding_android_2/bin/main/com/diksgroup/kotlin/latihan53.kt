package com.diksgroup.kotlin
// Abstract Class
// abstract adalah gambaran umum dari sebuah class. abstract tidak dapat direalisasikan dalam sebuah object.

// pada sub-modul sebelumnya sudah mempunyai class HewanEmpat. Secara harfiah hewan merupakan sebuah sifat. Kita tidak
// tahu bagaimana objek hewan tersebut. Kita tahu bentuk kucing, ikan dan ular seperti apa tetapi tidak untuk hewan.
// maka dari itu konsep abstract class diterapkan agar kelas Hewanempat tidak dapat direalisasikan dalam bentuk object
// namun tetap dapat menurunkan sifat kepada child class.

/*
Untuk menjadikan sebuah kelas abstract, kita hanya perlu menambahkan keyword abstract sebelum menuliskan nama kelas
 */

abstract class HewanEmpat(val nama: String, berat: Double, usia: Int, cekKarnivora: Boolean){
    fun makan(){
        println("$nama sedang makan")
    }

   open fun perilaku(){
        println("$nama sedang tidur")
    }
}
// dengan abstract class HewanLima tidak dapat inisialisasikan menjadi sebuah object

//-----------
//class KucingDua(val jnama: String, val jberat: Double, val jusia: Int, val jcekKarnivora: Boolean)
//    :HewanLima(jnama, jberat, jusia,jcekKarnivora){
//    override fun perilaku(){
//        println("$jnama sedang tidur, makan ikan seberat $jberat kg, berusia $jusia tahun, dan jenis hewan: $jcekKarnivora ")
//    }
//}
//-----------
fun main(){
//    val kucing = HewanEmpat("DanaMiaww", 14.2, 2, true)
    // ketika mencoba membuat objek dari class HewanLima akan terdapat error

//    ----------------
//val kucing=KucingDua("DanaMiaww", 20.4, 4,true)
//    kucing.perilaku()
}