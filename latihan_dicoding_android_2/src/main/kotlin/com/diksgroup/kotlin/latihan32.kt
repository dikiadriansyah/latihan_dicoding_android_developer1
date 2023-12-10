package com.diksgroup.kotlin
//    Lambda

//    lambda expression biasa disebut anonymous function atau function literal adalah fitur yg cukup populer sampai
//    sekarang dalam dunia Functional Programming(FP). anonymous karena lambda tidak memiliki sebuah nama seperti halnya
//    sebuah fungsi pada umumnya. lambda juga dapat memiliki daftar parameter, body, dan return type.

//    - lambda tidak membutuhkan keyword fun dan visibility modifier saat dideklarasikan, karena lambda bersifat anonymous
//    - lambda ditulis {}
//    - ketika mengembalikan nilai, keyword return tidak diperlukan karena kompiler akan secara otomatis mengembalikan
//    nilai dalam body
//    - lambda digunakan sebagai argumen untuk sebuah parameter dan dapat disimpan ke dalam sebuah variabel.
//    - lmbda sangat berguna karena dapat membuat penulisan kode menjadi lebih mudah dan sederhana.
//    contoh anonymous class tanpa lambda:
//    val comparator = object: Runnable{
//        override fun run(){
//
//        }
//    }

//    dengan lambda:
//    val comparator= Runnable{
//
//    }

//    ----------
//    menggunakan Lambda expression
//val perkenalan = {
//    println("Selamat pagi bapak")
//}
//fun main(){

//    perkenalan()

//output:
//    Selamat pagi bapak

// kode diatas adalah contoh deklarasi dari lambda, dimana fungsi lambda diatas ditandai dengan sepasang kurung kurawal.
// di dalamnya terdapat fungsi untuk mencetak teks pada konsol. ketika ingin menggunakannya, kita bisa memanggil seperti
// halnya kita memanggil sebuah fungsi pada umumnya

//    ----------------------------
//jika ingin menambahkan sebuah parameter pada fungsi lambda, kita bisa menuliskan
//    kalimatPerpisahan("Selamat tinggal teman")
//}
//val kalimatPerpisahan={
//    pesan: String->println(pesan)
//}
/*
output:
Selamat tinggal teman

 parameter dari sebuah lambda berada di dalam kurung kurawal. Untuk membedakannya dengan body, daftar parameter yang ada
  dipisahkan dengan tanda ->

 */
//---------------------------------
//mendeklarasi lambda agar dapat mengembalikan nilai

fun main(){
    val panjang = kalimatPerpisahan("Selamat Tinggal Teman")
println("Panjang pesan $panjang")
}

val kalimatPerpisahan = {
    pesan: String ->
    pesan.length
}
/*
output:
panjang pesan 21


kita tidak membutuhkan tipe kembalian dan keyword return untuk mengembalikan sebuah nilai. kompiler akan mengembalikan
nilai berdasarkan expression atau statement di baris terakhir di dalam body
 */