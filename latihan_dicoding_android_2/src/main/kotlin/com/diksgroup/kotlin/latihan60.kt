package com.diksgroup.kotlin

// deklarasi kelas Generic

// menerapkannya dengan meletakkan tipe parameter ke dalam angle brackets (<>)
interface List<T>{
    operator fun get(index: Int) :T
}
// kode diatas tipe parameter T  sebagai tipe reguler yg mengembalikan tipe dari sebuah fungsi
/*
------------------------------
jika kita mempunyai sebuah kelas yang mewarisi kelas atau interface generic, maka kita perlu menentukan tipe argumen
sebagai tipe dasar dari parameter generic kelas tersebut. Parameternya bisa berupa tipe yang spesifik atau lainnya.
 */
class panjangList : List<Long>{
    override fun get(index: Int): Long{
        return this[index]
    }
}

class ArrayList<T>: List<T>{
    override fun get(index: Int): T{
        return this[index]
    }
}
/*
pada class panjangList, Long digunakan sebagai tipe argumen untuk List, sehingga fungsi yg berada didalamnya akan
menggunakan Long sebagai tipe dasarnya.
berbeda dengan class ArrayList, dimana tipe argumen untuk kelas List menggunakan T. dengan demikian ketika kita
menggunakan kelas ArrayList, kita perlu menggunakan tipe argumen dari kelas tersebut saat diinisialisasi.
 */

fun main(){
val panjangArrayList = ArrayList<Long>()
//    val panjangPertama = ArrayList.get(0)

println(panjangArrayList)
    /*
    output:
    com.diksgroup.kotlin.ArrayList@4517d9a3
     */
}
/*
kelas Arraylist diatas adalah deklarasi dari tipe parameter T. tipe parameter berbeda dengan yg ada pada class List,
karena T adalah milik kelas ArrayList sendiri.

contoh menggunakan selain T:
 */
interface Daftar<P>{
    operator fun get(index: Int) : P
}

