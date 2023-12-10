package com.diksgroup.kotlin
//    Extensions

//    menambahkan fungsi baru untuk kelas Int
//class intBaru: Int(){
//    fun cetakInt(){
//        println("Nilai $this")
//    }
//}
//    kode diatas akan gagal dikompilasi, kenapa?
//    Karena kelas Int bersifat final, sehingga tidak memungkinkan untuk mewarisi kelas tersebut. Untuk itu, kita bisa
//    melakukannya dengan deklarasi khusus yang disebut dengan Extensions.

//    Kotlin mendukung 2 extension yaitu:
//    1. Extension Functions
//    untuk menambahkan fungsi baru

//    2. Extension Properties
//    untuk menambahkan sebuah properti baru.

//-------------------
//    Extension Functions
//    Untuk mendeklarasikan sebuah extension functions, kita perlu menentukan terlebih dahulu receiver type, kemudian
//    nama dari fungsi tersebut yang mana keduanya dipisahkan oleh titik (.).
//fun Int.cetakInt(){
//    print("Nilai $this")
//}

//    kelas Int digunakan sebagai receiver type, sedangkan keyword this adalah receiver type yg bertindak sebagai objek.
//    nilai dari objek bisa digunakan dalam extension yg sudah dibuat

// Untuk memanggil extension functions di atas, lakukan dengan cara seperti:
//fun main(){
//14.cetakInt()
//}
//output:
// Nilai 14

//------------------------
// menetapkan extension functions dapat mengembalikan nilai
//fun main(){
//    println(20.tambahLima())
//}

//fun Int.tambahLima(): Int{
//    return this + 5
//}
// output:
//25


//-----------------------------------------
//Extension Properties
// kotlin mendukung extension untuk menambah sebuah properti baru pada sebuah kelas tanpa harus menyentuh kode di dalam kelas
// deklarasi seperti menentukan receiver type kemudian nama dari properti.

val Int.bagi: Int
get() = this / 2

// untuk memanggil extension diatas
fun main(){
    print(14.bagi)
}
//  output:
// 7

// extension tidak benar-benar mengubah sebuah kelas dengan menambahkan sebuah fungsi atau properti baru. Ini karena
// extension memiliki hubungan langsung dengan kelas yang ingin diperluas fungsionalitasnya. Sehingga extension properties hanya bisa dideklarasikan dengan cara menyediakan getter atau setter secara eksplisit.
