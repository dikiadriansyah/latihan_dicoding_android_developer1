package com.diksgroup.kotlin
// Recursion
// teknik untuk menyederhanakan pemecahan masalah yang umumnya diselesaikan dengan cara yang kompleks.
// di kotlin disebut recursive function

// Recursive function adalah sebuah mekanisme di mana sebuah fungsi digunakan dari dalam fungsi itu sendiri.
/*
Ini memungkinkan sebuah fungsi dapat berjalan beberapa kali. Setiap pemanggilannya bisa kita atur agar dapat
mengembalikan nilai dan digunakan sebagai argumen untuk pemanggilan fungsi berikutnya serta mengembalikan nilai akhir berupa perhitungan nilai kembalian dari setiap pemanggilan fungsi tersebut.
 */

//fun factorial(n: Int): Int{
//    return if(n == 1){
//        n
//    } else{
//        var hasil = 1
//
//        for(i in 1..n){
//            hasil *= i
//        }
//
//        hasil
//    }
//}

/*
fungsi diatas contoh bagaimana menghitung faktorial dari nilai yg kita tentukan.
Nah, tidak ada yang salah dengan kode tersebut dan dapat dijalankan serta mengembalikan nilai sesuai dengan yang kita
inginkan. Namun jika kita perhatikan, untuk menghitung nilai akhir, kode di atas menggunakan for loop yang di setiap
iterasinya terdapat proses perhitungan nilai yang akan dikembalikan sebagai nilai akhir. Dengan recursive kita bisa menentukan nilai akhir tersebut dengan cara yang lebih sederhana.
 */

// contoh kode singkat menggukan recursive:
//fun faktorial(n: Int): Int{
//    return if(n == 1){
//        n
//    }else{
//        n * faktorial(n - 1)
//    }
//}
/*
Ketika kita menjalankan fungsi di atas, program akan menciptakan tumpukan frame dengan jumlah berdasarkan nilai n
di mana setiap frame akan mengkonsumsi memori. Ini bisa jadi masalah dalam penerapannya.
 */
// contoh memasukkan argumen dengan nilai besar ketika ingin menggunakan

//fun faktorial(n: Int): Int{
//    return if(n == 1){
//        n
//    }else{
//        n * faktorial(n - 1)
//    }
//}
//--------------------------------
// Tail Call Recursion
/*
Kotlin mendukung gaya pemrograman fungsional yang bernama tail recursion yakni sekumpulan urutan instruksi untuk
menjalankan tugas tertentu (subroutine) yang dijalankan terakhir pada sebuah prosedur.
Dengannya, kita bisa meminimalisir penumpukan frame ketika kita menerapkan recursive. Tail recursion akan memastikan
proses sebelumnya telah selesai sebelum pemanggilan fungsi berikutnya dijalankan
 */
//fun faktorial(n: Int, hasil: Int = 1): Int{
//    val hasilBaru = n * hasil
//    return if(n == 1){
//        hasilBaru
//    }else{
//        faktorial(n - 1, hasilBaru)
//    }
//}
/*
Namun dengan kode di atas kita tidak bisa langsung menghindari penumpukan frame. Ini karena secara default JVM
tidak mendukung optimasi tail recursion.
 */
// ---------
/*
Kotlin menyediakan modifier agar kita bisa tetap menerapkannya, yaitu modifier tailrec.
 */
fun faktorial(n: Int, hasil: Int = 1): Int{
    val hasilBaru =  n * hasil
    return if(n == 1){
        hasilBaru
    }else{
        faktorial(n - 1, hasilBaru)
    }
}
/*
Pada kode di atas, modifier tailrec ditempatkan sebelum kata kunci fun. Ketika sebuah fungsi ditandai dengan
modifier tailrec, maka fungsi tersebut hanya boleh dipanggil untuk dijalankan terakhir dan tidak boleh digunakan dari
 dalam blok try-catch-finally.
 */

fun main(){
//val result = faktorial(3)
//    println(result)
    /*
    output:
    6
     */
//---------------------
//    println("Faktorial 9999 adalah: ${faktorial(9999)}")
    /*
    output:
    Exception in thread "main" java.lang.StackOverflowError
     */
//    -----------------------------------------
  val result=  faktorial(4)
print(result)
    // output: 24
// 4 = 1*2*3*4 hasilnya 24
}
