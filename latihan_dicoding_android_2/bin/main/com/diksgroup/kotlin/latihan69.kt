package com.diksgroup.kotlin
// Coroutine Dispatcher

/*
Seperti yang sudah kita ketahui, coroutines berjalan di atas sebuah thread. Tentunya kita harus mengetahui thread mana
yang akan digunakan untuk menjalankan dan melanjutkan sebuah coroutine. Untuk menentukannya kita membutuhkan sebuah
base class bernama CoroutineDispatcher. Di dalam kelas tersebut kita akan menemukan beberapa objek yang nantinya bisa
digunakan untuk menentukan thread yang berfungsi menjalankan coroutines.
 */

/*
Dispatchers.Default

Merupakan dispatcher dasar yang digunakan oleh semua standard builders seperti launch, async, dll jika tidak ada
dispatcher lain yang ditentukan. Dispatchers.Default menggunakan kumpulan thread yang ada pada JVM. Pada dasarnya,
jumlah maksimal thread yang digunakan adalah sama dengan jumlah core dari CPU.
Untuk menggunakannya, Anda cukup menggunakan coroutines builder tanpa harus menuliskan dispatcher secara spesifik
 */

//launch(Dispatchers.Default){
//
//}

//-----------
// Dispatchers.IO
/*
Sebuah dispatcher yang dapat digunakan untuk membongkar pemblokiran operasi I/O. Ia akan menggunakan kumpulan thread
yang dibuat berdasarkan permintaan. Anda bisa menerapkannya dengan menambahkan Dispatchers.IO pada coroutines builder
 */
//launch(Dispatcher.IO){
//    // TODO: Implement algorithm here
//}
//-----------
//Dispatchers.Unconfined
/*
Dispatcher ini akan menjalankan coroutines pada thread yang sedang berjalan sampai mencapai titik penangguhan. Setelah
penangguhan, coroutines akan dilanjutkan pada thread dimana komputasi penangguhan yang dipanggil.
Sebagai contoh, ketika fungsi a memanggil fungsi b, yang dijalankan dengan dispatcher dalam thread tertentu, fungsi a
akan dilanjutkan dalam thread yang sama dengan fungsi b dijalankan
 */

import kotlinx.coroutines.*

//fun main() = runBlocking<Unit>{
//launch(Dispatchers.Unconfined) {
//    println("Memulai dalam ${Thread.currentThread().name}")
//    delay(1000)
//    println("Melanjutkan dalam ${Thread.currentThread().name}")
//}.start()
//
//}
/*
output:
Memulai dalam main @coroutine#2
Melanjutkan dalam kotlinx.coroutines.DefaultExecutor @coroutine#2

 */
/*
coroutine telah dimulai dari main thread, kemudian tertunda oleh fungsi delay selama 1 detik. Setelah itu, coroutine
dilanjutkan kembali pada thread DefaultExecutor.
 */

/*
beberapa builder yang dapat digunakan untuk menentukan thread
 */

// Single Thread Context
/*
Dispatcher ini menjamin bahwa setiap saat coroutine akan dijalankan pada thread yang Anda tentukan. Untuk menerapkannya,
 Anda bisa memanfaatkan newSingleThreadContext()
 */

//fun main()= runBlocking<Unit> {
//    val bungkusDispatcher = newSingleThreadContext("ThreadKu")
//    launch(bungkusDispatcher){
//        println("Mulai dalam ${Thread.currentThread().name}")
//        delay(1000)
//        println("Melanjutkan dalam ${Thread.currentThread().name}")
//    }.start()
    /*
    output:
    Mulai dalam ThreadKu @coroutine#2
Melanjutkan dalam ThreadKu @coroutine#2
     */

    // walaupun sudah menjalankan fungsi delay, coroutine tetap berjalan pada ThreadKu
//}

//Thread Pool
/*
sebuah dispatcher yang memiliki kumpulan thread. Ia akan memulai dan melanjutkan coroutine di salah satu thread yang
tersedia pada kumpulan tersebut. Runtime akan menentukan thread mana yang tersedia dan juga menentukan bagaimana proses
distribusi bebannya. Anda bisa menerapkan thread pool dengan fungsi newFixedThreadPoolContext()
 */

fun main()= runBlocking<Unit> {
    val bungkusDispatcher = newFixedThreadPoolContext(3, "ThreadKu")

    launch(bungkusDispatcher){
        println("Mulai dalam ${Thread.currentThread(). name}")
        delay(1000)
        println("Melanjutkan dalam ${Thread.currentThread().name}")
    }
}
/*
output:
Mulai dalam ThreadKu-1 @coroutine#2
Melanjutkan dalam ThreadKu-2 @coroutine#2

 */

/*
kode diatas menetapkan thread PoolKu sebanyak 3 thread. Runtime akan secara otomatis menentukan pada thread mana
coroutine akan dijalankan dan dilanjutkan.
 */