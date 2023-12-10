package com.diksgroup.kotlin

class latihan2 {
}
fun main(){
//    Data types & variable

//    var atau val
//    var atau val digunakan untuk mengontrol nilai dari sebuah variabel. Dengan kata kunci var kita bisa mengubah nilai yang sudah kita inisialisasikan. Sebagai contoh:

    var company: String = "Diksgroup"
    company = "Diksgroup Corporation"
    println(company)
    val addres: String = "jl moh kahfi 2"
//    addres="jl moh kahfi 2 jakarta selatan" // val cannot be reassigned

    val firtstName = "Dhiki "
    val lastName = "Adriansyah"
    println(firtstName + lastName)
//    output: Dhiki Adriansyah

    val umurSebelumnya : Int = 23
    val umurSelanjutnya = 24
    print(umurSelanjutnya + umurSebelumnya) // output 47

}