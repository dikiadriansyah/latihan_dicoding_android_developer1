package com.diksgroup.kotlin

fun main(){
//    Map

    /*
    map adalah sebuah collection yg dapat menyimpan data dengan format key-value.
     */

val negara = mapOf(
    "Jakarta" to "Indonesia",
    "london" to "England",
    "New Delhi" to "India",
    "Tokyo" to "Jepang"

)
//    println(negara)
//    output:
//    {Jakarta=Indonesia, london=England, New Delhi=India, Tokyo=Jepang}

//    String sebelah kiri dari keyword to adalah key, dan sebelah kanan adalah value
//    -----------------------
//println(negara["New Delhi"])
//    output:
//    india

//     atau bisa menggunakan fungsi getValue()
//    println(negara.getValue("Tokyo"))
//    output:
// Tokyo

//    hasil sama aja, namun perbedaan saat menggunakan simbol [] atau indexeing, console menampilkan hasil null saat key yg dicari tidak ada dalam Map.
//    sedangkan menggunakan getValue() konsol menampilkan hasil Exception
//    ---------------------------------
// menampilkan key di dalam Map menggunakan fungsi keys(). fungsi ini mengembalikan nilai berupa Set karena key pada Map
// harus unik

//    val negaraKunci = negara.keys
//    print(negaraKunci)
//    output:
//    [Jakarta, london, New Delhi, Tokyo]

//    -----------------------------------------
//    untuk mengetahui nilai yang ada dalam Map menggunakan fungsi values(). fungsi ini mengembalikan collection sebagai
//    tipe datanya
//    val negaraNilai = negara.values
//    print(negaraNilai)
    /*
    output:
    [Indonesia, England, India, Jepang]

     */
//    -------------------------------------------------
//    informasi tambahan:
//    untuk menambahkan key-value ke dalam map, perlu memastikan bahwa map yg digunakan adalah mutable. mari ubah map
//    negara yg sudah buat sebelumnya menjadi mutable
val negaraMutable = negara.toMutableMap()
//    print(negaraMutable)
/*
output:
{Jakarta=Indonesia, london=England, New Delhi=India, Tokyo=Jepang}
 */
//    ------------------------------------
//    menambahkan key-value baru menggunakan fungsi put()
    negaraMutable.put("Beijing", "China")
    negaraMutable.put("Bangkok", "Thailand")
    print(negaraMutable)
/*
output:
{Jakarta=Indonesia, london=England, New Delhi=India, Tokyo=Jepang, Beijing=China, Bangkok=Thailand}

menggunakan mutable collection tidak disarankan.  Apabila terdapat sebuah mutable collection yang diubah oleh lebih dari
 1 proses, hasil nya akan sulit untuk diprediksi.
 sebaiknya gunakan immutable sebisa mungkin, jika memang dibutuhkan untuk diubah, baru gunakan mutable.
 */
}