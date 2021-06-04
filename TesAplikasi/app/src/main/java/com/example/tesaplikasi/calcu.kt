package com.example.calculatortask1
import java.util.Scanner
fun main(args: Array<String>){
    val mantabBang = Scanner(System.`in`)
    println("Pilihan anda: ")
    println("1. Perkalian")
    println("2. Pembagian")
    println("3. Penjumlahan")
    println("4. Pengurangan")
    println("5. Luas Persegi")
    println("6. Luas lingkaran")
    var pil:Int = mantabBang.nextInt()
    if(pil in 1..4){
        print("input angka pertama: ");
        var angkaPertama:Int = mantabBang.nextInt()
        print("input angka kedua: ");
        var angkaKedua:Int = mantabBang.nextInt()
        when(pil){
            1 -> {var hasil = angkaPertama*angkaKedua; print("Hasil perkalian:$hasil ");}
            2 -> {var hasil = angkaPertama/angkaKedua; print("Hasil pembagian: $hasil ");}
            3 -> {var hasil = angkaPertama+angkaKedua; print("Hasil penjumlahan: $hasil ");}
            4 -> {var hasil = angkaPertama-angkaKedua; print("Hasil pengurangan: $hasil ");}

        }
    }
    else {
        var phi = 3.14;
        print("jari jari lingkaran ");
        var jariJari: Int = mantabBang.nextInt()
        val hasil = 2 * phi * jariJari;
        print("Luas lingkaran: $hasil")
    }
}