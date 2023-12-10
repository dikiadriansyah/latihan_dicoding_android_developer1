package com.diksgroup.kotlin

//    Nullable Receiver
//    mendeklarasikan sebuah extension dengan nullable receiver type. extension tersebut bisa dipanggil pada objek yang
//    bahkan nilainya null.

//    val Int?.slice: Int
//    get() = if(this == null) 0 else this.div(2)

//    contoh diatas if untuk memeriksa apakah receiver object bernilai null. jika tidak bernilai null, maka
//    receiver object tersebut akan secara otomatis di casting menjadi tipe non-null, sehingga kita bisa
//    menggunakan nilainya.

//    ----------------
//    selain if expression, bisa menggunakan elvis operator.
//val Int?.slice: Int
//    get() = this?.div(2) ?: 0

//    untuk memanggil seperti extension properties
//fun main(){
//val bilangan: Int? = null
//    print(bilangan.slice)
//output:
//    0
//}

//kapan membutuhkannya? jika kita mempunyai sebuah objek yg bernilai null. saat kita tidak menetapkannya dengan
// nullable receiver type, maka kita perlu memeriksa apakah objek tersebut bernilai null atau tidak?

//--------------------------------
// bisa menggunakan operator safe call setiap kali extension tersebut dipanggil.

//fun main(){
//    val bilangan: Int? = null
//    val bilanganDua: Int? = null
//
//    println(bilangan?.iris)
//    println(bilanganDua?.iris)
/*
output:
null
null
 */
//}

//val Int.iris: Int
//get() = this.div(2)
//----------------------------
//bisa menentukan nilai dari receiver object jika bernilai null.
//sehingga tidak perlu lagi menggunakan operator safe call ketika ingin memanggil extension

fun main(){
    val bilangan: Int? = null
    val bilanganDua: Int? = null

    println(bilangan.iris)
    println(bilanganDua.iris)
}

val Int?.iris: Int
get() = this?.div(2) ?: 0

/*
output:
0
0

 */