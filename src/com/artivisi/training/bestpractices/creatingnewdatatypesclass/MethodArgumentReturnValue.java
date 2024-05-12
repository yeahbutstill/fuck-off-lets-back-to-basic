package com.artivisi.training.bestpractices.creatingnewdatatypesclass;

import java.util.Objects;

public class MethodArgumentReturnValue {
    private String name;
    private String age;

    public MethodArgumentReturnValue() {
    }

    public MethodArgumentReturnValue(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


//    Method di Java, menentukan pesan yang dapat diterima suatu object.
//    Bagian mendasar dari suatu method adalah return type, method name, argument list
//    dan method body

//    ReturnType methodName(/* Argument list */) {
//        /* Method body */
//    }
    public void setName(String name) {
        this.name = name;
    }

    // method di Java hanya dapat dibuat sebagai bagian dari suatu class. Suatu method hanya dapat
    // dipanggil untuk suatu object dan object tersebut harus dapat melakukan pemanggilan method tersebut.
    // Jika anda mencoba memanggil method yang salah untuk suatu object, anda akan mendapatkan pesan kesalahan
    // pada waktu kompilasi.
    public String /*return type menjelaskan nilai yang dihasilkan method setelah anda memanggilnya*/ getAge() {
        return age;
    }

    // nama method dan daftar argument (yang disebut tanda tangan method) secara unik mengidentifikasi method tersebut
    public void setAge(String age /*daftar argument memberikan tipe dan nama untuk informasi yang ingin anda sampaikan ke dalam method*/) {
        this.age = age;
    }

    // method static adalah method yang dapat dipanggil untuk class, tanpa object.
    public static void wellcome() {
        System.out.println("Selamat datang ces...");
    }

    public int satuKaliSatu() {
        return 1;
    }

    // Metode ini memberitahu Anda berapa banyak byte
    // yang diperlukan untuk menyimpan informasi dalam String tertentu.
    // (Ukuran setiap karakter (char) dalam sebuah String adalah 16 bit,
    // atau dua byte, untuk mendukung karakter Unicode.) Argumennya bertipe String dan disebut s.
    // Setelah s dimasukkan ke dalam metode, Anda dapat memperlakukannya sama seperti objek lainnya.
    // (Anda dapat mengirim pesan ke sana.) Di sini, metode length() dipanggil,
    // yang merupakan salah satu metode untuk Strings; itu mengembalikan jumlah karakter dalam sebuah string.
    public int storage(String s) {
        // kata kunci return, yang melakukan dua hal
        // Pertama, artinya "Tinggalkan method ini, saya sudah selesai"
        // Kedua, jika method menghasilkan suatu nilai, nilai tersebut ditempatkan tepat setelah
        // pernyataan return.
        // Dalam hal ini nilai return dihasilkan dengan mengevaluasi ekspresi s.length() * 2
        return s.length() * 2;
    }

    // Anda dapat mengembalikan tipe apa pun yang Anda inginkan,
    // tetapi jika Anda tidak ingin mengembalikan apa pun,
    // Anda melakukannya dengan menunjukkan bahwa metode tersebut mengembalikan void.
    // Berikut beberapa contohnya:
    public void nothing() {
        // jika tipe return typenya void, maka kata kunci return hanya untuk keluar dari method
        // oleh karena itu tidak diperlukan saat anda mencapai akhir method.
        // anda dapat kembali dari suatu method kapan saja, tetapi jika
        // anda memberikan return type yang non-void seperti Integer, String, atau TypeClassLain,
        // kompailer akan memaksa anda (dengan pesan kesalahan) untuk mengembalikan tipe nilai yang
        // sesuai dimana pun anda kembali
        return;
    }

    public void nothing2() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MethodArgumentReturnValue that = (MethodArgumentReturnValue) o;
        return Objects.equals(name, that.name) && Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "MethodArgumentReturnValue{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
