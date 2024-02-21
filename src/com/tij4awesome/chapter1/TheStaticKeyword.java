package com.tij4awesome.chapter1;

public class TheStaticKeyword {
    // jika ada kata kunci "static"
    // ini berarti bahwa field atau method tidak terikat pada instance object,
    // jadi meskipun anda belum pernah membuat object class tersebut dengan kata kucni "new"
    // anda dapat memanggil method static atau mengakses field static
    static int i = 47; // field static

    // Dengan field atau method non-static biasa, anda harus membuat object
    // dan menggunakan object tersebut untuk mengakses field atau method tersebut
    // karena field dan method non-static harus mengetahui object tertentu yang sedang mereka kerjakan
    int i2 = 50;

    @Override
    public String toString() {
        return "TheStaticKeyword{" +
                "i2=" + i2 +
                '}';
    }

    public static void main(String[] args) {
        TheStaticKeyword nonStatic = new TheStaticKeyword();
        // pada titik ini, st1.i dan st2.i memiliki nilai yang sama yaitu 50, karena keduanya merujuk pada bagian memori yang sama
        TheStaticKeyword st1 = new TheStaticKeyword();
        TheStaticKeyword st2 = new TheStaticKeyword();
        nonStatic.i2 += 50; // 100
        nonStatic.i2++; // 101
        System.out.println(nonStatic.i2); // 101

        // method static tidak dapat mengakses anggota atau method non-static secara
        // langsung hanya dengan memanggil anggota lain tersebut tanpa merujuk ke object bernama
        // (karena anggota dan method non-static harus terikat pada object tertentu)
        //theStaticKeyword.i; // error karena
        System.out.println(TheStaticKeyword.i);

        System.out.println(st1);
        System.out.println(st2);
        // method static tidak memerlukan pembuatan object apapun sebelum digunakan
        TheStaticKeyword.i = 200;
        System.out.println(TheStaticKeyword.i);

        // merujuk ke variable static secara langsung melalui nama class nya, sesuatu yang tidak dapat dilakukan dengan anggota non-static
        // operator ++ menambahkan satu ke variable
        TheStaticKeyword.i++;
        System.out.println(TheStaticKeyword.i);
    }
}
