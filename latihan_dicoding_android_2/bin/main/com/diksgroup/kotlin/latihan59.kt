package com.diksgroup.kotlin
// Konsep Generic

// Generics adalah konsep yang memungkinkan suatu kelas atau interface menjadi tipe parameter yang dapat digunakan
// untuk berbagai macam tipe data.

/*
Kotlin termasuk dalam bahasa pemrograman statically typed. Ketika menambahkan variabel baru, maka secara otomatis tipe
dari variabel tersebut dapat dikenali pada saat kompilasi.
 */
/*
generic adalah konsep untuk menentukan tipe data yang akan kita gunakan.
Pendeklarasiannya ditandai dengan tipe parameter. Kita juga bisa mengganti tipe parameter menjadi tipe yang lebih
spesifik dengan menentukan instance dari tipe tersebut.

contoh bagaimana generic bekerja pada variabel dengan tipe List.
menentukan tipe dari nilai yang bisa disimpan di dalam variabel List.
 */
fun main(){
//val Kontributor = listOf<String>("Dhiki","Andi","Bela","Lia","Cerli","Mamat")
//    println(Kontributor)
    /*
    output:
    [Dhiki, Andi, Bela, Lia, Cerli, Mamat]
     */
/*
kode diatas tipe parameter yang digunakan dalam pemanggilan fungsi listOf() adalah String maka nilai yang bisa kita
masukkan adalah nilai dengan tipe String.
 */

//    contoh menyederhanakan dengan menghapus tipe parameter.
//    val teman = listOf("Andika", "Dzikri","Dandi","Ade","Freddy")

// membuat variabel list tanpa langsung menambahkan nilainya.
    /*
Maka list tersebut tidak memiliki nilai yang bisa dijadikan acuan untuk kompiler menentukan tipe parameter, sehingga
 wajib menentukan secara eksplisit
     */

//    var kontribusi = listOf<String>()
//    ----------------------
// mendeklarasikan lebih dari 1 tipe parameter untuk sebuah class. contoh kelas Map yang memiliki dua tipe parameter
// yang digunakan sebagai key dan value. Kita bisa menentukannya dengan argumen tertentu,
val nilaiKelas = mapOf<String, Int>("Diki" to 10, "Amar" to 5, "Bela" to 6)
print(nilaiKelas)
    /*
    output:
    {Diki=10, Amar=5, Bela=6}
     */
}