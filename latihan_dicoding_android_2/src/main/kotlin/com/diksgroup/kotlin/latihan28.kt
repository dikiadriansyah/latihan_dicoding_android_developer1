package com.diksgroup.kotlin

//fun main(){
//    Vararg(Variable Argument)

//    selain named dan default argument, kotlin memiliki vararg(variable argument). dengan keyword vararg bisa
//    menyederhanakan beberapa parameter yg memiliki tipe data yg sama menjadi parameter tunggal.
//    Dengan vararg sebuah fungsi dapat memiliki jumlah parameter berdasarkan jumlah argumen yang kita masukkan ketika fungsi tersebut dipanggil.
//val bilangan = jumlahBilangan(5,10,15,20,25,30)
//    print(bilangan)
//    output:
//    105
//}

//fun jumlahBilangan(vararg bilangan: Int): Int{
//    return bilangan.sum()
//}

//-----------------------------
//menerapkan Generic untuk tipe parameter ketika parameter tersebut ditentukan dengan vararg.
//fun <T>asList(vararg masukan: T): List<T>{
//    val hasil = ArrayList<T>()
//    for(item in masukan)
//        hasil.add(item)
//    return hasil
//}
//Ketika sebuah parameter ditentukan dengan vararg, pada dasarnya semua argumen yang dilampirkan, ditampung di dalam
// sebuah Array <out T>.
//Karena dasarnya adalah array,maka kita bisa memanggil fungsi atau properti yang tersedia pada kelas Array dari
// dalam fungsi tersebut.
//fun main(){
//val bilangan = dapatkanUkuranAngka(4,8,16,20,24,28)
//    print(bilangan)
//    output:
//    6
//}

//fun dapatkanUkuranAngka(vararg bilangan: Int):Int{
//    return bilangan.size
//}
//kapan membutuhkan vararg?
//Ketika sebuah fungsi yang menggunakannya tidak mengetahui jumlah argumen yang akan disematkan ketika fungsi tersebut
// dipanggil. Contoh penerapan bisa kita liat pada fungsi String.format(),  di mana fungsi tersebut terdapat parameter yang ditandai dengan vararg dan dapat disematkan beberapa argumen tanpa harus tahu batasannya
//--------------
// aturan pada Vararg Arguments
// 1. alam sebuah fungsi, tidak diizinkan untuk memiliki 2 parameter bertanda vararg.
//fun hitungAngka(vararg bilangan: Int, vararg bilangan2: Int){
//    return bilangan.size
//}
//Ketika kode di atas dijalankan, proses kompilasi akan gagal dengan log eror sebagai berikut:
//Kotlin: Multiple vararg-parameters are prohibited


// 2. jika kita ingin menambahkan parameter baru tanpa kata kunci vararg, parameter yang ditandai dengan vararg
// sebaiknya berada pada posisi terakhir.

//fun main(){
//   val hasil = campuran("Java", 40, 20)
//print(hasil)
//    output:
//    4
//}

//fun campuran(jenis: String, vararg bilangan: Int):Int{
//    return jenis.length
//}

//---------------------
// jika kita ingin menempatkan parameter yang ditandai vararg pada posisi pertama?
// Kita bisa mendefinisikannya secara langsung. Namun berbeda saat fungsi tersebut dipanggil di mana kita harus
// menggunakan named argument saat ingin melampirkan argumen untuk parameter yang tidak ditandai dengan vararg
//fun main(){
//    atur(2,5, jenis="Python")
//}
//fun atur(vararg bilangan: Int, jenis: String):Int{
//    return bilangan.sum()
//}

// aat kita tidak menandai argumen tersebut untuk parameter yang mana, kompiler akan menetapkan jika argumen tersebut
// untuk parameter yang ditandai dengan vararg.
//---------------------------
//Vararg vs Array<T>
//Karena semua argumen ditampung di dalam sebuah Array, maka akan muncul pertanyaan, "Apa bedanya ketika kita
// menggunakan Array<T> sebagai tipe parameter?

//fun main(){
//    val bilangan = arrayOf(5,10,15,20)
//atur(bilangan)
//}

//fun atur(bilangan: Array<Int>){
//    return bilangan
//}
//Berbeda ketika kita menggunakan vararg. Kita bisa memasukkan argumen satu persatu. Lalu apakah bisa kita memasukkan
// nilai yang sudah berbentuk Array sebagai argumen untuk parameter yang ditandai dengan vararg?

//-------------
//Tentu bisa! Dengan memanfaatkan spread operator (*)
fun main(){
    val angka = intArrayOf(5,10,15,20,25,30)
val hasil=    atur(2,4,2, *angka, 5)
print(hasil)
//    output:
//    10
}
fun atur(vararg angka: Int): Int{
    return angka.size
}
//Dalam penggunaannya, spread operator ditempatkan sebelum nama variabel yang ingin dilampirkan.