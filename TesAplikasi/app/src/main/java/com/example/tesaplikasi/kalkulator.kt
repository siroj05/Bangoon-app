package com.example.tesaplikasi

import java.util.Scanner//mengimpor Class Scanner dari paket java.util. untuk membaca tipe data

fun main() {
    //mendeklarasikan variable yang dibutuhkan
    var a: Int
    var b: Int
    var pil: Int
    var r: Int
    val phi = 3.14 //mendeklarasikan variable phi dengan inisialisasi nilai 3.14 dan bersifat immutable
    val masukan = Scanner(System.`in`) //untuk membaca semua tipe data
    println("1. Menghitung\n 2. Menghitung Luas\n")//membuat output pilihan
    pil = masukan.nextInt()//untuk menginput nilai dengan tipe data integer
    if (pil == 1) {//membuat logika if else jika inputan dari variable pil adalah 1 maka statement pertama di jalankan
        println("nilai a = ")//membuat output
        a = masukan.nextInt() //untuk menginput nilai dengan tipe data integer
        println("nilai b = ")//membuat output
        b = masukan.nextInt()//untuk menginput nilai dengan tipe data integer
        println("Masukan perintah operator +, -, * , /,persegi,lingkaran") //membuat output untuk pilihan operator yang akan diinputkan user
        val operator = readLine() // untuk membaca nilai yang bertipe integer
        val hasil = when (operator) { // membuat logika when dan else jika nilainya benar maka statement di jalankan dan melakukan perhitungan, dan hasil perhitungannya disimpan pada variable hasil
            "+" -> a + b //jika nilai yang di inputkan user adalah operator "+" maka akan melakukan penjumlahan
            "-" -> a - b//jika nilai yang di inputkan user adalah operator "-" maka akan melakukan pegurangan
            "*" -> a * b//jika nilai yang di inputkan user adalah operator "*" maka akan melakukan perkalian
            "/" -> a / b//jika nilai yang di inputkan user adalah operator "/" maka akan melakukan pembagian
            else -> "$operator error!!" // kondisi lain jika input diluar kondisi
        }
        println("Hasil = $hasil") // meng outputlan hasil dari perhitungan
    } else if (pil == 2) { //else if kondisi jika user menginputkan nilai dua
        println("Masukan perintah persegi / lingkaran") //output untuk pilihan user
        val operator = readLine() // untuk membaca tipe data string
        val hasil = when (operator) { // membuat logika when dan else jika nilainya benar maka statement di jalankan dan melakukan perhitungan, dan hasil perhitungannya disimpan pada variable hasil
            "persegi" -> { //jika user menginputkan kata "persegi" maka perhitungan dari persegi akan dijalankan
                println("masukan nilai a =")
                a = masukan.nextInt()
                println("masukan nilai a =")
                b = masukan.nextInt()
                a * b
            }
            "lingkaran" -> { //jika user menginputkan kata "lingkaran" maka perhitungan dari lingkaran akan dijalankan
                println("masukan nilai r = ")
                r = masukan.nextInt()
                2 * phi * r}
            else -> "$operator error!!"
        }
        println("Hasil = $hasil") // mengoutputkan hasil dari perhitungan luas
    }
}