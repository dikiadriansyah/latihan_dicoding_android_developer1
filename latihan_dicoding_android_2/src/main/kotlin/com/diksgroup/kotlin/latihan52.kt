package com.diksgroup.kotlin
// Overloading
// menggunakan dua atau lebih fungsi dengan nama yang sama
//Overloading dapat dilakukan selama fungsi itu memiliki parameter yang berbeda.
//class HewanEmpat(private var nama: String){
//    fun makan(){
//        println("$nama sedang makan")
//    }
//
//    fun makan(jenisMakanan: String){
//        println("$nama memakan $jenisMakanan")
//    }
//
//    fun makan(jenisMakanan: String, jml: Double){
//        println("$nama memakan $jenisMakanan sebanyak $jml gram")
//    }
//
//    fun tidur(){
//        println("$nama tidur")
//    }
//
//    }
/*
pada class HewanEmpat terdapat beberapa fungsi dengan penamaan yang sama, tetapi tidak menyebabkan eror. Sebabnya,
fungsi tersebut memiliki parameter yang berbeda sehingga tidak akan terjadi ambiguitas dalam penggunaan fungsi tersebut
 */
//fun main(){
//val kucing = HewanEmpat("LuluMiaw")
//    kucing.makan()
//    kucing.makan("Wiskas")
//    kucing.makan("Wiskas", 30.2)
// output
/*
LuluMiaw sedang makan
LuluMiaw memakan Wiskas
LuluMiaw memakan Wiskas sebanyak 30.2 gram

 */
//}
//------------------------
class Kalkulator{
    fun penjumlahan(nilai1: Int, nilai2: Int)=nilai1+nilai2
    fun penjumlahan(nilai1: Int, nilai2: Int, nilai3: Int)=nilai1+nilai2+nilai3
    fun penjumlahan(nilai1: Double, nilai2: Double)=nilai1+nilai2
    fun penjumlahan(nilai1: Float, nilai2: Float)=nilai1+nilai2

    fun minimal(nilai1: Int, nilai2: Int) = if(nilai1 < nilai2){
        nilai1
    }else{
        nilai2
    }

    fun minimal(nilai1: Double, nilai2: Double)=if(nilai1 < nilai2){
        nilai1
    }else{
        nilai2
    }
}
fun main(){
    val kalkulator = Kalkulator()
    println(kalkulator.penjumlahan(4,3))
    // output: 7

    println(kalkulator.penjumlahan(4,3, 2))
    // output: 9

    println(kalkulator.penjumlahan(10.3,3.5))
    // output: 13.8

    println(kalkulator.penjumlahan(2f,1f))
    // output: 3.0

    println(kalkulator.minimal(7,4))
    // output: 4

    println(kalkulator.minimal(13.4,13.2))
    // output: 13.2


    /*
  fungsi penjumlahan(4,3) memanggil fungsi penjumlahan yg memiliki parameter Integer, fungsi penjumlahan(10.3, 3.5)
  memanggil fungsi penjumlahan yg memiliki parameter Double
     */
}
