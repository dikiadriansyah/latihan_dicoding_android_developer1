package com.diksgroup.kotlin

fun main(){
//   1. Int(32 bit)
//    val intNumber = 100

//   2. Long (64 bit)
// val longNumber: Long = 100
//    val longNumber = 100L

//    3. Short (16 bit)
// val shortNumber: Short = 10

//    4. byte (8 bit)
// val byteNumber = 0b11010010

//    5. double (64 bit)
// val doubleNumber: Double = 1.3

//    6. float (32 bit)
// val floatNumber: Float = 0.123456789f //yang terbaca hanya 0.1234567

val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

//    println(maxInt)
//    println(minInt)
    /*
        output :
               2147483647 (dua miliar seratus empat puluh tujuh juta)
               -2147483648
        */

//    -------------
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow
//println("Maksimal Int: $maxInt")
//    println("Di luar Int: $overRangeInt")

//    output
//    Maksimal Int: 2147483647
//    Di luar Int: -2147483648

//    ----------------
//    operator matematika pada tipe data number
    val umurAndi = 14
    val umurSasa = 21
//    println(umurAndi + umurSasa)
//    output:
//    35

//    -----------
//    sama seperti perhitungan matematika dimana operasi perkalian dan pembagian di dahulukan
//    println(3+8*2)
//    output
//    19
//    -------------
//    perhitungan didahulukan dengan tanda kurung()
//    print((2+3)*4)
//output:
//    20
//    -------------------
    val byteNumber: Byte = 1
//    val intNumber: Int = byteNumber // compile error
//    Kode akan gagal dikompilasi dengan log eror berikut:
//Error:(4, 18) Kotlin: Type mismatch: inferred type is Byte but Int was expected

    val intNumber2: Int = byteNumber.toInt() // compile error
//println(intNumber2)
//    output:
//    1

//    toInt() untuk melakukan konversi secara eksplisit dari tipe data Byte ke tipe data Int.
//    Adapun beberapa fungsi konversi yang dapat kita gunakan antara lain:
//    toByte(): Byte
//    toShort(): Short
//    toInt(): Int
//    toLong(): Long
//    toFloat(): Float
//    toDouble(): Double
//    toChar(): Char

//contoh lain toInt() untuk konversi tipe data string ke integer:
    val usiaAli = "24"
    val nambahUsia = 2
//    print(usiaAli.toInt() + nambahUsia)
//output:
//    26
//    ----------------
//    contoh nilai numerik yang "readable" dengan menggunakan tanda underscores
    val uangAni = 10_000
    println(uangAni)
//    output:
//    10000
}