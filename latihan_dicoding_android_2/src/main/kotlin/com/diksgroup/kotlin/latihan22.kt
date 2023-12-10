package com.diksgroup.kotlin

fun main(){
//    Set
//    merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik.
// set untuk menginginkan tidak ada data yg sama atau duplikasi dalam sebuah collection.

//    val numerikUnik = setOf(1,2,3,4,3,1,5)
//    println(numerikUnik)
//    output:
//    [1,2,3,4,5]
//    secara otomatis fungsi setOf akan menghapus angka yg sama.
//    -------------------------------
//    Selain itu urutan pada Set bukanlah sesuatu yang penting, sehingga apabila kita bandingkan dua buah Set yang
//    memiliki nilai yang sama dan urutan yang berbeda, akan tetap dianggap sama.
//val kelompokNumerikA=setOf(1,2,3,4,3,1,5)
//    val kelompokNumerikB=setOf(1,2,3,4,5)
//println(kelompokNumerikA == kelompokNumerikB)
//    output:
//    true

//    -------------------------
// pengecekan apakah sebuah nilai ada di dalam set dengan menggunakan keyword in
//    println(4 in kelompokNumerikA)
//    output:
//    true
//    ------------------------------
//    fungsi union dan intersect untuk mengetahui gabungan dan irisan dari 2 buah Set.
//    val kelompokNumerikC = setOf(1,5,7)
//    val gabunganKelompok = kelompokNumerikA.union(kelompokNumerikC)
//    println(gabunganKelompok)
    /*
    output:
    [1, 2, 3, 4, 5, 7]
     */

//    val irisanKelompok = kelompokNumerikA.intersect(kelompokNumerikC)
//    println(irisanKelompok)
//    output:
//[1,5]
//--------------------
//    informasi tambahan:
//    mutableSet bisa menambah dan menghapus item namun tidak bisa mengubah nilai pada List.
    val numericMutableSet = mutableSetOf(1,2,4,5,2,1)
//    numericMutableSet[2] = 8 // tidak bisa mengubah set immutable
    numericMutableSet.add(9)
//    println(numericMutableSet)
//    output:
//    [1,2,4,5,9]
    numericMutableSet.remove(2)
    println(numericMutableSet)
//    output:
//    [1,4,5,9]

}