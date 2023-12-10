package com.diksgroup.kotlin

import kotlin.random.Random

//fun main(){
//    When Expressions

//    menentukan statement bisa gunakan when expression adalah mekanisme nilai dari sebuah variabel/expression mampu
//    mengubah alur program

//    val gemuk = 70
//    when(gemuk){
//        50 -> println("kriteria kurus")
//        70 -> println("kriteria normal")
//        90 -> println("kriteria gemuk")
//    }
//    output:
//    kriteria normal

//    when akan mencocokan semua argumen yang berada di setiap branch secara berurutan sampai
//    salah satu kondisi terpenuhi.
//    ---------------------------------------------------
//    dalam when kita juga bisa menambahkan branch else
//val nilaiAndi = 30
//    when(nilaiAndi){
//        50 -> println("nilai kurang")
//        70 -> println("nilai bagus")
//        90 -> println("nilai sangat bagus")
//    else -> println("nilai sangat kurang")
//    }

//    output: nilai sangat kurang

//    else akan dievaluasi jika tiada satupun kondisi yang terpenuhi pada branch sebelumnya.
//    -------------------------------------------
//    sama seperti if expression, when expression dapat mengembalikan nilai dan dapat disimpan di dalam sebuah variabel
//val usiaAndi =  25
//    val kesimpulan = when(usiaAndi){
//        11 -> println("masa kanak-kanak")
//        16 -> println("masa remaja awal")
//        25 -> println("masa remaja akhir")
//        35 -> println("masa dewasa awal")
//        else->"tidak ditemukan masa"
//
//    }
//    println(kesimpulan)
//    output:
//    masa remaja akhir

//  else adalah hal wajib jika kita menggunakan when expression untuk mengembalikan nilai. Bagaimana jika kita
//  melewatkannya? Akan tampil eror berikut:
//'when' expression must be exhaustive, add necessary 'else' branch
//------------------------------------------
//val IpkAndi = 3
//    val kesimpulan = when(IpkAndi){
//        2->{
//            println("Dua")
//            "Memuaskan"
//        }
//        3->{
//            println("Tiga")
//            "Sangat Memuaskan"
//
//        }
//        4->{
//            println("Empat")
//            "Pujian"
//
//        }
//        else->{
//            println("tidak definisi")
//            "nilai tidak ditemukan"
//
//        }
//    }
//    println(kesimpulan)
//    output:
//    Tiga
//    Sangat Memuaskan
//    ---------------------------
//    when memungkinkan untuk memeriksa instance dengan tipe tertentu dari sebuah objek menggunakan is atau !is.
//val tipeApapun : Any = 100L
//    when(tipeApapun){
//        is Long -> println("nilainya memiliki tipe Long")
//        is String -> println("nilainya memiliki tipe String")
//        else->println("tidak definisi")
//    }

//    output:
//    nilainya memiliki tipe Long
//    --------------------------
//    when expression bisa gunakan untuk memeriksa nilai yang terdapat sebuah range atau collection.
//    Range merupakan tipe data yang unik dimana kita dapat menentukan nilai awal dan nilai akhir.
//    contoh saat mengecek apakah sebuah nilai ada di dalam sebuah Range atau tidak.
//    val usiaAndri = 29
//    val rangeUsia = 11..31
//    when(usiaAndri){
//        in rangeUsia -> println("usia dalam jangkauan")
//        !in rangeUsia -> println("usia diluar jangkauan")
//        else->println("tidak definisi")
//    }
//    output:
// usia dalam jangkauan

//    branch pertama pada contoh kode diatas akan memeriksa apakah nilai dari usiaAndri terdapat di cakupan nilai
//    rangeUsia. kemudian untuk branch kedua akan memeriksa apakah nilai dari usiaAndri tidak terdapat pada nilai yang
//    dicakup oleh rangeUsia. sedangkan branch else akan mengevaluasi jika 2 kondisi sebelumnya tidak terpenuhi.
//    ----------------------------------
//    Sejak Kotlin 1.3, dapat menangkap subjek dari when expression di dalam sebuah variabel.
//    val registerNumber = when(val regis = getRegisterNumber()){
//        in 1..20 -> 20 + regis
//        in 21..40-> 40 + regis
//        in 41..60->60 + regis
//        in 61..80->80 + regis
//        in 81..100 -> 100 + regis
//        else -> regis
//    }
//
//    println(registerNumber)
//    output: 107
//}

//fun getRegisterNumber() = Random.nextInt(100)
//============================================
//Jika kita melihat penjelasan dan contoh penggunaan dari when expression di atas, ia memiliki kesamaan dengan
// if expression. Lantas disituasi seperti apa kita menggunakannya? if expression sebaiknya digunakan ketika kondisi
// yang diberikan tidak lebih dari 2 (dua) dan kondisi yang diberikan tidak terlalu rumit.

fun main(){
    val tipeApapun : Any = 100L
    if(tipeApapun is Long){
        println("nilai adalah tipe Long")
    }else{
        println("nilai bukan tipe Long")
    }
//    output:
//    nilai adalah tipe Long

//    =========================
//    when expression digunakan ketika kondisi yg diberikan lebih dari 2
    val anyType: Any = 100L
    when(anyType){
        is Long -> println("nilai adalah tipe Long")
        is Int -> println("nilai adalah tipe Int")
        is Double -> println("nilai adalah tipe DOuble")

        else -> println("tidak definisi")
    }
    //    output:
//    nilai adalah tipe Long
}



