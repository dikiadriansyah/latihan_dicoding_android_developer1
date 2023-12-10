package com.diksgroup.kotlin
// Visibility Modifiers (hak akses)
/*
tidak semua properti dan fungsi pada sebuah kelas memiliki hak akses publik.
Ada beberapa yang hanya dapat diakses dari dalam dan ada yang dapat diakses dari luar kelasnya. Dengan menentukan
hak akses, kita dapat membatasi akses data pada sebuah kelas.

macam-macam hak akses
1. public
2. private
3. protected
4. internal
 */

// Public
// default modifier pada Kotlin adalah public.
//Ketika sebuah anggota memiliki hak akses public maka anggota tersebut dapat diakses dari luar kelasnya melalui
// sebuah objek kelas

//class Animal(var nama: String, val berat: Double, val usia: Int, val cekMamalia: Boolean = true)

//---------------------------------------
// Private
// Ketika suatu anggota memiliki hak akses private, maka anggota tersebut tidak dapat diakses dari luar scope-nya.
// untuk menggunakan modifier private perlu menambahkan keyword private.

//class Animal(private var nama: String, val berat: Double, val usia: Int, val cekMamalia: Boolean)
// properti nama diubah menjadi private maka output error Cannot access '[PROPERTY]': it is private in 'Animal'

//cara untuk mengakses properti private dari sebuah class adalah dengan fungsi getter dan setter secara manual.
// fungsi getter dan setter sebenarnya dihasilkan secara otomatis oleh kotlin ketika properti tersebut memiliki
// hak akses public tapi tidak untuk private.

// membuat fungsi getName() dan setName()
/*
Fungsi getName() bertujuan untuk mengembalikan nilai name yang memiliki tipe data String. Kemudian fungsi setName()
bertujuan untuk mengubah nilai properti name dengan nilai baru. Fungsi setName() membutuhkan satu parameter bertipe String yang nantinya akan dimasukkan nilainya ke dalam properti name.
 */

//class Animal(private var nama: String, val berat: Double, val usia: Int, val cekMamalia: Boolean = true){
//    fun getName(): String{
//        return nama
//    }
//
//    fun setName(namaBaru: String){
//        nama = namaBaru
//    }
//}


//fun main(){
//val result = Animal("mooMonn", 24.2,2)
//    result.nama = "labi-labi"
//
//    print("Nama Hewan: ${result.nama}")
//     output: Nama Hewan: labi-labi
//---------------------------------------------
    // cara modifier private
//val result = Animal("mooMonn", 24.2,2)
//println(result.getName())
    // output: mooMonn

//    result.setName("miawwAug")
//    println(result.getName())
    // output: miawwAug

// kode diatas mengubah nilai properti nama dari nilai awal yg inisialisasikan pada konstruktor menjadi nilai baru
// yg kita tentukan dengan menggunakan fungsi setName()
//}

//-----------------------------------
// Protected
// Hak akses protected mirip seperti private, namun pembatasannya lebih luas dalam sebuah hirarki kelas.
//Hak akses protected digunakan ketika kita menginginkan sebuah anggota dari induk kelas dapat diakses hanya oleh
// kelas yang merupakan turunannya.

//open class HewanTiga(val nama: String, protected val berat: Double)
//class Sapi(jNama: String,jBerat:Double): HewanTiga(jNama, jBerat)

//fun main(){
//    val sapi = Sapi("mooMoon", 50.3)
//    println("Nama sapi: ${sapi.nama}")
    // output:
    // Nama sapi: mooMoon

//    println("Berat sapi: ${sapi.berat}")
    // output:
//Berat sapi: Cannot access 'berat': it is protected in 'Sapi'
//}
//}

//-------------------------
// Internal
// Hak akses ini membatasi suatu anggota untuk dapat diakses hanya pada satu modul
internal class Animal(val nama: String)
fun main(){
val result= Animal("Labi-labi")
    println("nama hewan: ${result.nama}")
    /*
    output:
    nama hewan: Labi-labi

kode diatas kelas Animal ditetapkan sebagai class internal, maka class hanya dapat diakses dari modul yg sama.
hak akses ini sangat berguna ketika mengembangkan sebuah aplikasi yg memiliki beberapa modul didalamnya

     */
}