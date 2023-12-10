package com.diksgroup.kotlin

class App {

}
fun main(){
//    println("Hallo Kotlin")
val nama = "Dhiki Adriansyah"

//    print("Hai nama saya adalah ")
//    println(nama)
//    print(if(true) "Selalu Benar" else "Selalu Salah")
//   println("Hai $nama")
//    print(nama?.length)
//    ----------------

//    val nama: String = "Dhiki"
//    val umur: Int = 17
//    print("Hai $nama, berusia $umur")
//    string template

// perbedaan var dan val
//    var bisa diubah nilainya (mutable)
//    val tidak bisa diubah nilainya (immutable)
//-----------------
//    nullable types
val sesiLogin:String? = null

//    contoh salah:
    val sessiLogin:String? = null

//    ----------------------
//    safe call operator ?.
//    memanggil nullable dengan aman
    val sesiDaftar: String? = null
    val panjangText = sesiDaftar?.length
//    print(panjangText)

//    elvis operator ?:
//    nilai default jika objek bernilai null
    val bentukGambar: String? = null
    val panjangGambar = bentukGambar?.length?:0
//-----------------------
//    collection
//    kumpulan dari banyak data

//    list: untuk menyimpan nilai bebas dengan index(boleh sama)
    val bilanganList = listOf(4,2,1,5,1,2)
//    println(bilanganList) // output: [4,2,1,5,1,2] bisa bilanganList[3]

// Set: untuk menyimpan nilai yang unik
    val bilanganSet = setOf(4,2,1,5,1,2)
//    println(bilanganSet) // output: [4,2,1,5] tidak bisa bilanganSet[3]

//    Map : untuk menyimpan dengan format key to value, key unik tidak boleh sama.
    val negara = mapOf(
        "jakarta" to "indonesia",
    "london" to "england"
    )
//    println(negara) // bisa negara["jakarta"] bisa negara.getValue("jakarta")
//------------------
//    mutablelist vs list
//    mutablelist bisa diubah nilainya
//    list tidak bisa diubah nilainya(immutable)

    val semuaList = mutableListOf('a',"kotlin",3,true, App())

    semuaList.add('d') // menambah item di akhir list
    semuaList.add(1,"cinta") //menambah item pada indeks ke 1
    semuaList[3] = false // mengubah nilai item pada indeks ke 3
    semuaList.removeAt(1) // menghapus item App() berdasarkan index atau posisi nilai di dalam array
println(semuaList)
//    output:
//    [a, kotlin, false, true, com.diksgroup.kotlin.App@4e50df2e, d]
}
