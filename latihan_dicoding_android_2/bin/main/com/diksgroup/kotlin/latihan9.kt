package com.diksgroup.kotlin

fun main(){
//    Nullable Types
//    NullPointerException(NPE) sebuah kesalahan yang terjadi saat ingin mengakses atau mengelola nilai dari sebuah
//    variabel yang belum diinisialisasi atau variabel bernilai null.

// pada kotlin dimudahkan untuk mengelola variabel nullable sehingga meminimalisir NullPointerException.
//    kotlin mampu membedakan objek yang boleh bernilai null dan objek yang tidak boleh benilai null
//val alamat: String = null //compile time error

//    jika ingin objek bernilai null, bisa menambahkan tanda ? setelah menentukan tipe
    val alamat: String? = null

    // tidak bisa langsung mengakses atau mengelola nilai dari objek yang sudah tandai sebagai nullable
//    val panjangAlamat = alamat.length // compile time error
//    println(panjangAlamat)
// output
// Error:(4, 26) Kotlin: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type
// String?

//    cara mengakses atau mengelola nilai dari objek yang ditandai sebagai nullable? dengan periksa objek tersebut
//    apakah bernilai null atau tidak
if(alamat != null){
    val panjangAlamat = alamat.length

}

//    contoh diatas adalah cara tradisional menggunakan if/else,
//    compiler akan mengizinkan untuk mengelola nilai dari sebuah variabel yang tandai sebagai nullable

}