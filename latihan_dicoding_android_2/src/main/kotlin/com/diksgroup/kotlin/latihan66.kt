package com.diksgroup.kotlin

import kotlinx.coroutines.*

// Membuat Job Baru

/*
Job dapat diinisialisasikan menggunakan fungsi launch() maupun Job()
 */

// menggunakan launch()
//fun main()=runBlocking{
//val pekerjaan = launch {
//     lakukan latar tugas disini
//}
//}

// menggunakan job()
//fun main()= runBlocking {
//    val pekerjaan = Job()
//}

/*
Setelah diinisialisasikan, job akan memiliki state New dan akan langsung dijalankan. Jika Anda ingin membuat sebuah job
tanpa langsung menjalankannya, Anda bisa memanfaatkan CoroutineStart.LAZY
 */
//fun main() = runBlocking {
//    val pekerjaan = launch(start = CoroutineStart.LAZY){
//        TODO("Not Impelemented yet")
//    }
//}
//---------------------
// Menjalankan Job
/*
bisa menggunakan fungsi start()
 */

//fun main() = runBlocking{
//    val pekerjaan = launch(start = CoroutineStart.LAZY){
//        delay(1000L)
//        println("Mulai Pekerjaan Baru")
//    }
//
//        pekerjaan.start()
//    println("Tugas Lain")

    /*
    output:
    Tugas Lain
Mulai Pekerjaan Baru
     */
//}

// menggunakan fungsi join()
fun main() = runBlocking {
    val pekerjaan = launch(start = CoroutineStart.LAZY){
        delay(1000L)
        println("Mulai Pekerjaan Baru")
    }

    pekerjaan.join()
    println("Tugas Lain")
    /*
    output:
    Mulai Pekerjaan Baru
Tugas Lain
     */

    // Setelah dijalankan,  job akan memiliki state Active.
}

/*
perbedaan kedua kode:
start() akan memulai job tanpa harus menunggu job selesai.
join() akan menunda eksekusi sampai job selesai
 */