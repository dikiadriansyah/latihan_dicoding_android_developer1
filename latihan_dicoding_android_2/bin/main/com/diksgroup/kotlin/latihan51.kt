package com.diksgroup.kotlin
// Inheritance (Pewarisan)
// Sama halnya pada OOP, beberapa objek yang berbeda bisa saja memiliki kesamaan dalam hal tertentu. Di situlah konsep
// inheritance atau pewarisan harus diterapkan. Pewarisan dapat mencegah kita melakukan perulangan kode.

//mengubah diagram kelas Kucing menjadi sebuah kode:

//Dalam Kotlin untuk melakukan extends pada sebuah kelas dapat dilakukan dengan tanda :

// buat class HewanTiga yg berperan sebagai parent class:
open class HewanTiga(val nama: String, val berat: Double, val usia: Int, val cekKarnivora: Boolean){
   open fun makan(){
        println("$nama sedang makan")
    }

    //gunakan keyword open agar bisa di override
    open fun tidur(){
        println("$nama sedang tidur")
    }
}

// untuk membuat sebuah super atau parent class membutuhkan open class. kelas pada kotlin secara default bersifat final,
// oleh karena itu harus mengubahnya menjadi open class sebelum extends kelas.

// mewariskan class HewanTiga ke class Kucing dengan membuat child class
class Kucing(val jNama: String, val jWarnaBulu: String, val jBerat: Double, val jUsia: Int, val jJmlhKaki: Int, val jCekKarnivora: Boolean)
    : HewanTiga(jNama, jBerat, jUsia,jCekKarnivora){

    fun bermainDenganManusia(){
        println("$jNama bermain dengan manusia!")
    }

    //gunakan keyword override agar fungsi ini menulis ulang method di kelas HewanTiga
    override fun makan(){
        println("$jNama sedang makan ikan")
    }
//     modifier override untuk menandai method dan properti yang ingin dibuat ulang dari sebuah interface atau
//     superclass. Modifier override wajib ditambahkan di Kotlin—tidak seperti di Java.
//    jika Anda meng-override sebuah anggota dari superclass atau interface, member yang meng-override-nya juga akan
//    menjadi open secara otomatis

    override fun tidur(){
        println("$jNama sedang tidur di ranjang")
    }

}

//  kode diatas tidak masalah, tapi ketika akan membuat class dari diagram lain contoh ikan maka harus menuliskan ulang properti seperti

fun main(){
val kucing = Kucing("Maiwwaug", "Abu-Abu",42.4,20,4,true)
    kucing.tidur()
    kucing.makan()
    kucing.bermainDenganManusia()
    /*
    output:
    Maiwwaug sedang tidur di ranjang
Maiwwaug sedang makan ikan
Maiwwaug bermain dengan manusia!
     */
}