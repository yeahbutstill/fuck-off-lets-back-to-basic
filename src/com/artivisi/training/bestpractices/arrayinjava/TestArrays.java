package com.artivisi.training.bestpractices.arrayinjava;

import java.util.Arrays;

// Array di Java dijamin akan diinisialisasi dan tidak dapat diakses di luar jangkauannya
// Pengecekan jangkauan harus dibayar dengan memiliki sejumlah kecil overhead memori
// pada setiap array serta memverifikasi indeks pada saat run time,
// namun asumsinya adalah bahwa keamanan dan peningkatan produktivitas
// sepadan dengan biaya yang dikeluarkan (dan Java terkadang dapat mengoptimalkan operasi ini ).
public class TestArrays {
    public static void main(String[] args) {
        // Saat Anda membuat array objek,
        // Anda benar-benar membuat array referensi,
        // dan masing-masing referensi tersebut secara otomatis diinisialisasi
        // ke nilai khusus dengan kata kuncinya sendiri: null. Saat Java melihat null,
        // Java mengenali bahwa referensi yang dimaksud tidak menunjuk ke suatu objek.
        String[] arrayString = new String[]{"Depok", "Citayem", "Bogor", "Jakarta", "Bandung"};
        // Anda harus menetapkan objek ke setiap referensi sebelum menggunakannya,
        // dan jika Anda mencoba menggunakan referensi yang masih null,
        // masalahnya akan dilaporkan pada waktu proses.
        // Dengan demikian, kesalahan array yang khas dapat dicegah di Java.
        String[] testNull = null;

        System.out.println(arrayString.length);
        System.out.println(Arrays.toString(Arrays.stream(arrayString).toArray()));
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(testNull);

        // Anda juga dapat membuat array primitif.
        // Sekali lagi, kompiler menjamin inisialisasi karena ia
        // menghilangkan memori untuk array tersebut.
        int[] no = {1, 2, 1,3 ,4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(no));
    }
}
