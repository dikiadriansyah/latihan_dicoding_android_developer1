package com.diksgroup.kotlin
// Exception

/*
kode yg baik adalah kode yg terhindar dari segala bentuk kejadian dengan efek buruk pada aplikasi. kejadian tersebut
pada programming disebut Exception. Hal terburuk yang disebabkan oleh exception ini adalah dapat terhentinya aplikasi
ketika dijalankan. Hal seperti ini seharusnya kita hindari. Nah karena itu kita harus mengetahui cara menangani suatu
exception (Exception Handling).

Exception adalah event (kejadian) yang dapat mengacaukan jalannya suatu program. Pada Kotlin semua exception bersifat
Unchecked, yang artinya exception terjadi karena kesalahan pada kode kita.

contoh Unchecked Exception yg sering mengganggu jalan program:
ArithmeticException
NumberFormatException
NullPointerException

ArithmeticException merupakan exception yang terjadi karena kita membagi suatu bilangan dengan nilai nol.

 */

fun main(){
//val beberapaNilai=8
//    println(beberapaNilai/0)
    /*
    output:
    Exception in thread "main" java.lang.ArithmeticException: / by zero
     */

//    ----------------------
//    NumberFormatException disebabkan karena terjadi kesalahan dalam format angka. Sebagai contoh, kita akan mengubah
//    sebuah nilai String menjadi Integer tetapi nilai String yang akan kita ubah tidak memiliki format angka yang benar, sehingga dapat membangkitkan NumberFormatException.
//val beberapaNilaiString="16.0"
//    println(beberapaNilaiString.toInt())
    /*
    output:
     Exception in thread "main" java.lang.NumberFormatException: For input string: "16.0"
     */
//    --------------------------
//    NullPointerException(NPE)
    /*
    Walaupun Kotlin memiliki operator Null Safety, NPE tetap bisa saja terjadi. NPE terjadi karena sebuah variabel atau
    objek memiliki nilai null, padahal seharusnya objek atau variabel tersebut tidak boleh null.
     */
    val beberapaNilaiNull: String? =null
    val beberapaHarusTidakNilaiNull: String = beberapaNilaiNull!!
    println(beberapaHarusTidakNilaiNull)
    /*
    output:
 Exception in thread "main" kotlin.NullPointerException at MainKt.main(Main.kt:3)
     */
}