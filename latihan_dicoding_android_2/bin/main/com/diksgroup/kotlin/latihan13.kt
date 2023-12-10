package com.diksgroup.kotlin

//fun main(){
//    Expressions dan Statements

//    val gemuk = 100
//    val beratSekarang = 58
//    if(beratSekarang > gemuk)
//      println("kelebihan berat badan")
//    else
//        println("berat badan normal")


//    output:
//    berat badan normal
//    --------------------
//    if pada kotlin digunakan sebagai expression. dimaksud expression adalah statement yg dapat mengembalikan nilai dan
//    bisa kita simpan ke dalam sebuah variabel

//val kesimpulan = if(beratSekarang > gemuk) "kelebihan berat badan" else "berat badan normal"
//println(kesimpulan)
//    output:
//    berat badan normal

//    if akan mengembalikan nilai ke dalam variabel
//    ---------------------------------------

//    dalam sebuah expression bisa terdapat sesbuah expression
//  println(sum(1,2*8))
//    output:
//    17
//}
//fun sum(value1: Int, value2: Int) = value1+value2

// pada 2*8 merupakan sebuah expression yg ada pemanggilan fungsi sum() alias fungsi yg mengembalikan nilai. setiap
// fungsi selalu mengembalikan nilai. alhasil, pemanggilan sebuah fungsi merupakan sebuah expression
//----------------------

fun main(){
    val bilanganSatu = 34
    val bilanganDua = 23

  println(jumlahBilangan(bilanganSatu, bilanganDua))
}
fun jumlahBilangan(bilanganSatu: Int, bilanganDua: Int) = bilanganSatu+bilanganDua

//output: 57

// deklarasi variabel bilanganSatu dan bilanganDua adalah statement. sedangkan pemanggilan fungsi jumlahBilangan adalah
// sebuah expression
