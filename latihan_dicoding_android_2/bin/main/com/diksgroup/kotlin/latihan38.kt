package com.diksgroup.kotlin

//Member References

//contoh mendeklarasi lambda dengan function type
//val penjumlahan: (Int, Int)->Int={
//    nilaiA,nilaiB->
//    nilaiA+nilaiB
//}
/*
output:
7
 */

// dengan kotlin, bisa memisahkan lambda expression menjadi fungsi tersendiri dan mereferensikan langsung sebagai
// instance dari function type.

//val penjumlahan: (Int, Int) -> Int = ::count
//        fun count(nilaiA: Int, nilaiB: Int): Int{
//return nilaiA + nilaiB
//        }
/*
output:
7
 */
/*
kode diatas dengan mekanisme Reflection yg berarti seperangkat fitur bahasa dan library yg memungkinkan untuk mengamati
struktur kode dari proyek yg sedang kita kerjakan

 */

/*
Function References
mereferensikan sebuah fungsi
 */
//fun apakahAngkaGenap(angka: Int) = angka % 2 == 0
// fungsi diatas untuk memeriksa apakah suatu angka merupakan sebuah bilangan genap.

// menggunakan operator :: bisa menggunakan sebagai instances dari function type.
// contoh penggunaan fungsi filter() yg menjadi bagian dari kelas List

//fun main(){
//var hasil= penjumlahan(2,5)
//    print(hasil)
//-----------------------------------
//    val angka = 1.rangeTo(12)
//    val angkaGenap=angka.filter(::apakahAngkaGenap)
//    print(angkaGenap)
    /*
    output:
    [2,4,6,8,10,12]
     */

    //------------------------
    // mereferensikan sebuah extensions function. caranya menyertakan objek yg menjadi receiver sebelum operator ::
//val angka = 1.rangeTo(18)
//    val angkaGenap = angka.filter(Int::apakahAngkaGenap)
//    print(angkaGenap)
    /*
    output:
    [2,4,6,8,10,12, 14, 16,18]
    */
//}

//fun Int.apakahAngkaGenap() = this % 2 == 0

//------------------------
// Property References
//operator :: selain digunakan untuk mereferensikan sebuah fungsi. Operator :: digunakan untuk mereferensikan sebuah
// properti. Dengan Operator, kita bisa mengakses apa yang menjadi bagian dari properti tersebut seperti nama, fungsi
// setter getter, dll.

//var pesan = "Apakabar"

//fun main(){
//    println(::pesan.name)
//    println(::pesan.get())
//
//    ::pesan.set("teman semua")
//
//    println(::pesan.get())
/*
output:
pesan
apakabar
teman semua

 */


//    expresion ::pesan dievaluasi ke dalam objek dengan KMutableProperty yg memungkinkan kita untuk membaca nilainya
//    dengan menggunakan get(), menetapkan nilai menggunakan set() dan mendapatkan nama dari properti tersebut
//    menggunakan properti name.
//    sedangkan untuk properti yg bersifat immutable seperti val pesan="Apakabar", ::pesan akan mengembalikan nilai
//    dengan tipe KProperty, yg mana hanya terdapat fungsi get() didalam
//}

// --------------------------
val pesan = "Apakabar"
fun main(){
    println(::pesan.name)
    println(::pesan.get())
    /*
    output:
    pesan
    Apakabar
     */

//::pesan.set("kawan Semua") <- Error: Unresolved reference.
//    println(::pesan.get())
}
