package com.diksgroup.kotlin
// Deferred
/*
 Deferred adalah nilai tangguhan yang dihasilkan dari proses coroutines. Nilai ini nantinya bisa kita kelola sesuai
 dengan kebutuhan.
 Deferred dapat kita ciptakan secara manual. Meskipun begitu, dalam praktiknya, jarang kita membuat deferred secara
 manual. Biasanya kita hanya bekerja dengan deferred yang dihasilkan oleh async.
 */
/*
Pada dasarnya, nilai deferred juga merupakan sebuah job. Ia diciptakan dan dimulai pada saat coroutines mencapai
state active. Bagaimanapun, fungsi async juga memiliki opsional parameter seperti CoroutineStart.LAZY untuk memulainya.
Dengan begitu, deferred juga bisa diaktifkan saat fungsi start, join, atau await dipanggil.
 */
import kotlinx.coroutines.*
fun main()=runBlocking{
    val capital = async { getCapital() }
    val income = async { getIncome() }
println("keuntungan anda adalah ${income.await() - capital.await()}")
}
/*
output:
keuntungan anda adalah 26000
 */

//capital dan income adalah contoh dari nilai deferred yang untuk mengaksesnya kita membutuhkan fungsi await.