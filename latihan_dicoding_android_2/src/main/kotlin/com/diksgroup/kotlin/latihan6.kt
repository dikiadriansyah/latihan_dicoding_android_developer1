package com.diksgroup.kotlin

fun main(){
    val kantorBuka = 8
    val kantorTutup = 17
    val sekarang = 20
//    val kesimpulan = if(sekarang >= kantorBuka && sekarang <= kantorTutup){
//true
//    }else{
//        false
//    }

//    cara sederhanakan if expression

    val kesimpulan = sekarang >= kantorBuka && sekarang <= kantorTutup

//    print("Situasi Kantor: $kesimpulan")

//    output:
//    Situasi Kantor: false

//    -------------------
//    Disjunction atau OR (||)
    val waktuPagi = 7
    val waktuSore = 14
    val sekarang2 = 18
    val kesimpulan2 = sekarang2 < waktuPagi || sekarang2 > waktuSore
//    print("Situasi langit adalah : $kesimpulan2 ")
// output:
//    Situasi langit adalah : true

//    ------------------
//    Negation atau NOT(!)
    val kantorBuka2 = 7
    val sekarang3 = 14
    val cekKantor = sekarang3 > kantorBuka2

    if(!cekKantor){
        print("kantor sedang tutup")
    }else{
        print("kantor sedang buka")
    }
//output:
//    kantor sedang buka

}