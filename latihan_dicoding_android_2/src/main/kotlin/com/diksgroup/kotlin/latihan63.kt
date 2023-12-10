package com.diksgroup.kotlin
// Variance

/*
Variance adalah konsep yang menggambarkan bagaimana sebuah tipe yang memiliki subtipe yang sama dan tipe argumen yang
 berbeda saling berkaitan satu sama lain. Variance dibutuhkan ketika kita ingin membuat kelas atau fungsi generic dengan batasan yang tidak akan mengganggu dalam penggunaannya.
 */
abstract class Kendaraan(roda: Int)
class Mobil(speed: Int): Kendaraan(4)
class MotorListrik(speed: Int): Kendaraan(2)
fun main(){
val mobil = Mobil(120)
    val motorlistrik = MotorListrik(80)
    var kendaraan: Kendaraan = mobil
    kendaraan = motorlistrik

    /*
    kode diatas variabel mobil dan motorlistrik merupakan subtipe dari Kendaraan sehingga kita bisa melakukan assignment
     antar dua variabel tersebut. Maka seharusnya kode tersebut akan berhasil dikompilasi.
     */
    /*
    masukkan salah satu kelas yg merupakan subtipe dari kelas Kendaraan diatas dalam generic list:
     */
    val daftarMobil = listOf(Mobil(100), Mobil(120))
    val daftarKendaraan = daftarMobil
    /*
    contoh diatas variance menggambarkan keterkaitan antara daftarMobil dan daftarKendaraan dimana Mobil merupakan
    subtipe dari Kendaraan.

Lalu bagaimana cara membuat kelas generic yang memiliki variance? Caranya sama seperti ketika kita membuat generic
kelas pada umumnya. Namun untuk tipe parameternya kita membutuhkan kata kunci out untuk covariant atau kunci in
untuk contravariant.
     */
}

// -------------
// Covariant
/*
contoh deklarasi generic dengan covariant saat kelas List pada kotlin dideklarasikan

 */
interface List2<out E> : Collection<E> {
    operator fun get(index: Int): E
}
/*
Ketika kita menandai sebuah tipe parameter dengan kata kunci out maka nilai dari tipe parameter tersebut hanya bisa
diproduksi seperti menjadikanya sebagai return type. Serta tidak dapat dikonsumsi seperti menjadikannya sebagai
tipe argumen untuk setiap fungsi di dalam kelas
 */

//------------
// Contravariant
/*
 bagaimana saat kita menandainya dengan dengan kata kunci in ?  Nilai dari tipe parameter tersebut bisa dikonsumsi
 dengan menjadikannya sebagai tipe argumen untuk setiap fungsi yang ada di dalam kelas tersebut dan tidak untuk
 diproduksi. Contoh dari deklarasinya bisa kita lihat pada kelas Comparable pada Kotlin
 */
interface Comparable<in T>{
    operator fun compareTo(other: T) : Int
}