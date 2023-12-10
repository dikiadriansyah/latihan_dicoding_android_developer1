package com.diksgroup.kotlin
// Slice

/*
fungsi Slice untuk menyaring item dari posisi tertentu.
fungsi slice membutuhkan sebuah argumen berupa Range yg digunakan untuk menentukan posisi pertama dan terakhir yg
akan disaring.
 */
fun main(){
// val bilanganAsli = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
// val hasil = bilanganAsli.slice(3..7)
// println(hasil)
    /*
    output:
    [4,5,6,7,8]
     */
//    ----------------------------------
// menggunakan range dikolaborasi operator step
//    val bilanganAsli = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
//    val hasil = bilanganAsli.slice(3..7 step 2)
//    print(hasil)
    /*
    output:
    [4,6,8]
     */
    //-----------------------
//    menentukan posisi yg lebih spesifik. bisa mendefinisikan di dalam sebuah collection, kemudian disematkan
//    sebagai argumen.
//    val bilanganAsli = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
//    val index = listOf(2,3,5,8,11)
//    val hasil = bilanganAsli.slice(index)
//    println(hasil)
    /*
    output:
    [3,4,6,9,12]
     */
/*
hati-hati dalam menentukan index untuk mendapatkan data. karena dapat menyebabkan terjadinya
ArrayIndexOutOfBoundsException jika posisi yg ditentukan tidak terdapat objek collection
 */
//    ------------------------
//    Distinct
//  fungsi distinct() digunakan Saat berurusan dengan item yang sama di dalam sebuah collection, untuk menyaring item yang sama tersebut kita
//    akan melakukan iterasi dan membandingkan setiap itemnya.
//    val bilangan = listOf(1,2,4,2,3,5,9,10,5,6,7,8,6)
//val hasil = bilangan.distinct()
//    println(hasil)
    /*
    output:
    [1,2,4,3,5,9,10,6,7,8]
     */

//    ----------
//    fungsi distinct() bisa langsung dipanggil dari object collection. Kita juga bisa menggunakannya pada collection
//    dengan tipe parameter seperti data class.
//data class Item(val kunci: String, val nilai: Any)
//
//    val items = listOf(
//        Item("1","Perkenalkan"),
//        Item("2","bapak/ibu"),
//        Item("3","nama saya"),
//        Item("3","Dhiki Adriansyah"),
//        Item("3","atau biasa dipanggil"),
//        Item("4","Diki"),
//    )
//
//    val hasil = items.distinctBy{
//        it.kunci
//    }
//
//    hasil.forEach{
//        println("${it.kunci} dengan nilai: ${it.nilai}")
//    }
    /*
    output:
    1 dengan nilai: Perkenalkan
2 dengan nilai: bapak/ibu
3 dengan nilai: nama saya
4 dengan nilai: Diki

     */

//    -------------
    /*
    menentukan proses penyaringan item yang sama seperti apa yang akan dijalankan dengan menggunakan fungsi
    distinctBy(). Misal kita ingin menyaring item yang memiliki panjang sama
     */
//    val kalimat = listOf("selamat","pagi","perkenalkan","nama","saya","Dhiki")
//val hasil2 = kalimat.distinctBy{
//    it.length
//}
//    println(hasil2)
/*
output:
[selamat, pagi, perkenalkan, Dhiki]

Catatan: fungsi distinct() tidak dapat digunakan object Map collection.
 */
//    -------------------------------------
//    Chunked
// untuk memecah nilai String menjadi beberapa bagian kecil dalam bentuk array.

//   perbedaan Chuncked() dan split()
    /*
    split() membutuhkan argumen berupa RegEx sebagai parameter.
    chunked() membutuhkan nilai yang akan digunakan sebagai jumlah indeks untuk pemisah.
     */

//    val perkenalan = "namadiki"
//val hasil = perkenalan.chunked(4)
//    println(hasil)
/*
output:
[nama, diki]
 */
    //---------------
    /*
    Contoh hasil dari nilai yg sudah dipecah ingin kita buat menjadi huruf kecil

     */
    val perkenalan = "NamaDiki"
val hasil = perkenalan.chunked(4){
    it.toString().toLowerCase()
}
    println(hasil)
    /*
   [nama, diki]
     */

//    Argumen yg berada lambda expression diatas merepresentasikan setiap nilai yg sudah dipecah
}