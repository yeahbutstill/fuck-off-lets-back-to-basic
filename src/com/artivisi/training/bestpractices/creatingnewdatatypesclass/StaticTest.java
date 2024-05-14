package com.artivisi.training.bestpractices.creatingnewdatatypesclass;

public class StaticTest {
    /*
    ketika anda mengatakan sesuatu itu static, itu berarti bahwa field atau method
    tertentu tidak terikat pada instance objek dari class itu.

    jadi meskipun anda belum pernah membuat object dari class tersebut, anda dapat
    memanggil method static atau mengakses field static.

    Dengan field dan method non-static biasa anda harus membuat object dan menggunakan
    object tersebut untuk mengakses field atau method tersebut, karena field dan method
    non-static harus mengetahui object tertentu yang mereka kerjakan.

    Beberapa bahasa OOP menggunakan istilah data class dan method class, artinya
    data dan method hanya ada untuk class secara keseluruhan, dan bukan untuk object
    tertentu di class.

    untuk membuat suatu field atau method menjadi static, anda cukup menempatkan kata kunci static
    sebelum definisi. Misalnya berikut ini menghasilkan field static dan menginisialisasinya:
     */
    static int i = 47;

    public static void main(String[] args) {
        /*
         Sekarang meskipun anda membuat 2 object dari class ini yaitu StaticTest
         hanya akan ada 1 penyimpanan untuk StaticTest.i kedua object akan berbagi i yang sama.

         Tentu saja, karena method static tidak memerlukan pembuatan object apapun sebelum digunakan
         method static tidak dapat mengakses field atau method non-static secara langsung
         hanya dengan memanggil field lain tersebut tanpa merujuk ke object bernama
         (karena field dan method non-static harus terikat pada object)
         */
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        // pada titik ini, st1.i dan st2.i memiliki nilai i yang sama yaitu 47 karena merujuk pada bagian memori yang sama
        System.out.println(st1.i);
        System.out.println(st2.i);
        System.out.println("======================");

        /*
        Ada 2 cara untuk merujuk ke variable static. Seperti yang ditunjukan oleh contoh sebelumnya.
        Anda dapat menamainya melalui suatu object.
        Anda juga dapat merujuknya secara langsung melalu nama class nya, sesuatu yang tidak dapat
        anda lakukan dengan field non-static.
         */
        StaticTest.i++;
        System.out.println(st1.i);
        System.out.println(st2.i);
    }
}
