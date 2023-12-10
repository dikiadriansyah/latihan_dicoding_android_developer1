package com.diksgroup.kotlin
// Lambda with receiver

//lambda dideklarasikan dengan receiver. konsep ini digunakan sebagai dasar kotlin untuk digunakan sebagai
// Domain Specific Languages(DSL).

//DSL adalah sebuah bahasa komputer yang dikhususkan untuk domain aplikasi tertentu. berbeda dengan
// general-purpose language yg bisa diterapkan disemua domain aplikasi. Dengan DSL bisa menuliskan kode lebih ringkas
// dan ekspresif. contoh sistem yg menerapkan DSL adalah Gradle dan sistem database yg berbasis SQL

// dasarnya sebuah lambda yang mempunyai receiver mirip seperti extension functions, yang memungkinkan kita untuk
// mengakses anggota objek receiver dari dalam extension. Pada lambda, receiver ditentukan pada saat menentukan
// tipe deklarasi.

//contoh kode tidak menggunakan DSL
//fun bangunString(): String{
//    val bangunString = StringBuilder()
//    bangunString.append("Hai")
//    bangunString.append("Apa Kabar")
//    bangunString.append("Teman Semua")
//    return bangunString.toString()
//}

// diatas merupakan contoh kode StringBuilder yg digunakan untuk menambahkan kata satu persatu. jika dilihat cukup
// panjang tidak fleksibel. jika ingin membuat menambahkan kata baru harus didalam kode dan mengulang-ulang kata stringBuilder.
// menggunakan DSL dapat menyingkat kode dan cukup fokus pada fungsi append

// contoh membuat Lambda with Receiver
fun bangunString(action: StringBuilder. ()-> Unit): String{
    val bangunString = StringBuilder()
    bangunString.action()
    return bangunString.toString()
}

// kode diatas StringBuilder dijadikan sebagai receiver untuk tipe deklarasi parameter action. dengan begitu dapat
// memanggil parameter action tersebut dari variabel yg bertipe StringBuilder

fun main(){
val pesan = bangunString {
    append("Assalamualaikum Bapak/Ibu")
    append("Perkenalkan saya: ")
    append("Dhiki Adriansyah")
}
    println(pesan)
//    output
//    Assalamualaikum Bapak/IbuPerkenalkan saya: Dhiki Adriansyah
}

// kode diatas bisa menggunakan suatu fungsi yang kompleks dengan menggunakan fungsi append yang dipanggil
// di dalam block buildString. Anda tidak perlu tahu bagaimana proses buildString di baliknya, yang terpenting adalah hasilnya sesuai dengan yang diharapkan

