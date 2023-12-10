package com.diksgroup.kotlin
// Exception Handling

// dengan menggunakan try-catch, try-catch-finally, dan multiple catch

// try-catch
//Kode yang dapat membangkitkan suatu exception disimpan dalam blok try, dan jika exception tersebut terjadi,
// maka blok catch akan terpanggil.

/*
dengan menuliskan dalam blok try kode menjadi terproteksi dari exception. jika terjadi exception maka program tidak
akan terhenti atau crash, namun akan dilempar menuju blok catch
 */
fun main(){
//val beberapaNilaiNull: String? = null
//    lateinit var beberapaNilaiHarusTidakNull: String
//
//    try{
//        beberapaNilaiHarusTidakNull = beberapaNilaiNull!!
//        println(beberapaNilaiHarusTidakNull)
//    }catch(e: Exception){
//        beberapaNilaiHarusTidakNull = "Nilai String Null"
//        println(beberapaNilaiHarusTidakNull)
//    }

    /*
    output:
    Nilai String Null
    --------------------------
     */

// try-catch-finally
/*
Selain terdapat blok try dan catch, ada juga blok finally. Hanya saja blok ini bersifat opsional. finally akan
dieksekusi setelah program keluar dari blok try ataupun catch. Bahkan finally juga tereksekusi ketika terjadi exception yang tidak terduga. Exception tidak terduga terjadi ketika kita menggunakan NullPointerException pada catch namun exception yang terjadi adalah NumberFormatException.
 */
//    val beberapaNilaiNull: String? = null
//    lateinit var beberapaNilaiHarusTidakNull: String
//
//    try{
//        beberapaNilaiHarusTidakNull = beberapaNilaiNull!!
//        println(beberapaNilaiHarusTidakNull)
//    }catch(e: Exception){
//        beberapaNilaiHarusTidakNull = "Nilai String Null"
//    }finally{
//        println(beberapaNilaiHarusTidakNull)
//
//    }
    /*
   output:
   Nilai String Null


   Dengan menerapkan finally, fungsi println() cukup dituliskan pada blok finally.
   --------------------------
    */
// Multiple Catch(MC)
//    kode sebelumnya menggunakan exception untuk menangani semua tipe exception yang terjadi. Baik itu ketika terjadi
//    NullPointerException atau NumberFormatException. Sebenarnya pada catch kita dapat secara spesifik memilih tipe
//    exception apa yang ingin ditangani. Multiple catch memungkinkan untuk penanganan exception dapat ditangani lebih
//    dari satu tipe exception. Hal ini sangat berguna ketika kita ingin menangani setiap tipe exception dengan
//    perlakuan yang berbeda

//    try{
//        // Block try, menyimpan kode yang membangkitkan exception
//    } catch (e: NullPointerException) {
//        // Block catch akan terpanggil ketika terjadi NullPointerException.
//    } catch (e: NumberFormatException) {
//        // Block catch akan terpanggil ketika terjadi NumberFormatException.
//    } catch (e: Exception) {
//        // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
//    }
//    finally {
//        // Block finally akan terpanggil setelah keluar dari block try atau catch
//    }


    val beberapaNilaiString: String? = null
    var beberapaNilaiInt: Int = 0

//    try{
//        beberapaNilaiInt = beberapaNilaiString!!.toInt()
//
//    }catch (e: NullPointerException){
//        beberapaNilaiInt = 0
//
//    }catch(e: NumberFormatException){
//        beberapaNilaiInt = -1
//
//    }finally{
//        when(beberapaNilaiInt){
//            0 ->println("Catch blok NullPointerException terpanggil")
//            -1 ->println("Catch Blok NumberFormatException terpanggil")
//        else -> println(beberapaNilaiInt)
//        }
//
//    }

    /*
    output:
    Catch blok NullPointerException terpanggil

     */

    /*
karena variabel beberapaNilaiString menetapkan null sebagai nilainya.
berbeda ketika menginisialisasi nilai beberapaNilaiString dengan nilai "12.0" maka exception yg terjadi adalah
NumberFormatException dengan begitu blok catch kedua yang terpanggil dan akan menghasilkan output: Catch
block NumberFormatException terpanggil!

jika kedua exception tidak terjadi dalam arti nilai beberapaNilaiString berhasil diubah dalam bentuk Integer, maka
output yang dihasilkan adalah nilai dari Integernya tersebut. Contohnya, saat nilai beberapaNilaiString diinisialisasi
dengan nilai “12.”
     */

}