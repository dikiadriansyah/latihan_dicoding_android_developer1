package com.diksgroup.kotlin

class latihan5 {
}

fun main(){
    val umurAndi = 24
    val umurSusi = 20
    val kesimpulan: String
//    if(umurAndi > umurSusi){
//kesimpulan = "Umur andi lebih tua dibanding umur susi"
//    }else{
//        kesimpulan = "Umur Susi lebih tua"
//    }
//    println(kesimpulan)
//    output:
//    Umur andi lebih tua dibanding umur susi
//----------------------
//kesimpulan = if(umurAndi > umurSusi){
//"Umur andi lebih tua dibanding umur susi"
//}else{
//"Umur Susi lebih tua"
//}
//print(kesimpulan)
    //    output:
//    Umur andi lebih tua dibanding umur susi
//-----------------------
    val umurSusi2 = 24
    kesimpulan = if(umurAndi > 24){
"Umur andi lebih tua dibanding umur susi"
    }else if(umurAndi == umurSusi2){
"umur andi sama dengan umur susi"
    }else{
"tidak sama"
    }
    print(kesimpulan)
    //    output:
//    umur andi sama dengan umur susi

//    Perlu diketahui bahwa Kotlin tidak mendukung ternary operator (condition ? then : else), karena peran dari
//    operator tersebut sudah digantikan dengan if expressions.
}