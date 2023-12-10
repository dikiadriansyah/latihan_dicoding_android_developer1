package com.diksgroup.kotlin

fun main(){
//    Safe calls dan Elvis operator

//    Safe calls operator (?.)
//    dengan safe call mengganti tanda titik(.) dengan tanda(?.) saat mengakses atau mengelola nilai dari objek nullable
//    compiler akan melewatkan proses jika objek tersebut bernilai null
//    val alamat: String? = null
//    alamat?.length
//    println(alamat)
    // output:
//    null
//--------------------------------
//    Elvis Operator(?:)
//    Elvis operator untuk menetapkan default value atau nilai dasar jika objek bernilai null.
//val panjangAlamat = alamat?.length ?: "jl timur raya"
//    println(panjangAlamat)

//    kode diatas sama seperti menggunakan if/else
//    val panjangAlamat = if(alamat != null) alamat.length else "jl timur raya"
//    Elvis akan mengembalikan nilai text.length jika text tidak bernilai null. Sebaliknya, jika text bernilai null
//    maka default value yang akan dikembalikan.

//    ----------------------------------
//    penggunaan operator non-null assertion(!!)
val alamat: String? = null
    val panjangAlamat = alamat!!.length // ready to go???
//    println(panjangAlamat)

//    dengan non-null assertion compiler akan mengizinkan untuk mengakses atau mengelola nilai dari sebuah objek
//    nullable. penggunaan operator tersebut tidak disarankan karena akan memaksa sebuah objek menjadi non-null.
//    sehingga objek tersebut bernilai null, anda tetap akan berjumpa dengan NullPointerException.
}

