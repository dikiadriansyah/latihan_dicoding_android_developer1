package com.diksgroup.kotlin

import java.awt.Color

//fun main(){
// 5 jenis control flow
//    When Expression
//    Expression & Statement
//    While and Do While
//    Range and For Loop
//    Break and Continue Labels


//    Enumeration
//untuk menyimpan kumpulan objek yang telah didefinisikan menjadi tipe data konstanta
//    Enumeration juga dapat digunakan untuk meminimalisir kesalahan dalam pengetikan nilai sebuah variabel
//    val colorRed = Color.RED
//    val colorGreen = Color.GREEN
//print(colorRed)


//}


//------------
//enum class COlor(val value: Int){
//    RED(0xFF0000),
//    GREEN(0x00FF00)
//}
// Enumeration juga membuat kode yang kita tulis jadi lebih bersih dan mudah dibaca.
//--------------
//Untuk mendefinisikan sebuah kelas Enum, kita bisa menggunakan kata kunci enum dan setiap objek yang berada
// di dalamnya dipisahkan oleh karakter koma (,). Selain itu, objek yang berada di dalam Enum secara implisit bersifat
// static dan final sehingga kita tidak dapat mengubahnya setelah dideklarasikan.

//Objek yang telah didefinisikan menjadi tipe data Enum dapat mengakses attribute atau method di dalam kelas Enum
// itu sendiri. Konsep ini sama halnya seperti Array. Bedanya, Enum berbentuk constant

//enum class Color{
//    RED,
//    GREEN
//}
//output:
//RED


//-------------------------------
//eperti yang dicontohkan di awal, setiap objek yang dideklarasikan merupakan instance dari kelas Enum tersebut.
//enum class Color(val value: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00)
//}
//---------------------------------
//dapat menambahkan perintah yang lebih spesifik dengan menambahkan abstract function dan mendeklarasikan
// anonymous class untuk setiap objek Enum
//enum class Color(val value: Int){
//    RED(0xFF0000){
//        override fun printValue(){
//            println("value of red is $value")
//        }
//    },
//    GREEN(0x00FF00){
//        override fun printValue(){
//            println("value of GREEN is $value")
//        }
//    };
//
//    abstract fun printValue()
//Catatan:
//Konsep tentang abstract dan anonymous class akan dijelaskan pada modul selanjutnya.

//---------------
// Setiap enum class memiliki sebuah synthetic method yang memungkinkan kita mendapatkan daftar objek Enum dan nama
// dari tiap Enum itu sendiri


//fun main2(){
//    val warna: Array<Color> = Color.values()
//    warna.forEach{ color ->
//        print("$color ")
//    }
//}
//
//    enum class Color(val value: Int){
//        RED(0xFF0000),
//GREEN(0x00FF00)
//    }
//ouput:
// RED GREEN
//-------------------
//Sedangkan untuk mendapatkan nama dari objek Enum kita bisa menggunakan fungsi valueOf()
//fun main(){
//    val color: Color = Color.valueOf("RED")
//println("Color is $color")
//    println("Color value is ${color.value.toString(16)}")
//}
//
//enum class Color(val value: Int){
//        RED(0xFF0000),
//GREEN(0x00FF00)
//
//}

//output:
//color is RED
//color value is ff0000

//Khusus pada kasus di atas, kita menambahkan toString(16) untuk menampilkan angka yang berupa HexaDesimal.
//Saat menggunakan fungsi valueOf() , perhatikan argumen yang kita masukkan ke dalam fungsi tersebut. Jika argumen yang
// kita masukan tidak sama dengan salah satu objek enum maka akan terjadi kesalahan IllegalArgumentException.

//IllegalArgumentException adalah sebuah kondisi di mana saat ingin menggunakan sebuah fungsi, kita menyematkan argumen
// yang tidak sesuai ke dalam fungsi tersebut

//cara mendapatkan daftar objek Enum dan nama dari objek Enum menggunakan enumValues() dan enumValueOf()

//fun main(){
//    val colors: Array<Color> = enumValues()
//    colors.forEach{color->
//        println(color)
//    }
//
//    val color: Color = enumValueOf("RED")
//    println("Color is $color")
//
//}
//enum class Color(val value: Int){
//        RED(0xFF0000),
//GREEN(0x00FF00)
//
//}
//output:
//RED
//GREEN
//BLUE
//color is RED
//-----------------

// konsep dari enumeration sama seperti Array.
//selain mendapatkan daftar dan nama dari tiap objek Enum, kita juga bisa mendapatkan posisi tiap objek
// menggunakan properti ordinal

//fun main(){
//    val color: Color = Color.GREEN
//    print("Position GREEN is ${color.ordinal}")
//}
//enum class Color(val value: Int){
//        RED(0xFF0000),
//GREEN(0x00FF00)
//}
//output : Position GREEN is 1

//-------------------------------
//Di atas telah disebutkan bahwa setiap objek merupakan instance dari enum class yang kita definisikan. Lantas
// bagaimana cara kita mengecek instance dari Enum itu sendiri? Nah, untuk mengeceknya, gunakan When Expression

//fun main() {
//    val color: Color = Color.GREEN
//
//    when(color){
//        Color.RED -> print("Color is Red")
//        Color.BLUE -> print("Color is Blue")
//        Color.GREEN -> print("Color is Green")
//    }
//}
//
//enum class Color(val value: Int) {
//    RED(0xFF0000),
//    GREEN(0x00FF00),
//    BLUE(0x0000FF)
//}

//Ketika menggunakan when untuk mengecek instance dari Enum, lebih baik masukkan setiap objek Enum yang kita definisikan.
//Jika kita melewatkan salah satu objek,  peringatan berikut akan muncul: ‘when' expression on enum is recommended to be exhaustive