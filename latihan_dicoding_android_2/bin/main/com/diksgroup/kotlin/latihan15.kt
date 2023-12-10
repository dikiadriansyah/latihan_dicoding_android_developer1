package com.diksgroup.kotlin

fun main(){
//    While dan Do While

//    contoh perulangan jadul:
//    println("ini contoh perulangan jadul ke - 1")
//    println("ini contoh perulangan jadul ke - 2")
//    println("ini contoh perulangan jadul ke - 3")
//    println("ini contoh perulangan jadul ke - 4")
//    println("ini contoh perulangan jadul ke - 5")
//    output:
//    ini contoh perulangan jadul ke - 1
//    ini contoh perulangan jadul ke - 2
//    ini contoh perulangan jadul ke - 3
//    ini contoh perulangan jadul ke - 4
//    ini contoh perulangan jadul ke - 5

//    mengapa harus while?
//    karena untuk memudahkan kita saat perulangan sebanyak 100 kali atau tak terhingga.

//    ------------------------
// Perulangan terdiri dari While, Do While dan For Loop.

//    While
//    menggunakan keyword while, lanjut ke kondisi di dalam tanda kurung, dan diakhiri oleh blok body dari while
//    var hitung = 1
//while(hitung <= 8){
//    println("Hai Dunia")
//
//    hitung++
//}
//    output:
//    Hai Dunia
//    Hai Dunia
//    Hai Dunia
//    Hai Dunia
//    Hai Dunia
//    Hai Dunia
//    Hai Dunia
//    Hai Dunia

//    selama nilai dari variabel hitung kurang dari sama dengan 8 maka kode yg didalamnya akan terus dilakukan.
//Lalu ketika kondisi tersebut sudah tak terpenuhi maka proses perulangan akan dihentikan.

//    ------------------------
//While bersifat Entry Controlled Loop. berarti kondisi yang diberikan akan dievaluasi terlebih dahulu. jika kondisi
//    tersebut terpenuhi maka proses perulangan akan di jalankan.
//    Jika kondisi yang diberikan tidak terpenuhi sejak awal maka proses perulangan tidak akan dijalankan.
//    Untuk mengujinya Anda bisa menulis dan menjalankan kode berikut:
//    var hitung = 9
//while(hitung <= 8){
//    println("Hai, Kawan")
//    hitung
//}

//    ---------------------------
// Do While

//    var qty = 1
//    do{
//        println("Semangat Belajar Coding")
//        qty++
//    }while(qty <= 9)
//    output:
// Semangat Belajar Coding
// Semangat Belajar Coding
// Semangat Belajar Coding
// Semangat Belajar Coding
// Semangat Belajar Coding
// Semangat Belajar Coding
// Semangat Belajar Coding
// Semangat Belajar Coding
// Semangat Belajar Coding

//Do While bersifat  Exit Controlled Loop yaitu proses perulangan akan langsung dijalankan di awal. jika telah selesai
// barulah kondisi yg diberikan akan dievaluasi.

//----------------------------
//  saat menggunakan WHile dan Do While perhatikan infinite loop, yaitu kondisi dimana proses perulangan berlangsung
//  terus-menerus sampai aplikasi menjadi crash.
var abjad = 'A'
    do{
        println(abjad)

    }while(abjad <= 'Z')

//    output:
// console akan crash sampai perulangan bernilai true atau terpenuhi


//    Infinite loop terjadi jika kondisi yang diberikan selamanya terpenuhi atau bernilai true.
//    While dan Do While sendiri tidak dapat digunakan untuk melakukan perulangan pada rentan angka.
//    Untuk melakukannya kita bisa menggunakan For Loop
}