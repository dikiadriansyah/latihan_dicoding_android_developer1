package com.diksgroup.kotlin

fun main(){
//    Sequences

//    Sequence merupakan collection yg bisa dikategorikan ke dalam lazy evaluation.
//    jika eager evaluation mengevaluasi seluruh item yg ada pada collection, lazy evaluation akan mengevaluasi item
//    jika benar-benar diperlukan
    val urutan = (1..100).toList()
//    urutan.filter{
//        it % 5 == 0
//    }.map{
//        it * 2
//    }.forEach{
//        println(it)
//    }
/*
output:
10
20
30
40
50
60
70
80
90
100
110
120
130
140
150
160
170
180
190
200
 */
    /*
    data collection sejumlah 100 item, kemudian masing-masing data akan disaring berdasarkan angka yg merupakan
    kelipatan 5 lalu dikalikan 2 dan akhirnya ditampilkan pada konsol
     */

//    dengan eager evaluation atau dikenal horizontal evaluation, list akan menyelesaikan proses filter terhadap
//    100 data baru kemudian melakukan mapping data sampai akhirnya ditampilkan pada konsol
//    -----------------------
//    menerapkan lazy atau vertical evaluation perlu mengubah list menjadi Sequence. caranya dengan memanggil fungsi asSequence()
//urutan.asSequence().filter{
//    it % 5 == 0
//}.map{
//    it * 2
//}.forEach{
//    println(it)
//}
    /*
output:
10
20
30
40
50
60
70
80
90
100
110
120
130
140
150
160
170
180
190
200
 */
//    Dengan sequence, operasi akan dilakukan secara vertikal atau per item, misalnya dimulai angka 1. Karena tidak
//    memenuhi kondisi pada filter maka operasi tidak akan dilanjutkan ke map(). Sampai dengan iterasi ke-5 akan
//    dilakukan mapping, angka 5 akan dikalikan 2 dan ditampilkan pada konsol, setelah itu akan dilanjutkan ke
//    iterasi berikutnya sampai dengan iterasi ke 100.
//    --------------------------------------
//    untuk membuat objek Sequence bisa menggunakan fungsi pada standard library yaitu generateSequence()
val sequenceNumber = generateSequence(1){
    it + 1
}

    /*
    membuat variabel sequenceNumber dengan menggunakan fungsi generateSequence() memiliki 2 parameter.
paramter 1 adalah item pertama di dalam collection. parameter 2 adalah lambda expression berisi perubahan pada
masing-masing item. pada kote tadi, setiap item merupakan item sebelumnya ditambah 1. fungsi generateSequence()
akan membuat collection sequence secara tak terbatas. alhasil perlu menambahkan fungsi take() supaya program
tidak mengalami infinite loop
     */

    sequenceNumber.take(5).forEach{
        print("$it")
    }
//    output: 1 2 3 4 5
}