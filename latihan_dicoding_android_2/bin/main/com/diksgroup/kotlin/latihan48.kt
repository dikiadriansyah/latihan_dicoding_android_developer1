package com.diksgroup.kotlin
// Primary Constructor

/*
Kita dapat langsung menginisialisasi pada properti tertentu atau menginisialisasinya melalui constructor (konstruktor).
Konstruktor merupakan fungsi spesial yang digunakan untuk menginisialisasi properti yang terdapat pada kelas tersebut.

pada kotlin terdapat 2 tipe konstruktor:
1. Primary Constructor (PC)
2. Secondary Constructor (SC)
 */

// Primary COnstructor
/*
jika membuat suatu objek dari sebuah class dan class tersebut memiliki primary constructor di dalam, maka kita harus
mengirim nilai sesuai properti yg dibutuhkan.
penulisan primary constructor seperti parameter pada fungsi. properti dituliskan pada header classs diawali dengan
var atau val.
 */
//class Gadget(val merk: String, val berat: Double, val harga: Int, val cekBateraiTanam: Boolean)
// kode diatas tidak hanya membuat sebuah kelas, namun sekaligus menambahkan sebuah primary constructor pada kelas tersebut

//fun main(){
// membuat object dari class

//    val gadgetBaru = Gadget("HP 14 inch Laptop 14s-fq0564AU", 1.47, 5800000, true)
//print("Merek: ${gadgetBaru.merk}, Berat: ${gadgetBaru.berat}, Harga: ${gadgetBaru.harga}, dan " +
//        "apakah baterai tanam? ${gadgetBaru.cekBateraiTanam}")

    /*
    output:
Merek: HP 14 inch Laptop 14s-fq0564AU, Berat: 1.47, Harga: 5800000, dan apakah baterai tanam? true

kode diatas kelas Gadget memiliki primary constructor, maka saat membuat objek prlu mengirimkan beberapa nilai yaitu
merk, berat, harga, dan cekBateraiTanam
     */

//}

//    ----------------------------------------------

/*
Primary constructor juga dapat memiliki nilai default, dengan begitu jika kita tidak menetapkan nilai untuk parameter
tersebut maka properti tersebut akan memiliki nilai default.
Contohnya, kita bisa memberikan nilai default terhadap properti harga. Sehingga ketika pembuatan objek, pengiriman
nilai harga pada primary constructor bersifat opsional.

Untuk membuat nilai default pada sebuah primary constructor, kita perlu menginisialisasi nilai pada saat kita menuliskan
properti pada kelas.
 */

//class HewanDua(var nama: String, var berat: Double, var usia: Int = 4, var cekMamalia: Boolean = true)

/*
kode diatas menunjukkan bahwa kita membuat nilai default pada properti usia yg bernilai 4, dan cekMamalia yg bernilai
true. sehingga pada pembuatan object Hewan, kita bisa mengirimkan nilai nama dan berat pada Primary Constructor.
 */

//fun main(){
//val hewan = HewanDua("DombaGarut",14.9)
//println("Nama Hewan: ${hewan.nama}, Berat: ${hewan.berat}, Umur: ${hewan.usia}, dan apakah mamalia? ${hewan.cekMamalia}")
    /*
    output:
Nama Hewan: DombaGarut, Berat: 14.9, Umur: 4, dan apakah mamalia? true


Hasil dari kode tersebut memperlihatkan bahwa properti age dan isMammal memiliki nilai default. Sekali lagi, properti
tersebut bersifat opsional, dengan begitu kita tetap dapat mengirimkan nilai pada properti walaupun telah memiliki
nilai default.

     */
//    ------------------
    /*
    secara eksplisit memilih properti yg ingin kita berikan nilai dengan menambahkan  nama properti dan tanda = sebelum
    mengisikan nilai properti.
     */

//    val hewan =HewanDua("ikanPesutCuy",10.2,cekMamalia = false)
//println("nama hewan: ${hewan.nama}, berat: ${hewan.berat}, berusia: ${hewan.usia}, dan apakah mamalia? ${hewan.cekMamalia}")
    /*
    output:
nama hewan: ikanPesutCuy, berat: 10.2, berusia: 4, dan apakah mamalia? false
     */


//}

//----------------------------
// Init Block

/*
kotlin menyediakan blok init untuk menuliskan properti di dalam body class ketika menggunakan primary constructor.
memiliki kode banyak di dalam body class bukanlah hal yg baik. kotlin bertujuan menuliskan kode seminimal. tapi
blok init memiliki beberapa fungsi selain menginisialisasi properti kelas. satu fungsi adalah untuk membantu memvalidasi
sebuah nilai properti sebelum di inisialisasi.

pada class Hewan kita dapat melakukan verifikasi bahwa berat dan umur hewan tidak boleh bernilai kurang dari 0.
menggunakan keyword init kemudian inisialisasikan semua properti di dalam blok tersebut dengan parameter kelas:
 */

//class HewanDua(jNama: String, jBerat: Double, jUsia: Int, jCekMamalia: Boolean){
//    val nama: String
//    val berat: Double
//    val usia: Int
//    val cekMamalia: Boolean
//
//    init {
//        nama = jNama
//        berat = if(jBerat < 0) 0.1 else jBerat
//        usia = if(jUsia < 0)0 else jUsia
//        cekMamalia=jCekMamalia
//
//    }
//}
/*
primary constructor dan init harus saling terhubung. fungsi init dijalankan ketika suatu objek dibuat dengan menggunakan
primary constructor
 */

fun main(){
//val hewan= HewanDua("MiawwMpus",3.20,2,true)
//print("nama hewan: ${hewan.nama}, berat: ${hewan.berat}, usia: ${hewan.usia}, dan apakah mamalia? ${hewan.cekMamalia}")
/*
output:
nama hewan: MiawwMpus, berat: 3.2, usia: 2, dan apakah mamalia? true

Perhatikan juga penamaan antara properti pada body class dan parameter pada head class penamaan antara keduanya harus
berbeda agar tidak terjadi ambiguitas.
 */


}
//-----------------------------------
/*
jika ingin penamaan keduanya sama? dapat menggunakan keyword this dalam menginisialisasi properti tersebut dalam
blok init
 */

//class HewanDua(nama: String, berat: Double, usia: Int, cekMamalia: Boolean){
//    val nama: String
//    val berat: Double
//    val usia: Int
//    val cekMamalia: Boolean
//
//    init {
//        this.nama = nama
//        this.berat = if(berat < 0) 0.1 else berat
//        this.usia = if(usia < 0) 0 else usia
//        this.cekMamalia = cekMamalia
//    keyword this dalam menginisialisasi properti dalam blok init
//    }
//}
/*
Keyword this merujuk kepada suatu class dimana jika menggunakannya diikuti dengan nama properti maka kita menunjuk pada
properti yg terdapat pada kelas.
//dengan begitu tidak ambiguitas walaupun menggunakan penamaan yg sama antara properti dan parameter Primary Constructor
 */