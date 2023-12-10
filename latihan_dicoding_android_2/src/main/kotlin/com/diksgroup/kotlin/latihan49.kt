package com.diksgroup.kotlin
// Secondary Constructor(SC)

//digunakan ketika ingin menginisialisasi sebuah class dengan cara yg lain. Anda dapat membuat lebih dari
// satu secondary constructor.

//class HewanDua(nama: String, berat: Double, usia: Int){
//    val nama: String
//    val berat: Double
//    val usia: Int
//    var cekMamalia: Boolean
//
//    init {
//        this.nama=nama
//        this.berat=if(berat<0)0.1 else berat
//        this.usia = if(usia<0)0 else usia
//        this.cekMamalia = false
//    }
//
//    constructor(nama: String, berat: Double, usia: Int, cekMamalia: Boolean) : this(nama,berat,usia){
//        this.cekMamalia = cekMamalia
//    }
//
//
//
//}
//fun main(){
//val diKucing = HewanDua("miauuMpus",4.20,5,true)
//println("Nama Hewan: ${diKucing.nama}, Usia: ${diKucing.usia}, berat: ${diKucing.berat}, dan apakah mamalia? ${diKucing.cekMamalia}")
/*
output:
Nama Hewan: miauuMpus, Usia: 5, berat: 4.2, dan apakah mamalia? true
 */

//    val diIkan = HewanDua("pausLu",70.4,40)
//    println("nama hewan: ${diIkan.nama}, usia: ${diIkan.usia}, berat: ${diIkan.berat} dan apakah mamalia? ${diIkan.cekMamalia}")
/*
output:
nama hewan: pausLu, usia: 40, berat: 70.4 dan apakah mamalia? false
 */

    /*
objek animal dapat diinisialisasi dengan secondary constuctor ketika nilai nama, berat, usia, dan cekMamalia tersedia.
tapi jika tidak tersedia, primary constructor yg akan digunakan dan nilai cekMamalia dapat diinisialisasi pada blok init
dengan nilai default
     */
//}
//--------------------------
// Default Constructor
/*
Kotlin secara otomatis membuat sebuah default constructor pada kelas jika kita tidak membuat sebuah konstruktor
secara manual.
 */
class HewanDua{
    val nama: String = "mpussMiaw"
        val berat: Double = 24.2
        val usia: Int = 9
        val cekMamalia: Boolean = true
}
fun main(){
val hasil=HewanDua()
println("Nama Hewan: ${hasil.nama}, berat: ${hasil.berat}, usia: ${hasil.usia} dan apakah mamalia? ${hasil.cekMamalia}")
/*
output:
Nama Hewan: mpussMiaw, berat: 24.2, usia: 9 dan apakah mamalia? true


ketika membuat sebuah object, default constructor akan dipanggil. constructor akan menginisialisasi properti yg terdapat
 pada class dengan nilai default
 */

}
