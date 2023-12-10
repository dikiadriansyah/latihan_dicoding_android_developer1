package com.diksgroup.kotlin
// Kotlin Standard Library (KSL)

// Standar Function Library(SFL) adalah sebuah extension functions dari sebuah objek yg menggunakan lambda sebagai argumen atau higher-order function

//Scope Function (SF)
// KSL memiliki tujuan adalah bagaimana menuliskan logika kode didalam objek.
// memanfaatkan lambda expression yg memiliki ruang lingkup, dimana dalam ruang lingkup tersebut kita dapat mengakses objek.

// fungsi ini dinamakan Scope Function.
// Scope Function didalamnya antara lain: let, run, with, apply dan also.
// persamaan fungsi tersebut melakukan tugas yaitu mengeksekusi blok kode dari dalam objek.
// perbedaan fungsi adalah bagaimana objek tersebut tersedia dan seperti apa hasil yg didapat dari seluruh expression
// yg berada dalam blok.

// Context Object (CO)
// sebelum mengulas Scope Function, kita perlu mengetahui bagaimana cara mengakses konteks sebuah objek dari dalam lambda yg menjadi bagian dari SF

// terdapat 2 cara:
//1.  diakses sebagai lambda receiver(this)
//2. lambda argumen (it)

// Lambda Receiver (this)
// fungsi menggunakan lambda receiver adalah run, with, dan apply.
// Ketika ingin mengakses konteks dari sebuah objek, kita bisa saja tidak menuliskan atau menghilangkan keyword this.
// contoh penggunaan fungsi apply

//val bangunString = StringBuilder().apply{
//    append("Selamat Pagi")
//    append("Dunia")
//}
fun main(){
//println(bangunString)
/*
output:
selamat pagidunia

 */

// kekurangan cara ini yaitu tidak dapat membedakan objek receiver dengan objek yg berada dari luar lingkup fungsi.
//cara ini lebih ditujukan untuk operasi objek itu sendiri, seperti memanggil fungsi dan inisialisasi nilai dari anggota
// yang menjadi bagian dari objek tersebut.
//    -----------------------------------
//Lambda argument(it)
//    fungsi menggunakan lambda argument untuk mengakses konteks dari sebuah objek adalah fungsi let dan also.
//    nilai dari argumen dapat digunakan untuk diproduksi atau di inisialisasikan untuk variabel lain

//    val kalimat = "Selamat Tinggal"
//    kalimat.let{
//        val pesan = "$it Teman"
//        println(pesan)
//    }

    /*
    output:
    Selamat Tinggal teman
     */

//    secara default nama dari argumen adalah it, namun dapat mengubahnya
    val kata = "Dhiki"
    kata.let{
        nilai ->
        val pesan = "$nilai adriansyah"
        println(pesan)
    }
    /*
    output:
    Dhiki adriansyah
     */

}


