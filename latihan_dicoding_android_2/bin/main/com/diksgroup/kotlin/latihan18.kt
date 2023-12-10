package com.diksgroup.kotlin

fun main(){
//    break dan continue

//    ketika perulangan dihadapkan data yg tidak sesuai harapan.
    val bilanganCampur = listOf(1,2,3,null,5,null,7,null,9)
//    for(bc in bilanganCampur){
//        println(bc)
//    }
//    output:
/*
1
2
3
null
5
null
7
null
9
 */

//perulangan kode diatas menghasilkan nilai null, jika mengelola nilai tersebut, ada potensi NullPointerException. lalu
// bagaimana melewatkan atau menghentikan proses perulangan jika nilai yg dihasilkan bernilai null? bisa menggunakan
// Break dan Continue

//    --------------------------------
// Continue digunakan untuk melewatkan proses iterasi dan lanjut dengan proses iterasi berikutnya. Sementara itu,
// Break digunakan untuk menghentikan proses iterasi.
//for(bc in bilanganCampur){
//    if(bc == null) continue
//    print(bc)
//}
//output:
//    123579

    /*
    menggunakan kata kunci continue. Jika hasil evaluasi expression yang diberikan bernilai true, maka proses iterasi
    akan dilewatkan dan lanjut ke proses iterasi berikutnya.
    * */

//    -------------------------------------------
//for(bc in bilanganCampur){
//    if(bc==null)break
//    print(bc)
//}
//    output:
//    123
//    kode diatas menggunakan keyword break sehingga langsung menghentikan proses iterasi jika variabel bc bernilai null
//    --------------------------
//   break dan continue labels
//   pada kotlin sebuah expression dapat ditandai dengan sebuah label. label pada kotlin memiliki sebuah
//   identifier yg diikuti dengan tanda @. contoh sebuah label adalah foo@ atau bar@

//    untuk melabeli sebuah expression, kita cukup menempatkan label di depannya.
loop@ for(bc in 1..10){
    println("Perulangan diluar")


    for(j in 1..10){
        println("Perulangan di dalam ")
        if(j > 5) break@loop
    }
}

//    output:
/*
Perulangan diluar
Perulangan di dalam
    Perulangan di dalam
    Perulangan di dalam
    Perulangan di dalam
    Perulangan di dalam
    Perulangan di dalam
*/
//    kode diatas break yg sudah ditandai dengan label akan dilompati ke titik awal proses perulangan yg sudah ditandai
//    dengan label. break akan menghentikan proses perulangan terluar dari dalam proses perulangan, dimana break
//    tersebut dipanggil

}