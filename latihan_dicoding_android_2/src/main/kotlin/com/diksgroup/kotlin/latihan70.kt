package com.diksgroup.kotlin
// Channels

/*
eperti kita ketahui, sebuah program dapat memiliki banyak thread dan dalam beberapa thread bisa terdapat jutaan
coroutines. Lalu, bagaimana jika ada 2 (dua) coroutines yang saling ingin berinteraksi satu sama lain? Channels
adalah jawabnya.
* */

/*
Beberapa masalah yang muncul pada concurrency seperti deadlock, race conditions, dan lainnya, sering kali dipicu oleh
satu hal, apa itu? Rupanya problem pembagian memori atau sumber daya antar thread. Untuk mengatasinya, banyak
programming language seperti Go, Dart, dan juga Kotlin telah menyediakan channels.
 */

/*
Channels adalah nilai deferred yang menyediakan cara mudah untuk mentransfer nilai tunggal antara coroutine.
Pada dasarnya, channels sangat mirip dengan BlockingQueue . Namun, alih-alih memblokir sebuah thread, channels
menangguhkan sebuah coroutine yang jauh lebih ringan.
 */
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
fun main() = runBlocking(CoroutineName("main")){
val ch = Channel<Int>()
    launch(CoroutineName("v1coroutine")){
        println("Mengirim dari ${Thread.currentThread().name}")
        for(x in 1..5){
            ch.send(x * x)
        }

    }

    repeat(5){
        println(ch.receive())
    }

    println("Menerima dalam ${Thread.currentThread().name}")

    /*
    output:
Mengirim dari main @v1coroutine#2
1
4
9
16
25
Menerima dalam main @main#1
     */
}

/*
Bisa dilihat bahwa pada coroutine v1coroutine bahwa channels telah mengirimkan nilai dari hasil komputasi dengan
menggunakan fungsi send. Setelah itu, di coroutine lain (main) channel menerima nilai dengan menggunakan fungsi receive.

Kesimpulannya, channels memungkinkan komunikasi yang aman antar kode concurrent. Ia membuat kode concurrent dapat
berkomunikasi dengan mengirim dan menerima pesan tanpa harus peduli di thread mana coroutine berjalan.
 */