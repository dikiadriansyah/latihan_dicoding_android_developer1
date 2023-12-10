package com.diksgroup.kotlin

// Properties
// properti dapat dideklarasikan sebagai nilai mutable dengan menggunakan var atau sebagai nilai read-only dengan
// menggunakan val.

//Property Accessor(PA)
// Secara standar ketika properti pada kelas dibuat mutable, maka Kotlin akan menghasilkan fungsi getter dan setter
// pada properti.
//Jika properti pada sebuah kelas dibuat read-only, Kotlin hanya akan menghasilkan fungsi getter pada properti.
//bisa membuat fungsi getter dan setter secara manual jika pada kasus tertentu Anda perlu untuk override fungsi tersebut.

//class Kartun{
//    var nama: String="Naruto Shipudden"
//}

fun main(){
//val kartunTv = Kartun()
//    println("Nama: ${kartunTv.nama}")
    /*
    output:
    Nama: Naruto Shipudden
     */

//    kartunTv.nama = "Kakashi Hatake"
//    println("Nama: ${kartunTv.nama}")
    /*
    output:
    Nama: Kakashi Hatake
     */

    /*
pada kode ${kartunTv.nama} terjadi proses pemanggilan fungsi get pada properti nama. namun kita tidak melakukan override
pada fungsi getter sehingga fungsi tersebut hanya mengembalikan nilai nama. begitu juga pada kode
kartunTv.nama = "Kakashi Hatake" pada kode terjadi pemanggil fungsi setter pada properti nama
----------------------------------------------------
melakukan override pada fungsi getter dan setter, maka dapat menambahkan kode lain pada fungsi getter sesuai dengan
kebutuhan
     */
}
//-------------------------------
/*
coba modifikasi kode sebelumnya
 */
//class Kartun{
//    var nama: String = "Naruto Shippuden"
//    get(){
//        println("Fungsi Getter terpanggil")
//        return field
//    }
//    set(nilai){
//        println("fungsi setter terpanggil")
//        field = nilai
//    }
//}
/*
output:
Fungsi Getter terpanggil
Nama: Naruto Shippuden
fungsi setter terpanggil
Fungsi Getter terpanggil
Nama: Kakashi Hatake
 */

/*
urutan pendefinisian fungsi get() dan set() tidak penting. kita dapat mendefinsikan fungsi get() tanpa mendefinsikan
fungsi set(). terpenting pendeklarasian dilakukan setelah mendeklarasi properti.
pada fungsi get() perlu mengembalikan nilai sesuai tipe data dari propertinya atau kita dapat mengembalikan nilai dari
properti itu sendiri dengan menggunakan keyword field.
untuk fungsi set() kita memerlukan sebuah parameter. Ini merupakan sebuah nilai baru yang nantinya akan dijadikan nilai
properti. Pada kode di atas parameter tersebut ditetapkan dengan nama nilai.
 */