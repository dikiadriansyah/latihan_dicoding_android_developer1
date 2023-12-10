package com.diksgroup.kotlin

import kotlin.reflect.KProperty


// Property Delegation
/*
Sebagai contoh, kita memiliki tiga buah kelas yang di dalamnya memiliki satu properti String. Jika kita ingin menerapkan
getter dan setter pada setiap properti kelasnya, maka kita perlu menuliskan getter dan setter tersebut pada seluruh
kelas. Hal tersebut dapat mengurangi efisiensi dalam menuliskan kode karena terlalu banyak kode yang harus kita tulis
secara berulang. Solusinya, kita perlu membuat sebuah kelas yang memang bertugas untuk mengatur atau mengelola
 fungsi getter dan setter untuk sebuah properti kelas. Teknik tersebut pada Kotlin dinamakan Delegate.
 */

//membuat kelas delegasi


//class namaDelegasi{
//    private var nilai: String = "Default"
//
//    operator fun getValue(classRef: Any?, property: KProperty<*>):String{
//        println("FUngsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
//        return nilai
//    }
//
//    operator fun setValue(classRef: Any?, property: KProperty<*>, nilaiBaru: String){
//        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
//        println("Nilai ${property.name} dari $nilai akan berubah menjadi $nilaiBaru")
//nilai = nilaiBaru
//    }
//
//}

// kemudian untuk mendelegasikan sebuah properti kelas, gunakan keyword by dalam menginisialisasi properti tersebut
// kemudian diikuti dengan namanya
//class Benda{
//    var nama: String by namaDelegasi()
//}

// nilai properti nama dikelola melalui kelas namaDelegasi.
// mendelegasikan banyak properti yg terdapat banyak kelas kepada 1 delegate saja.
//class Manusia{
//    var nama: String by namaDelegasi()
//}

//class Hero{
//    var nama: String by namaDelegasi()
//}

//fun main(){
// membuat objek, ubah dan akses nilai properti pada setiap kelas
//    val benda = Benda()
//    benda.nama = "Gelas"
//    println("Nama Benda: ${benda.nama}")

    /*
output:
Fungsi ini sama seperti setter untuk properti nama pada class com.diksgroup.kotlin.Benda@27973e9b
Nilai nama dari Default akan berubah menjadi Gelas
FUngsi ini sama seperti getter untuk properti nama pada class com.diksgroup.kotlin.Benda@27973e9b
Nama Benda: Gelas
*/

//    val manusia=Manusia()
//    manusia.nama="Dhiki Adriansyah"
//    println("Nama Manusia: ${manusia.nama}")

    /*
    output:
    Fungsi ini sama seperti setter untuk properti nama pada class com.diksgroup.kotlin.Manusia@7530d0a
Nilai nama dari Default akan berubah menjadi Dhiki Adriansyah
FUngsi ini sama seperti getter untuk properti nama pada class com.diksgroup.kotlin.Manusia@7530d0a
Nama Manusia: Dhiki Adriansyah
     */

//    val hero = Hero()
//    hero.nama="Zilong"
//    println("Nama Pahlawan: ${hero.nama}")
    /*
    output:
    Fungsi ini sama seperti setter untuk properti nama pada class com.diksgroup.kotlin.Hero@3941a79c
Nilai nama dari Default akan berubah menjadi Zilong
FUngsi ini sama seperti getter untuk properti nama pada class com.diksgroup.kotlin.Hero@3941a79c
Nama Pahlawan: Zilong
     */


//}

// contoh diatas delegasi hanya dapat digunakan oleh properti yang memiliki tipe data String
//----------------------------------
// contoh membuat sebuah delegasi kelas umum yang dapat digunakan oleh seluruh tipe data dengan memanfaatkan
// tipe data Any
class delegasiKelasGenerik{
private var nilai: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any{
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return nilai
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, nilaiBaru: Any){
        println("")
        nilai = nilaiBaru

    }

}

class Hewan{
    var nama: Any by delegasiKelasGenerik()
    var berat: Any by delegasiKelasGenerik()
    var usia: Any by delegasiKelasGenerik()
}

class Orang{
    var nama: Any by delegasiKelasGenerik()
    var berat: Any by delegasiKelasGenerik()
    var usia: Any by delegasiKelasGenerik()
}

// membuat objek dari kelas Hewan, ubah dan akses nilai properti
fun main(){
    val hewan=Hewan()
    hewan.nama="miaw aug"
    hewan.berat=10.5
    hewan.usia=3
    println("Nama Hewan: ${hewan.nama}, memiliki berat: ${hewan.berat}, dan berusia ${hewan.usia} tahun")

    /*
    output:
    Fungsi ini sama seperti getter untuk properti nama pada class com.diksgroup.kotlin.Hewan@27973e9b
Fungsi ini sama seperti getter untuk properti berat pada class com.diksgroup.kotlin.Hewan@27973e9b
Fungsi ini sama seperti getter untuk properti usia pada class com.diksgroup.kotlin.Hewan@27973e9b
Nama Hewan: miaw aug, memiliki berat: 10.5, dan berusia 3 tahun

     */

    val orang=Orang()
    orang.nama="Firli Bahuri"
    orang.berat=60.7
    orang.usia=57
    println("Nama: ${orang.nama}, memiliki berat: ${orang.berat}, dan berusia: ${orang.usia} tahun")
/*
    output:
Fungsi ini sama seperti getter untuk properti nama pada class com.diksgroup.kotlin.Orang@133314b
Fungsi ini sama seperti getter untuk properti berat pada class com.diksgroup.kotlin.Orang@133314b
Fungsi ini sama seperti getter untuk properti usia pada class com.diksgroup.kotlin.Orang@133314b
Nama: Firli Bahuri, memiliki berat: 60.7, dan berusia: 57 tahun

     */
}
/*
kode diatas telah memberikan nilai pada setiap properti dengan tipe data yg berbeda. tapi dengan delegasiKelasGenerik
pengelolaan properti dapat digunakan pada seluruh tipe data properti
 */
