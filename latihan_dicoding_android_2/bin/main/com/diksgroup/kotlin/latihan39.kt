package com.diksgroup.kotlin
//Function Inside Function

// tujuan untuk memisahkan logika program dari fungsi utama
// tujuan adalah kode lebih terstruktur dan mudah dibaca.
// pada praktiknya terkadang kode yg ada pada fungsi tersebut malah lebih panjang dan susah dibaca. penyebab adalah
// karena penulisan kode yg berulang atau lain.

// untuk mengatasinya, bisa memisahkan lagi menjadi sebuah fungsi lokal(inner function) dengan hak akses terbatas hanya
// untuk fungsi terluar.
// ini bisa dilakukan karena pada kotlin bisa mendefinisikan sebuah fungsi dimana pun, bahkan di dalam sebuah fungsi
// (function inside function)
//contoh inner  function
//fun aturkata(pesan: String){
//    fun cetakPesan(teks: String){
//        println(teks)
//    }
//    cetakPesan(pesan)
//}

// fungsi cetakPesan() didefinisikan dalam fungsi aturKata(). mendefinisikan sebuah inner function sama halnya seperti
//----------------------------------
// kita mendefinisikan sebuah fungsi seperti biasa. kita bisa mengakses apa yg menjadi bagian fungsi terluar. contoh parameter dari fungsi aturKata() bisa diakses dari dalam fungsi print
//fun aturPesan(pesan: String){
//    fun cetakPesan(){
//        println(pesan)
//    }
//    cetakPesan()
//}
// inner function hanya bisa diakses setelah fungsi tersebut didefinisikan. jika kita coba mengekses sebelum fungsi
// maka akan tampil error.

//-------------------------------------
//pada kondisi seperti apa kita bisa memanfaatkan inner function?
//fun penjumlahan(nilaiA: Int, nilaiB: Int, nilaiC: Int): Int{
//    if(nilaiA == 0){
//        throw IllegalArgumentException("nilaiA harus lebih baik daripada 0")
//    }
//    if(nilaiB == 0){
//        throw IllegalArgumentException("nilaiB harus lebih baik daripada 0")
//    }
//    if(nilaiC == 0){
//        throw IllegalArgumentException("nilaiC harus lebih baik daripada 0")
//    }
//
//    return nilaiA+nilaiB+nilaiC
//
//}
// tidak ada yg salah dengan semua fungsi diatas.
//Fungsi tersebut akan berjalan dengan semestinya tanpa adanya eror selama kondisi yang berada di dalamnya tidak
// terpenuhi. Namun jika kita perhatikan, terdapat pengulangan kode yang sama yaitu penggunaan if expression untuk
// memeriksa apakah nilai dari argumen yang diberikan bernilai null.
//--------------
// disini memanfaatkan inner function untuk membuat kode yg ditulis berulang tersebut menjadi fungsi tersendiri

//fun penjumlahan(nilaiA: Int, nilaiB: Int, nilaiC: Int): Int{
//    fun validasiAngka(nilai: Int){
//        if(nilai == 0){
//            throw IllegalArgumentException("nilai harus lebih baik daripada 0")
//        }
//    }
//
//    validasiAngka(nilaiA)
//    validasiAngka(nilaiB)
//    validasiAngka(nilaiC)
//
//return nilaiA + nilaiB + nilaiC
//}

/*
setelah menjadi sebuah fungsi tersendiri, kode di dalam fungsi penjumlahan() lebih singkat dan tentunya lebih mudah
dibaca dibanding sebelumnya.
 */
//------------

// contoh inner function sebagai extension function.
fun penjumlahan(nilaiA: Int, nilaiB: Int, nilaiC: Int): Int{
fun Int.validasiAngka(){
    if(this == 0){
throw IllegalArgumentException("nilai harus lebih baik daripada 0")
    }
}
    nilaiA.validasiAngka()
    nilaiB.validasiAngka()
    nilaiC.validasiAngka()

    return nilaiA + nilaiB + nilaiC
}
//-----------------------------------

fun main(){
//val hasil = aturPesan("Assalamualaikum, perkenalkan nama saya dhiki")
//print(hasil)
    /*
    output:
    Assalamualaikum, perkenalkan nama saya dhiki
     */
//-----------------------------
    val hasil = penjumlahan(4,2,3)
    print(hasil)
    // output: 9
}