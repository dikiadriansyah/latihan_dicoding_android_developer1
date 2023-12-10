package com.diksgroup.kotlin
// Coroutines Builder

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

/*
modul sebelumnya menggunakan fungsi runBlocking dan launch merupakan coroutines builder.
// runBlocking dan launch adalah sebuah fungsi yang mengambil suspending lambda dan membuat coroutine untuk menjalankannya.


beberapa coroutine builder:
launch
runBlocking
async

 */
// contoh async:
suspend fun getCapital(): Int{
    delay(1000L)
    return 50000
}

suspend fun getIncome():Int{
    delay(1000L)
    return 76000
}
/*
delay pada kedua fungsi tersebut adalah waktu yang dibutuhkan untuk melakukan operasi sebelum hasilnya didapatkan.
Selanjutnya kita ingin memanfaatkan keduanya, misalnya untuk menghitung keuntungan
 */
fun main() = runBlocking{
//val capital = getCapital()
//    val income = getIncome()
//    println("keuntungan anda adalah ${income - capital}")
    /*
    output:
    keuntungan anda adalah 26000
     */
    /*
    kode diatas menggunakan pendekatan sequential.
    Pada dasarnya kode di dalam coroutines juga dijalankan secara berurutan seperti kode normal lain. Dalam praktiknya
    kita melakukan ini jika kita menggunakan hasil dari fungsi pertama untuk membuat keputusan apakah kita perlu
    memanggil fungsi kedua.

     Bagaimana jika tidak ada ketergantungan antara fungsi getCapital dan getIncome dan kita ingin menjalankan
     keduanya secara bersamaan? Di sinilah async dibutuhkan.
     */

//    val capital = async { getCapital() }
//    val income = async{ getIncome()}
//    println("Keuntungan Anda Adalah ${income.await()-capital.await()}")
/*
    output:
    keuntungan anda adalah 26000
     */

    /*
    kode diatas telah memanggil fungsi getCapital dan getIncome di dalam async.Maka async akan mengembalikan hasil dari
    masing-masing fungsi. Lalu untuk mengakses hasil tersebut, kita perlu menggunakan fungsi await.

     perbedaan dengan kode sebelumnya? Dengan async seolah-olah kedua fungsi tersebut berjalan bersamaan dan membutuhkan
      waktu yang lebih singkat dari kode sebelumnya.
     */

    val waktuPertama = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Keuntungan Anda Adalah ${income - capital}")
        /*
    output:
    keuntungan anda adalah 26000
     */
    }

    val waktuKedua = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Keuntungan Anda Adalah ${income.await() - capital.await()}")
    }
    // output:
//    Keuntungan Anda Adalah 26000
//    Keuntungan Anda Adalah 26000

    /*
    kode yg dijalankan di dalam async bisa selesai hampir 2 kali lebih cepat dibandingkan tanpa async
     */
}