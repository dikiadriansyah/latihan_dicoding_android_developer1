package com.diksgroup.kotlin

//class User(val nama: String, val umur: Int)
//Kode di atas merupakan sebuah kelas yang digunakan untuk menampung sebuah data. Kelas tersebut memiliki
// sebuah konstruktor yang berisi beberapa properti yang bisa kita akses, baik itu create maupun read.

data class DataUser(val nama: String, val umur: Int)
// keyword data yang menandakan bahwa kelas tersebut merupakan sebuah data class.

//fun main(){
//val user = User("Dhiki Adriansyah", 23)
//    bungkus objek User() dengan variabel bernama user
//
//val dataUser = DataUser("Firmansyah Saputra", 26)
//
//    println(user)
//    println(dataUser)

//    output:
//    com.diksgroup.kotlin.User@4a574795
//    DataUser(nama=Firmansyah Saputra, umur=26)
//}

    /*
    objek user menghasilkan teks com.diksgroup.kotlin.User@4a574795 dimana com.diksgroup.kotlin merupakan nama
    package tempat kelas User. User adalah nama dari kelas itu sendiri, dan @4a574795 adalah memory address dari kelas.
    sedangkan objek dataUser menghasilkan teks DataUser(nama=firmansyah, umur=26), yaitu nama kelas disertai dengan
    semua properti di dalamnya dan value dari properti.

    mengetahui semua informasi dari dataUser hanya dengan melihat value dari properti yg ada.
    karena data class akan secara otomatis menghasilkan fungsi toString() didalamnya. tanpa data class, kita perlu
membuat fungsi toString() secara manual untuk mendapatkan informasi yg diberikan oleh objek dataUser.

     */

//---------------------------------
//menambahkan fungsi toString()
//class User(val nama: String, val umur: Int){
//    override fun toString(): String{
//        return "User(nama= $nama, umur= $umur)"
//    }
//}
// output:
/*
User(nama= Dhiki Adriansyah, umur = 23)
DataUser(nama=Firmansyah Saputra, umur=26)

 */
// objek User akan menghasilkan teks yg sama dengan objek dataUser.
//----------------------------------
// kelebihan data class adalah memiliki fungsi equals() secara otomatis. maka jika ingin melakukan komparasi konten
// antara 2 buah objek, lakukan dengan mudah

//fun main(){
//    val dataUser = DataUser("Arif Cahyono", 19)
//    val dataUser2 = DataUser("Arif Cahyono", 19)
//    val dataUser3 = DataUser("Nia Agustiana", 32)
//
//    println(dataUser.equals(dataUser2))
//    println(dataUser.equals(dataUser3))
    /*
    output:
    true
    false

    console memberi tahu apakah kedua objek tersebut sama atau tidak ketika menjalan fungsi main()
    -----------------------------------------
lain hal jika melakukan komparasi 2 buah objek yg bukan dari data class. kita tidak bisa mendapatkan hasil yg akurat
 karena console selalu menghasilkan nilai false
     */

//val user = User("Nia Agustina", 19)
//val user2 = User("Nia Agustina", 19)
//val user3 = User("Dhiki Adriansyah", 22)
//
//    println(user.equals(user2))
//    println(user.equals(user3))
/*
* output:
* false
* false
*
*
* karena dia tidak membandingkan konten, melainkan lokasi object(referensi) pada memory
*
* */

//}

//jika menginginkan hasil yg akurat seperti data class, maka perlu membuat fungsi equals() secara manual
class User(val nama: String, val umur: Int){
    override  fun equals(lain: Any?): Boolean{
        if(this === lain) return true
        if(javaClass != lain?.javaClass) return false

        lain as User

        if(nama != lain.nama) return false
        if(umur != lain.umur)return false

        return true
    }

    override fun hashCode(): Int{
        var hasil = nama.hashCode()
        hasil = 31 * hasil + umur
        return hasil
    }


}

//fun main(){
//    val user = User("Nia Agustina", 19)
//    val user2 = User("Nia Agustina", 19)
//    val user3 = User("Dhiki Adriansyah", 22)
//
//    println(user.equals(user2))
//    println(user.equals(user3))

//    output
    /*
    true
false

// anda perlu menuliskan beberapa boilerplate code diatas untuk mendapatkan hasil yg sesuai.
// belum lagi ketika anda menambahkan fungsi equals(), anda perlu juga menambahkan fungsi hashCode()

     */
//}
//-----------------------------------
// Menyalin dan Memodifikasi Data Class

// Data Class untuk menyalin sebuah objek dengan memanfaatkan fungsi copy().

fun main(){
    val dataUser = DataUser("Farah Agustina", 23)
    val dataUser2 = DataUser("Farah Agustina", 23)
    val dataUser3 = DataUser("Lia Nurmy", 28)
    val dataUser4 = dataUser.copy()

    println(dataUser4)
/*
output:
DataUser(nama=Farah Agustina, umur=23)

// harusnya nilai dari dataUser4 akan sama dengan nilai dari dataUser.
//-------------------------
fungsi copy() bisa memodifikasi objek tersebut dengan nilai yg baru. contoh mengubah nilai dari properti age menjadi 18

 */
    val modifUser = dataUser.copy(umur=34)
    println(modifUser)
/*
output:
DataUser(nama=Farah Agustina, umur=34)
 */

    /*
    Tanpa data class, untuk melakukan tugas seperti ini memerlukan sebuah instance baru untuk mengubah nilai dari objek.
    dengan demikian harus memodifikasi properti yg kita maksud. tugas ini berulang dan membuat kode yg kita tulis jauh
    dari paradigma clean code

     */

}


