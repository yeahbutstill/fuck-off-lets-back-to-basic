package com.artivisi.training.bestpractices.scopeofobjects;

public class TestScopeofobjects {
    public static void main(String[] args) {
        // Objek di Java tidak memiliki masa hidup yang sama
        // dengan objek primitif. Saat Anda membuat objek di Java menggunakan kata kunci new,
        // objek tersebut akan berada di sekitar akhir cakupan (scope).
        // Jadi jika Anda menggunakan:
        String s = new String("a string");
        // akhir scope

        /*
        referensi s menghilang di akhir ruang lingkup (scope).
        Namun, objek String yang ditunjuk s masih menempati di memori.
        Dalam potongan kode ini, tidak ada cara untuk mengakses objek setelah cakupan berakhir,
        karena satu-satunya referensi ke objek tersebut berada di luar cakupan.

        Ternyata karena objek yang dibuat dengan kata kunci new tetap ada selama Anda menginginkannya,
        banyak masalah pemrograman C++ hilang begitu saja di Java.
        Dalam C++ Anda tidak hanya harus memastikan bahwa objek tetap ada selama Anda membutuhkannya,
        Anda juga harus menghancurkan objek tersebut setelah Anda selesai menggunakannya.

        Hal ini menimbulkan pertanyaan yang menarik.
        Jika Java membiarkan objeknya tergeletak begitu saja,
        apa yang mencegah objek tersebut memenuhi memori dan menghentikan program Anda?
        Masalah seperti inilah yang akan terjadi di C++.
        Di sinilah sedikit keajaiban terjadi. Java memiliki pengumpul sampah (garbage collector),
        yang melihat semua objek yang dibuat dengan kata kunci new dan mencari tahu objek mana yang tidak lagi
        direferensikan. Kemudian ia melepaskan memori untuk objek tersebut,
        sehingga memori tersebut dapat digunakan untuk objek baru.
        Ini berarti Anda tidak perlu khawatir untuk mendapatkan kembali memori Anda sendiri.
        Anda cukup membuat objek, dan ketika Anda tidak lagi membutuhkannya,
        objek tersebut akan hilang dengan sendirinya. Hal ini menghilangkan kelas masalah pemrograman tertentu:
        yang disebut “kebocoran memori (memory leak)”, di mana seorang programmer lupa melepaskan memori.
         */
    }
}
