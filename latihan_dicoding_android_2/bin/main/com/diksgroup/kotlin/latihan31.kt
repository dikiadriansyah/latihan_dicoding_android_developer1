package com.diksgroup.kotlin

// function type
// function type untuk deklarasi yang berhubungan dengan sebuah fungsi. dalam penggunaan terdapat beberapa tanda yang
// berhubungan dengan sebuah fungsi seperti jumlah dan tipe parameter serta tipe kembalian.

// setiap function type memiliki tanda kurung. di dalamnya terdapat sebuah parameter dan jumlah tipe yang menandakan
// jumlah parameter dari fungsi tersebut. Pada contoh di atas, fungsi tersebut memiliki 2 (dua) parameter dengan
// tipe Int dan memiliki tipe kembalian String. Ketika kita tidak ingin fungsi tersebut mengembalikan nilai, kita bisa
// menggunakan Unit. Berbeda dengan fungsi pada umumnya, jika menggunakan tipe kembalian Unit, kita
// tidak wajib menuliskannya.


//Ketika kita mempunyai beberapa fungsi yang memiliki function type yang sama, kita bisa menyederhanakannya. Bagaimana
// caranya? Manfaatkan kata kunci typealias untuk memberikan nama alternatif dari sebuah function type seperti berikut:
//typealias Arithmetic = (Int, Int)->Int
//fun main(){
//val penjumlahan : Arithmetic = { valueA, valueB -> valueA + valueB}
//    val perkalian : Arithmetic = { valueA, valueB -> valueA * valueB}


    //typealias digunakan ketika kita mempunyai function type yg panjang.
//Dengannya, kita bisa memberikan nama untuk sebuah function type dan menggunakannya sebagai tipe untuk fungsi lainnya.
//Nah, sekarang kalau dilihat sudah benar-benar mirip seperti tipe data

// untuk membuat instance dari function type terdapat beberapa cara, salah satunya dengan lambda expression. sedangkan
// untuk menggunakan instance-nya bisa memanfaatkan operator invoke()

//    val hasilPenjumlahan = penjumlahan.invoke(3,5)
//    val hasilPerkalian = perkalian.invoke(8,3)
//    println(hasilPenjumlahan)
//    println(hasilPerkalian)
    /*
    output:
    8
    24
     */
//------------
//    atau bisa menuliskan dengan menghilangkan operator invoke()
//    val hasilPenjumlahan = penjumlahan(9,3)
//val hasilPerkalian = perkalian(9,8)
//    println(hasilPenjumlahan)
//    println(hasilPerkalian)
/*
output:
12
72
 */


//}
//    -----------------
// bisa menandai function type sebagai nullable dengan menempatkan di dalam tanda kurung dan diakhiri dengan safe call
typealias Arithmetic = ((Int, Int)->Int)?
fun main(){
val penjumlahan : Arithmetic = { valueA, valueB -> valueA + valueB}
    println(penjumlahan?.invoke(33,20))
    /*
    output:
    53
     */
}