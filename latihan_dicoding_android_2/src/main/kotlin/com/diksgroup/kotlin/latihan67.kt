package com.diksgroup.kotlin

import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.*

// Membatalkan Job
/*
Ibarat pekerjaan di dunia nyata, sebuah job seharusnya bisa dibatalkan. Hanya job yang sedang aktif yang dapat
dibatalkan. Anda bisa melakukannya dengan memanggil fungsi cancel()
 */
//fun main() = runBlocking{
//val pekerjaan = launch {
//delay(5000)
//    println("Mulai Pekerjaan Baru")
//}
//
//    delay(2000)
//    pekerjaan.cancel()
//    println("Pekerjaan Batal")
//    if(pekerjaan.isCancelled){
//        println("Pekerjaan telah batal")
//    }
    /*
    output:
    Pekerjaan Batal
Pekerjaan telah batal
     */

    /*
 Kode di atas menggambarkan sebuah job membutuhkan waktu 5 detik untuk dijalankan. Namun ketika mencapai waktu
 2 detik, job tersebut telah dibatalkan. Saat fungsi cancel() dipanggil, job akan memasuki state Cancelling sampai
 pembatalan tersebut berhasil. Kemudian setelah pembatalan berhasil, job akan memiliki state Cancelled dan Completed.

    Perlu diketahui bahwa jika cancel() dipanggil dalam job baru yang belum dijalankan, job tersebut tidak akan melalui
    state Cancelling, melainkan akan langsung memasuki state Cancelled.

         */

    /*
    Kita juga bisa menambahkan parameter terhadap fungsi cancel(), yaitu parameter cause yang bisa digunakan untuk
    memberitahu kenapa sebuah job dibatalkan.
     */
    /*
CancellationException akan mengirimkan nilainya sebagai pengecualian dari job tersebut. Kita pun bisa mengakses nilai
tersebut dengan fungsi getCancellationException. Karena getCancellationException masih tahap eksperimen, Anda perlu
menambahkan anotasi @InternalCoroutinesApi.
     */
//}

@InternalCoroutinesApi
fun main()= runBlocking {
    val pekerjaan = launch {
        delay(5000)
        println("Mulai Pekerjaan Baru")
    }

    delay(2000)
    pekerjaan.cancel(cause = CancellationException("waktu sudah berakhir"))
println("Pekerjaan Batal..")
    if(pekerjaan.isCancelled){
        println("Pekerjaan telah batal karena ${pekerjaan.getCancellationException().message}")
    }
}
/*
output:
Pekerjaan Batal..
Pekerjaan telah batal karena waktu sudah berakhir

 */