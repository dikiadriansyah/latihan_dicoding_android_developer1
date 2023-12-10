package com.diksgroup.kotlin
//    Named dan Default Argument

//    Named Argument
//    ketika sebuah fungsi dipanggil, kita bisa menentukan argumen dari parameter mana yg ingin dilampirkan dengan
//    memanggil nama dari parameter tersebut

//fun dapatkanNamaLengkap(tengah: String,depan: String,  belakang:String): String{
//    return "nama depan: $depan,nama tengah: $tengah, nama belakang: $belakang"
//}
//fun main(){
//val namaLengkap = dapatkanNamaLengkap(depan="Susilo", tengah="Bambang",belakang="Yudhoyono")
//    print(namaLengkap)
//    output:
//    nama depan: Susilo,nama tengah: Bambang, nama belakang: Yudhoyono

    /*
    Dengan cara seperti di atas, kita tidak perlu lagi menghafal posisi dari parameter jika ingin melampirkan sebuah
    argumen. Cukup hafalkan nama dari parameter tersebut.
     */
//}

//--------------------
// Default Argument
//Kotlin juga memungkinkan kita untuk menentukan nilai default dari sebuah parameter. Jika kita melewatkan argumen untuk
// dilampirkan, maka nilai default tersebut lah yang akan digunakan.
//menambahkan nilai default itu sendiri pun cukup mudah, yaitu dengan cara menempatkannya langsung tepat di samping
// dari parameter seperti halnya ketika ingin menginisialisasikan sebuah nilai untuk variabel.
//fun perkenalanBaru(depan: String="Selamat", tengah: String="Pagi", akhir: String ="Teman"): String {
//return "$depan $tengah $akhir"
//}
//
//fun main(){
//    val perkenalanBaru = perkenalanBaru()
//    panggil fungsi bernama perkenalanBaru yg sudah default argument

//    print(perkenalanBaru)
//    output:
    /*
    Selamat Pagi Teman
     */
//}

//---------------------------------------------
 fun dapatkanNamaLengkap(depan:String="Alia", tengah:String="Shakeela",akhir:String="Zanitha"):String{
     return "$depan $tengah $akhir"

 }

fun main(){
    val namaLengkap = dapatkanNamaLengkap(depan="Dania")
    print(namaLengkap)
//    output:
//    Dania Shakeela Zanitha
}