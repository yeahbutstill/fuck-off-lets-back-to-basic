package com.dicoding.javafundamental.basic.strukturdasar.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args) {
        // Tidak jauh berbeda dengan cara dari penggunaan Scanner,
        // kita harus menginisialisasi BufferedReader yang dibantu oleh InputStreamReader
        // agar dapat membaca Input dari Keyboard.
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program penjumlahan sangat sederhana");

        int value = 0;
        int anotherValue = 0;

        // Namun sedikit berbeda dengan implementasi Scanner,
        // tambahkan ioException sebagai penanganan error input pada BufferedReader.
        // Selain itu untuk menyimpan pada sebuah variabel, data yang diberikan oleh BufferedReader
        // harus kita parsing terlebih dahulu.
        try {
            System.out.print("Masukan angka pertama : ");

            // bila ingin menyimpan data pada int maka nilai yang ada pada bufferedReader.readLine()
            // harus dikonversi dahulu ke dalam bentuk integer menggunakan Integer.parseInt.
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukan angka kedua : ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}
