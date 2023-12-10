package com.diksgroup.kotlin

fun main(){
//    Arrays
//    untuk membuat array bisa memanfaatkan sebuah library function arrayOf()
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)
    println(mixArray[2])
//    output:
//    5

//kotlin memungkinkan untuk membuat array dengan tipe data primitif memanfaatkan fungsi spesifik:
   /* intArrayOf() : IntArray
    booleanArrayOf() : BooleanArray
    charArrayOf() : CharArray
    longArrayOf() : LongArray
    shortArrayOf() : ShortArray
    byteArrayOf() : ByteArray
*/

    val intArray = intArrayOf(1,3,5,7,9,11,13)
    println(intArray[3])
//output:
//    7
    //----------------------
    val bilanganGenap = intArrayOf(2,4,5,8,10,12,14,16)
bilanganGenap[2] = 6
    println(bilanganGenap[2])
    //output:
//    6
}
