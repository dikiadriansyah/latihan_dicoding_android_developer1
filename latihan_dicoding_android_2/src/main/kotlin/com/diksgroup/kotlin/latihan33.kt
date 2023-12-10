package com.diksgroup.kotlin
// high-order function (HOF)

// tipe deklarasi yg dapat kita gunakan untuk mendeklari lamda
//var sum: (Int)->Int={bilangan->bilangan+bilangan}
//kode diatas adalah contoh ketika ingin membuat lambda yg memiliki 1 parameter dengan tipe kembalian Int.

//dengan ditetapkan tipe deklarasi pada fungsi tersebut, memungkinkan kita untuk bisa menggunakan sebagai argumen untuk
// fungsi lain
//fun main(){
//cetakHasil(14, penjumlahan)
//}

//fun cetakHasil(bilangan: Int, penjumlahan: (Int)->Int){
//    val hasil = penjumlahan(bilangan)
//    print(hasil)
//}

//var penjumlahan: (Int)->Int ={ bilangan-> bilangan+bilangan}
/*
output:
28
 */

// penulisan singkat secara langsung ketika fungsi cetakHasil(
//fun main(){
//    cetakHasil(15){ bilangan->
//        bilangan+bilangan
//    }
//}
//fun cetakHasil(bilangan: Int, penjumlahan: (Int)->Int){
//    val hasil = penjumlahan(bilangan)
//    print(hasil)
//}

/*
output:
30
 */
//kode diatas dinamakan Higher-Order Function adalah sebuah  fungsi yang menggunakan fungsi lainnya sebagai parameter,
// menjadikan tipe kembalian, ataupun keduanya. jika argumen terakhir dari fungsi merupakan sebuah lambda expression,
// maka lambda expression tersebut ditempatkan di luar parenthesis seperti kode diatas
//-----------
//Inline Function
// contoh Higher-Order Function dalam pembuatan instance yg banyak jika dipanggil berulang-ulang .


fun main(){
    cetakHasil(14){ value ->
        value+value

    }

cetakHasil(28){
    value->
    value+value
}
}

//fun cetakHasil(value: Int, penjumlahan:(Int)->Int){
//    val hasil = penjumlahan(value)
//    println(hasil)
//}
/*
output
28
56
 */
// cetakHasil mengandung Higher-Order Function dipanggil 2 kali.


inline fun cetakHasil(value: Int, penjumlahan: (Int)->Int){
    val hasil=penjumlahan(value)
    println(hasil)
}
//Inline adalah fitur dalam bahasa Kotlin yang memungkinkan Anda untuk menyertakan seluruh kode dari suatu fungsi atau
// lambda (expression function) pada saat kompilasi, sehingga mempercepat waktu eksekusi program.
//----------------------------------
