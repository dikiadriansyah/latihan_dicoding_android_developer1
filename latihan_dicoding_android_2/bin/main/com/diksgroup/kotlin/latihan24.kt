package com.diksgroup.kotlin

fun main(){
//    Collections Operations

//    Filter dan FileterNot()
//    untuk mem-filter atau menyaring suatu data dalam sebuah collection.
//    val bilangan = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
//    val bilanganGenap = bilangan.filter{
//        it % 2 == 0
//    }
//    print(bilanganGenap)
    /*
    Output:
    [2, 4, 6, 8, 10, 12]


//    menggunakan filter() untuk menyaring bilangan yg habis dibagi 2 atau biasa disebut bilangan genap.
------------------------------------------------------
     */
//    memfilter list berdasar hasil yg tidak sesuai dengan kondisi yg diberikan menggunakan fungsi filterNot().
//val bilangan = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
//    val bukanBilanganGenap=bilangan.filterNot{
//        it % 2 == 0
//    }
//    print(bukanBilanganGenap)
        /*
        output:
        [1,3,5,7,9,11]
         */
//    ---------------------------------------
//    map()
//    fungsi ini membuat collection baru sesuai perubahan yg akan kita lakukan dari collection sebelumnya.
//    val bilangan = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
//val perkalianLima = bilangan.map{
//    it * 5
//}
//    println(perkalianLima)
//    output:
    /*
    [5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60]
     */
//    it pada kode diatas merepresentasikan masing-masing item pada bilangan.
//-------------------------------------------
//    count()
//    untuk menghitung jumlah item yg ada didalam collection.
//    menampilkan jumlah item yg ada di dalamnya
//    val bilangan = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
//print(bilangan.count())
    /*
    output:
    12
     */

//    fungsi count() bisa menambahkan sebuah parameter berupa lambda yg berisi sebuah kondisi.
//    menampilkan jumlah item pada bilangan yg merupakan kelipatan dari 2.
//    val bilangan = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
//print(bilangan.count{
//    it % 2 == 0
//})
//    output:
//    6

//    menampilkan 6 sebagai jumlah item yg merupakan kelipatan 6 yaitu: 2,4,6,8,10,12
//    ---------------------------------
// find(), firstOrNull() & lastOrNull()

//    find() untuk mencari item pertama yg sesuai dengan kondisi yg kita tentukan
//    val bilangan = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
//    val bilanganGanjilPertama = bilangan.find{
//        it % 2 == 1
//    }
//    val bilanganPertamaAtauNull = bilangan.firstOrNull{
//        it % 2 == 3
//    }
//    println(bilanganGanjilPertama)
//    output: 1

//    println(bilanganPertamaAtauNull)
//    output:
//    null

//    fungsi firstOrNull() adalah jika di dalam collection tidak ditemukan data yg sesuai, maka fungsi mengembalikan
//    nilai null.
//    Tidak seperti fungsi filter() atau map() yang akan melakukan iterasi terhadap seluruh item, fungsi find() dan
//    firstOrNull() ini akan langsung mengembalikan nilai ketika kondisi terpenuhi. Kemudian jika Anda ingin mencari
//    item terakhir, gunakan fungsi lastOrNull().
//    ------------------------------------------------
// first() & last()
//    untuk menyaring item pertama atau terakhir dari sebuah collection.
//    Kita juga bisa menambahkan sebuah kondisi dengan parameter lambda. Namun perlu diperhatikan jika kita menambahkan
//    kondisi padahal kondisi tersebut tidak terpenuhi, apa hasilnya? Exception!
//val bilangan = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
//    val lebihDari12 = bilangan.first{
//        it > 12
//    }
//    print(lebihDari12)
/*
output:
Exception in thread "main" java.util.NoSuchElementException: Collection contains no element matching the predicate.
 */
//------------------------------------------
//    sum()
//    digunakan untuk collection yang bertipe angka. fungsi akan menjumlahkan setiap data yg ada pada collection.
//    val bilangan = listOf(1,2,3,4,5,6,7,8,9,10,11,12)
//val total = bilangan.sum()
//    print(total)
//    output:
//    78
//    ----------------------------------------
//    sorted()
//    untuk mengurutkan item yg ada didalam collection dan mengurutkan data secara ascending
    val apelChar = listOf('a','p','e','l')
    val urutAsc=apelChar.sorted()
//    println(urutAsc)
//    output:
//    [a,e,l,p]

//    untuk sorting secara descending dapat menggunakan fungsi sortedDescending()
    val urutDesc = apelChar.sortedDescending()
    println(urutDesc)
//output:
//    [p,l,e,a]
}