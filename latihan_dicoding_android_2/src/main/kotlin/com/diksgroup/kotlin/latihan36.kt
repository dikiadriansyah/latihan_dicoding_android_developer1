package com.diksgroup.kotlin

// Scope Function with Lambda Receiver run

// fungsi run akan mengembalikan nilai berdasarkan expression yg berada blok lambda. gunakan receiver (this) untuk
// mengakses dari objek. run akan berguna jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk
// nilai kembalian.


fun main(){
//val salam = "Assalamualaikum"
//    val hasil = salam.run{
//        val dari = this
//        val ke = this.replace("Assalamualaikum","Hai")
//        "menimpa teks dari $dari ke $ke"
//    }
//    println("Hasil: $hasil")
// output:
//    Hasil: menimpa teks dari Assalamualaikum ke Hai
//    ----------------------
//    with
//    fungsi with bukan sebuah extension melainkan hanya fungsi biasa.  Konteks objeknya disematkan sebagai argumen dan
//    dari blok lambda diakses sebagai receiver
//val pesan = "Hai Dhiki"
//    val hasil = with(pesan){
//        println("nilai adalah $this")
//        println("panjang with ${this.length}")
//    }

    /*
    output:
    nilai adalah Hai Dhiki
    panjang with 9
     */

//     nilai yg akan dikembalikan adalah berdasarkan expression yg berada dalam blok lambda
//--------------
//    val pesan = "Perkenalkan Bapak/Ibu Semua"
//    val hasil = with(pesan){
//        "Karakter Pertama adalah ${this[0]}" +
//                " dan karakter terakhir adalah ${this[this.length - 1]}"
//    }
//    println(hasil)
/*
output:
Karakter Pertama adalah P dan karakter terakhir adalah a
 */
//    fungsi with disarankan untuk mengakses apa yg menjadi anggota tanpa harus menyediakan nilai kembalian

//-------------------------------------
//    apply
//    nilai yg dikembalikan fungsi apply adalah nilai dari konteks objeknya dan objek konteksnya tersedia sebagai
//    receiver (this).
//    fungsi apply dapat melakukan inisialisasi atau konfigurasi dari receiver-nya.
// contoh tanpa fungsi apply
val box = StringBuilder()
    box.append("Hai ")
    box.append("Kawan")
    println(box.toString())
    /*
    output:
    Hai Kawan
     */

//    contoh fungsi apply
val pesan = StringBuilder().apply{
    append("Hai ")
    append("Apakabar")

}
println(pesan.toString())
/*
output:
Hai Apakabar
 */
}

