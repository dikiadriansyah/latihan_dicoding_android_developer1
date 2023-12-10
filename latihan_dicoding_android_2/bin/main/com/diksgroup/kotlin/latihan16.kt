package com.diksgroup.kotlin

fun main(){
//    Range

//    kita dapat menentukan nilai awal dan nilai akhir pada Range.
//    range ditandai dengan operator ... atau dengan fungsi rangeTo() dan downTo()
//    val bilanganBulat = 1..10
//    println(bilanganBulat.step)
    /* output:
    1
     */

//    kode diatas variabel bilanganBulat mencakup 1,2,3,4,5,6,7,8,9,10. jarak antara 2 nilai yg dicakup, ditentukan
//    oleh step. secara default, step bernilai 1. untuk mendapatkan step kita bisa menggunakan properti step

//    ----------------------
//    val bilanganBulat = 1..10 step 3
//    bilanganBulat.forEach{
//        print("$it ")
//    }
//    println(bilanganBulat.step)
    /*
    * output:
    * 1 4 7 10 3
    *
    * */
//   kode diatas menentukan nilai step adalah 3. pada panggil println() variabel wajib dengan properti step
//    -----------------------------
//val bilanganBulat = 1.rangeTo(10) step 3
//    bilanganBulat.forEach{
//        print("$it ")
//    }
//    println(bilanganBulat.step)

/* output:
1 4 7 10 3
 */
//    kode diatas operator ... digantikan dengan fungsi rangeTo() untuk membuat Range.
//------------------------------
//    menentukan nilai yang dicakup pada range dengan urutan terbalik
//    val bilanganTerbalik = 10.downTo(1)
//    if(8 in bilanganTerbalik){
//        println("nilai 8 tersedia")
//    }
    /*
    output:
    nilai 8 tersedia
     */

//    menggunakan fungsi downTo() untuk menentukan nilai dengan urutan terbalik. variabel bilanganTerbalik
//    mencakup nilai 10,9,8,7,6,5,4,3,2,1
//    kode diatas menggunakan keyword in untuk memeriksa apakah 8 berada diantara kisaran 1 sampai 10.
//    Expression yang dievaluasi pada if diatas sama seperti ketika menggunakan expression
//    if(1 <= 8 && 8 <= 10){
//        println("Nilai 8 tersedia")
//    }
//------------------------------------------
//    kita juga bisa memeriksa apakah suatu nilai tidak ada pada nilai cakupan range tersebut. kita bisa menggunakan
//    keyword !in

//val bilanganTerbalik = 10.downTo(1)
//if(11 !in bilanganTerbalik){
//    println("nilai 11 tidak ada dalam Range")
//}
    /*
    * output:
    * nilai 11 tidak ada dalam Range
    * */

//    --------------------------------------
//    Range pada kotlin mendukung tipe integral seperti IntRange, LongRange dan CharRange. sehingga selain nilai
//    numerik, bisa menentukan tipe Character sebagai nilai yg dicakup oleh Range:
    val jangkauanChar = 'A'.rangeTo('G')
    jangkauanChar.forEach{
        print("$it")
    }

    /*
    * output:
    * A B C D E F G
    * */

//    variabel jangkauanChar mencakup A B C D E F G

//    beberapa konsep kotlin:
//    https://www.youtube.com/watch?v=Ta5wBJsC39s
}