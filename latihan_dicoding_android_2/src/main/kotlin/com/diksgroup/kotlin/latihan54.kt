package com.diksgroup.kotlin
// Intefaces
// suatu kelas agar dapat memiliki sifat tersebut
//Interface sangat mirip dengan abstract class, namun tanpa sebuah properti deklarasi dan fungsi yang dideklarasikan
// tanpa isi.
//tujuan interface: untuk diimplementasikan oleh sebuah class. class  yang mengimplementasikan sebuah interface
// diharuskan melakukan override seluruh properti dan fungsi sekaligus mendefinisikan isi fungsi yang terdapat pada interfaces-nya.

/*
Pada umumnya penamaan sebuah interface dituliskan dengan awalan huruf I kapital. Hal ini tidak diharuskan secara sintaks
tapi ini merupakan penerapan terbaik dalam penamaan sebuah interface. Tujuannya agar dapat mudah membedakannya
dengan class.
 */

//interface ITerbang{
//    fun terbang()
//}

// penerapan interface sama seperti melakukan extends pada sebuah super atau parent class.
//class Burung: ITerbang{
//
//}
// Kita akan mendapati eror ketika selesai menuliskan kode tersebut.
// Pesan eror tersebut mengatakan “class Burung is not abstract and does not implement abstract member”.
/*
Maksud dari eror tersebut adalah kita harus  mengimplementasi sebuah abstract member yang pada kasus ini adalah
sebuah fungsi abstract yang terdapat pada ITerbang.
untuk menghilangkan eror tersebut, kita harus melakukan override fungsi yang terdapat pada ITerbang.
 */

//class Burung:ITerbang{
//    override fun terbang(){
//        println("Saya terbang tanpa sayap")
//    }
//}

/*
Untuk menambahkan sebuah properti pada interface, kita cukup menuliskannya seperti pada kelas namun tanpa melakukan
inisialisasi nilai
 */
//interface ITerbang{
//    fun terbang()
//    val jmlhSayap: Int
//}

/*
sama seperti fungsi, harus melakukan override properti.  Overriding properti bisa dilakukan pada sebuah konstruktor kelas
 */

//class Burung(override val jmlhSayap: Int):ITerbang{
//    override  fun terbang(){
//        if(jmlhSayap > 0){
//            println("Terbang dengan $jmlhSayap sayap")
//        }else{
//            println("saya terbang tanpa sayap")
//
//        }
//    }
//}
//
//fun main(){
//val burung=Burung(3)
//burung.terbang()
    /*
    output:
    Terbang dengan 3 sayap
     */
//}

//----------------------------------
// ANonymous Class (AC)
//class yang tak memiliki nama. Alih-alih mendefinisikan class menggunakan keyword class, Anda bisa langsung
// mendefinisikan isi dari sebuah class dengan menggunakan keyword object: .

// contoh tanpa Anonymous Class:
//interface ITerbang{
//    fun terbang()
//    val jmlhSayap: Int
//}
//
//class Burung(override val jmlhSayap: Int): ITerbang{
//override fun terbang(){
//    if(jmlhSayap > 0){
//        println("terbang dengan $jmlhSayap sayap")
//    }else{
//        println("saya terbang tanpa sayap")
//    }
//}
//}
//
//fun terbangDenganSayap(burung: ITerbang){
//    burung.terbang()
//}
//
//fun main(){
//    terbangDenganSayap(Burung(2))
    /*
    output:
    terbang dengan 2 sayap
     */
//}

//---------------------------------
//contoh Anonymous Class(AC)
interface  ITerbang{
    fun terbang()
    val jmlhSayap: Int
}

// membuat fungsi bernama 'terbangDenganSayap' yg berisi parameter extend ITerbang
fun terbangDenganSayap(burung: ITerbang){
    burung.terbang()
}

fun main(){
    // memanggil fungsi bernama 'terbangDenganSayap' dengan nilai keyword object
    terbangDenganSayap(object: ITerbang{
        override fun terbang(){
            if(jmlhSayap > 0){
                println("Terbang dengan $jmlhSayap sayap")
            }else{
                println("Saya Terbang tanpa sayap")
            }
        }

        override  val jmlhSayap: Int get() = 6

    })
    /*
    output:
 Terbang dengan 6 sayap
     */

    /*
perhatikan bahwa tidak membuat class Burung, tapi langsung mendefinisikan isi dari kelas tersebut dengan menggunakan
keyword object. Jika dilihat, memang tidak ada nama yang diberikan untuk object yang dibuat ini, inilah yang
disebut Anonymous Class.

Anda akan sering menemui konsep seperti ketika memasuki dunia pemrograman Android untuk melakukan perintah tertentu
ketika ada aksi, seperti ketika tombol ditekan. Proses seperti ini juga sering disebut dengan listener atau callback.

myButton.setOnClickListener(object : OnClickListener{
    override fun onClick(p0: View?) {
        //melakukan perintah tertentu
    }
})

     */

}