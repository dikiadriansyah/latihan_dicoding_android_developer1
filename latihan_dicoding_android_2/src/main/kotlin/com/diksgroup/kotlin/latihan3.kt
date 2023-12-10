package com.diksgroup.kotlin

class latihan3 {
}

fun main(){
//    char dan string

//    char
//    char menggunakan tanda kutip tunggal('')
//    val abjad = 'A'

// char hanya untuk menyimpan karakter tunggal. sebaliknya jika memasukan lebih dari 1 karakter akan terjadi error
//val abjadDuplikat: Char = 'ABC' // incorrect character literal

//    char bisa melakukan operasi incremental(++) dan decremental(--)
    var abjad = 'A'
//    println("Abjad "+ abjad++)
//    println("Abjad "+ abjad++)
//    println("Abjad "+ abjad++)
//    println("Abjad "+ abjad--)
//    println("Abjad "+ abjad--)
//    println("Abjad "+ abjad--)
//    println("Abjad "+ abjad--)
    // output
    /*
    * Abjad A
    * Abjad b
    * Abjad c
    * Abjad d
    * Abjad c
    * Abjad b
    * Abjad a
    * */

//    operasi increment dan decrement merupakan operasi yang bisa kita gunakan pada tipe data number. kenapa bisa
//    menggunakan Char? karena characters merupakan representasi dari Unicode. contoh Unicode A adalah 0041. ketika
//    melakukan increment maka hasilnya 0042 yg mana merupakan Unicode dari B
//--------------------------------------
//    String
// String bisa menampung beberapa karakter di dalamnya. string diberi simbol petik ganda("").
    val nama = "Dhiki Adriansyah"
//    pada dasarnya karakter dalam string tersebut berbentuk array, sehingga mendapatkan karakter tunggal dengan mudah.
//    caranya manfaatkan indexing.
val namaDepan = nama[0]
//    print("karakter pertama dari $nama adalah $namaDepan")
// output
//    karakter pertama dari Dhiki Adriansyah adalah Dhiki

//    indexing adalah cara untuk mengakses elemen yg berada di dalam sebuah Collection dengan memanfaatkan index atau
//    posisi dari elemen.

    val profesi = "Programmer"
//    for(p in profesi){
//        print("$p ")
//    }
//    output:
//    P r o g r a m m e r
//    ------------------------
//    kolin memiliki 2 jenis tipe literal string:
//    1. escaped string
//    2. raw string

// Escaped String
// ditanda tanda karakter backslash(\) dalam string
val kalimatMotivasi = "Belajar yang \"Rajin!\" dan \"Tekun\""
//    println(kalimatMotivasi)
//    output:
//    belajar yang "Rajin!" dan "Tekun"

//    selain \" diatas, terdapat karakter lain untuk melakukan escaped di dalam sebuah string, antara lain:
//    \t: menambah tab ke dalam teks.
//    \n: membuat baris baru di dalam teks.
//    \’: menambah karakter single quote kedalam teks.
//    \”: menambah karakter double quote kedalam teks.
//    \\: menambah karakter backslash kedalam teks.

    val uni = "Unicode test: \u00A9"
    println(uni)
    /*
    * output:
    * unicode test: ©
    * */

//    RAW String
//    memungkinkan menuliskan multiline dan arbitrary text.
//    Ketika membuat beberapa baris String biasanya melakukan escaped terhadap String memanfaatkan karakter escape \n
    val line = "Line 1\n" +
            "Line 2\n" +
            "Line 3\n" +
            "Line 4\n"

    val alamat = """
        Jl. moh kahfi 2
        Srengsengsawah
        Jagakarsa
        Jakarta Selatan
    """.trimIndent()

    println(alamat)
/*
output :
* Jl. moh kahfi 2
* Srengsengsawah
* Jagakarsa
* Jakarta Selatan
* */

//    pada kode diatas, mendefinisikan Raw String menggunakan triple Qoute("""""").
//    Raw String untuk membuat beberapa baris string tanpa penggabungan(concatenation) dan penggunaan karakter escaped

}