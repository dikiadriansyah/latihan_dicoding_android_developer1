package com.diksgroup.kotlin

fun main(){
//    Collections

//    Collection merupakan sebuah objek yang bisa menyimpan kumpulan objek lain termasuk data class. Dengan
//    collection kita bisa menyimpan banyak data sekaligus.
//    Di dalam collections terdapat beberapa objek turunan, di antaranya adalah List, Set, dan Map.


// List
//    menyimpan banyak data menjadi satu objek. Sebagai contoh, kita bisa membuat sebuah List yang berisi sekumpulan
//    data angka, karakter atau yang lainnya. Yang menarik, sebuah List tidak hanya bisa menyimpan data dengan
//    tipe yang sama. Namun juga bisa berisi bermacam - macam tipe data seperti Int, String, Boolean
//val bilanganAsli: List<Int> = listOf(1,2,3,4,5,6)
//    print(bilanganAsli)
    /*
    output:
    [1,2,3,4,5,6]
     */
//    kode diatas adalah 1 objek List yg berisi kumpulan data dengan tipe int. Karena kompiler bisa mengetahui
//    tipe data yang ada dalam sebuah objek List, maka tak perlu kita menuliskannya secara eksplisit
//    ----------------------------

//val daftarChar = listOf('a','b','c')
//    print(daftarChar)
/*
output:
[a, b, c]
 */
//    -----------------------------------------
//    val daftarApapun = listOf('a',"Flutter", 4, true)
//print(daftarApapun)
    /*
output:
[a, Flutter, 4, true]
 */

//    Karena setiap objek pada Kotlin merupakan turunan dari kelas Any, maka variabel daftarApapun tersebut akan memiliki
//    tipe data List<Any>.
//    ----------------------------------------------
    // bisa memasukkan data class ke dalam list
//val listCampuran = listOf('a',"Java", 4, true, User2("Ardi Pangestu", 27))
//println(listCampuran)
    /*
    output:
    [a, Java, 4, true, User(nama= Ardi Pangestu, umur= 27)]
     */

//    sebuah List mengakses posisi tertentu dari List tersebut. bisa menggunakan fungsi indexing.
//    println(listCampuran[3])
//    output:
//    true

//    kode diatas fungsi indexing ditandai dengan []. karena sebuah list, indeks dimulai dari 0.

//    jika menampilkan item dari List yg berada di luar dari ukuran list, contoh mengakses indeks ke 5.
//    println(listCampuran[5])

//    output:
//    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5

//    pesan diatas memberitahu list telah diakses dengan indeks ilegal. Ini akan terjadi jika indeks yang kita
//    inginkan negatif atau lebih besar dari atau sama dengan ukuran List tersebut.

//--------------------------
//    informasi tambahan:
//    list bersifat immutable alias tidak bisa diubah. namun Kotlin Standard Library(KSL) menyediakan collection dengan
//    tipe mutable yg merupakan melakukan perubahan pada nilainya dengan cara seperti menambah, menghapus, atau
//    mengganti nilai yg sudah ada.
//    menggunakan fungsi mutableListOf:
val daftarSemua = mutableListOf('a',"Flutter", 4, true, User2("Dafa Iskandar", 34))
daftarSemua.add('e')
    daftarSemua.add(1,"Angularjs")
    daftarSemua[3] = false
    println(daftarSemua)

    /*
    output:
    [a, Angularjs, Flutter, 4, true, User(nama= Dafa Iskandar, umur= 34), e]
     */
daftarSemua.removeAt(0)
    println(daftarSemua)
/*
output:
[Angularjs, Flutter, false, true, User(nama= Dafa Iskandar, umur= 34), e]
 */

//    variabel daftarSemua sebuah list yg bersifat mutable dan bisa manipulasi data didalamnya

}


class User2(val nama: String, val umur: Int){
    override fun toString(): String{
        return "User(nama= $nama, umur= $umur)"
    }
}