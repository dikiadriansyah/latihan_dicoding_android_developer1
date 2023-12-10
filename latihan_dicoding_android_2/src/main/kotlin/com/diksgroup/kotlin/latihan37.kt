package com.diksgroup.kotlin

fun main(){
//    Scope Function with Lambda Argumen let

//    Fungsi let menggunakan argumen (it) untuk mengakses konteks dari sebuah objek. Penggunaan fungsi let akan banyak
//    kita temukan pada objek yang bertipe non-null.

//    val pesan: String? = null
//    pesan?.let{
//        val panjang = it.length * 2
//        val kalimat = "panjang kalimat adalah $panjang"
//        println(kalimat)
//    }

//    ------------
    /*
    contoh penggunaan operator safe call
     */
//val pesan: String? = null
//    val panjang = pesan?.length ?: 0 * 2
//    val kalimat = "panjang kalimat $panjang"
//    println(kalimat)
/*
output:
panjang kalimat 0
 */
//-----------------
//    bagaimana jika objeknya bernilai null?
//    memanfaatkan fungsi lainnya yaitu run dan elvis operator.
//    val pesan: String? = null
//    pesan?.let{
//        val panjang = it.length * 2
//        val kalimat = "panjang kalimat $panjang"
//        println(kalimat)
//    } ?: run {
//        val kalimat = "pesan adalah null"
//        println(kalimat)
        /*
        output:
        pesan adalah null
         */

//    }
//    untuk nilai kembalian, bergantung pada expression yg berada di dalam blok lambda.
//    karena baris terakhir dari blok lambda adalah fungsi println(), maka nilai yang akan dikembalikan adalah Unit.
// ini dikarenakan fungsi println() mengembalikan nilai Unit.

//    -------------------------------
//    also
//    fungsi also sama seperti fungsi apply, dimana nilai yg dikembalikan adalah nilai dari konteks objek. namun untuk
//    objek tersedia sebagai argumen(it). fungsi also menggunakan konteks dari objek sebagai argumen tanpa harus
//    mengubah nilainya.
val pesan = "Assalamualaikum teman-teman semua"
    val hasil = pesan.also{
        println("panjang nilai -> ${it.length}")
    }
println("pesan -> $hasil")
    /*
    output:
    pesan -> Assalamualaikum teman-teman semua

     */
}
