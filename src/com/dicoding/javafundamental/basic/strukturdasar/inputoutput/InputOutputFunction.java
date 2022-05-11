package com.dicoding.javafundamental.basic.strukturdasar.inputoutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        // inisialisasi awal ketika akan menggunakan Scanner.
        // Di bagian ini kita mencoba untuk menggunakan perintah mengambil input yang diberikan oleh user.
        // Bila program dijalankan, setiap input yang diberikan akan disimpan oleh Scanner.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");

        // Selanjutnya kita akan mengambil data yang telah dimasukkan melalui Scanner.
        // Dengan memanggil Scanner.nextInt() setiap Input dari keyboard akan diberikan ke value.
        System.out.print("Masukan angka pertama : ");
        int value = scanner.nextInt();

        System.out.print("Masukan angka kedua : ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah : " + result);
    }
}

/**
 * Adapun catatan yang harus diperhatikan adalah penggunaan fungsi Scanner.
 * Pengambilan data sangat bergantung pada tipe data yang dimasukan.
 * Ini harus sesuai, misalnya untuk string, panggilah Scanner.next().
 * Jika data yang diinputkan Integer, panggilah Scanner.nextInt().
 * Jika input tidak sesuai, program akan menemui eror.
 */
