package com.diksgroup.kotlin

//data class DataUser2(val nama: String, val umur: Int)

//fun main(){
//    Destructuring Declarations

//    proses memetak objek menjadi sebuah variabel. ini bisa dengan mudah lakukan pada data class. dengan
//    fungsi componentN() yg ada pada data class, bisa menguraikan sebuah objek menjadi beberapa properti yg dimilikinya
//    sebagai contoh menguraikan objek dataUser:
//    val dataUser = DataUser2("Riansyah Saputra", 20)
//
//    val nama = dataUser.component1()
//    val umur = dataUser.component2()
//    println("nama saya adalah $nama, saya berumur $umur tahun")

    /*
    output:
    nama saya adalah Riansyah Saputra, saya berumur 20 tahun
     */
//    fungsi component1() dan component2() dihasilkan dengan jumlah properti yg ada pada data class. maka jika sebuah
//    data class memiliki sejumlah N properti, maka secara otomatis componentN() akan dihasilkan.

//    ------------------------------------
//    membuat variabel dari objek secara langsung
//    val dataUser = DataUser("Dhiki adriansyah",24)
//    val (nama, umur)=dataUser
//
//    println("nama saya adalah $nama, saya berusia $umur tahun")
//output:
    /*
    nama saya adalah Dhiki adriansyah, saya berusia 24 tahun
     */

    /*
    kesimpulan:
    data class bertujuan untuk mengurangi jumlah kode boilerplate yg anda tuliskan.
Dan perlu diketahui bahwa data class tidak hanya sekedar untuk mengelola properti yang ada di dalamnya. Ketika mempunyai
 data yang sangat kompleks, kita juga bisa menerapkan sebuah behaviour di dalam data class.
     */
//}

//-----------
// membuat fungsi di dalam data class
data class DataUser2(val nama: String, val umur: Int){
    fun perkenalan(){
        println("nama saya adalah $nama, saya berusia $umur tahun")
    }
}


fun main(){
    val dataUser = DataUser2("Rian Saputra", 23)
    dataUser.perkenalan()
}
// output:
//nama saya adalah Rian Saputra, saya berusia 23 tahun