package com.diksgroup.kotlin

// Memulai Coroutines
/*
Coroutines hanyalah library lain yang disediakan oleh JetBrains. Untuk itu, agar bisa menggunakannya Anda perlu
menambahkan dependensi berikut pada build.gradle.kts
 */

import kotlinx.coroutines.*

fun main() = runBlocking{
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)

    /*
    output:
    Hello,
Coroutines!
     */

    /*
    kode diatas menggunakan fungsi runBlocking untuk memulai coroutine utama dan launch untuk menjalankan coroutine baru.

   Kata Hello, akan ditampilkan lebih awal dan kata Coroutines! Akan ditampilkan 1 detik setelahnya. Mengapa demikian?
   Padahal jika diperhatikan, kode untuk menampilkan kata Coroutines! dituliskan lebih dulu.

   Fungsi delay(1000L) di dalam launch digunakan untuk menunda kode berikutnya selama 1 detik. delay adalah fungsi yang
   spesial pada coroutines. Ia merupakan sebuah suspending function yang tidak akan memblokir sebuah thread.

Selama proses penundaan tersebut, main thread akan terus berjalan sehingga fungsi println("Hello,") akan langsung
dijalankan. Setelah 1 detik, baru fungsi println("Coroutines!") akan dijalankan. Sedangkan kode delay(2000L) digunakan
untuk menunda selama 2 detik sebelum JVM berakhir.


     */
}