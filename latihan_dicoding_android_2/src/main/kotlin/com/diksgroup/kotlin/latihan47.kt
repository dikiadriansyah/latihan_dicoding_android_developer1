package com.diksgroup.kotlin
// Extension Properties

/*
materi kotlin Function Programming(FP) sudah mengenal bahwa  Kotlin dapat meng-extends sebuah fungsi pada kelas tanpa
harus mewarisi kelasnya. Hal ini dilakukan dengan deklarasi khusus yang disebut dengan Extension.

Extension properties pada Kotlin sama halnya seperti melakukannya pada Extension function.
Kita dapat menambahkan sebuah properti tanpa harus membuat sebuah kelas yang mewarisi kelas tersebut. Tetapi perlu
diingat bahwa properti yang kita buat bukan benar - benar berada pada kelas. Sebabnya, Extension properties dilakukan
 di luar kelas. Dengan demikian, Extension properties hanya bisa didefinisikan dengan cara menyediakan getter dan/atau
 setter secara eksplisit.

 */

// membuat extension properties pada kelas Serangga
class Serangga(var nama: String, var berat: Double, var usia: Int, var cekBesar: Boolean)
val Serangga.dapatInfoSerangga: String
get()="Nama: ${this.nama}, Berat: ${this.berat}, Umur: ${this.usia}, Cek Besar: ${this.cekBesar}"

// menambahkan Extension Properties dapatInfoSerangga pada kelas Serangga, maka dapat menggunakan properti pada sebuah objek class Serangga
fun main(){
val jenisSerangga = Serangga("LuLaba-laba", 5.3, 4, false)
println(jenisSerangga.dapatInfoSerangga)
    /*
    output:
    Nama: LuLaba-laba, Berat: 5.3, Umur: 4, Cek Besar: false

     */
}