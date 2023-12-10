package com.diksgroup.kotlin

class latihan4 {
}
//functions
// merupakan sebuah prosedur yang memiliki keterkaitan dengan pesan dan objek.

//contoh sintaks:
/*
* fun namafungsi(param1: Type1, param2: Type2, ....): ReturnType{
* return result
* }
* */

//pendeklarasian fungsi pada kotlin diawali dengan keyword fun kemudian dilanjutkan nama fungsi yang dikehendaki.
// selanjutnya adalah parameter yang berada pada fungsi yang dideklarasikan.
fun setUser(name: String, age: Int): String{
    return "Your name is $name, and you $age years old"
}

// penerapan lain jika dalam suatu fungsi hanya memiliki 1 expression untuk menentukan nilai kembalian, maka fungsi
// tersebut bisa diubah menjadi expression body perlu menambahkan tanda =

fun setAddress(name: String, kodePos: Int) = "Your address is $name, and you postalcode $kodePos"

fun printUser(name: String){
    println("Your name is $name")
}

fun main(){
    val user = setUser("DHiki", 24)
    println(user)

    printUser("Andrian")

val addr =  setAddress("Jl.Rasuna Said", 12640)
println(addr)
/*
* output:
* your name is DHiki, and your 24 years old
* Your name is Andrian
* Your address is Jl.Rasuna Said, and you postalcode 12640
* */

}
