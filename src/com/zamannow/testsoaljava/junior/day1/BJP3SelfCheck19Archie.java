package com.zamannow.testsoaljava.junior.day1;

/**
 * (CATATAN TENTANG SPASI: Banyak siswa yang gagal dalam soal ini karena tidak memahami cara kerja karakter t,
 * menyebabkan mereka memiliki jumlah spasi yang salah.
 * Sebuah tab menyisipkan beberapa spasi hingga jumlah total karakter pada baris saat ini
 * sejauh ini adalah kelipatan dari 8. Jadi misalnya pada string "hi\thello\tgoodbye\tbeautiful\thi",
 * t pertama menjadi 6 spasi (karena 'hi' terdiri dari 2 karakter, jadi dibutuhkan 6 karakter lagi
 * untuk mendapatkan 8), maka t kedua adalah 3 spasi (karena 'hello' lebarnya 5 karakter, sehingga
 * dibutuhkan 3 karakter lagi untuk mendapatkan 8),
 * yang ketiga adalah 1 (karena 'goodbye' adalah 7 karakter),
 * dan t keempat adalah 7 spasi (karena 'beautiful' itu 9 karakter,
 * jadi perlu 7 karakter lagi untuk mendapatkan 16, yang merupakan kelipatan 8 berikutnya).
 */
public class BJP3SelfCheck19Archie {
    public static void main(String[] args) {
        System.out.println("name\tage\theight");
        System.out.println("Archie\t17\t5'9\"");
        System.out.println("Betty\t17\t5'6\"");
        System.out.println("Jughead\t16\t6'");
        System.out.println("hi\thello\tgoodbye\tbeautiful\thi");
    }
}
