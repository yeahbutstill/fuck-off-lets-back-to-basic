package com.zamannow.oop;

public class Person {
    // properties yang ada di object bisa kita manipulasi. tergantung final atau bukan
    final String country =
            "Indonesia"; // jika final, berarti kita tidak bisa mengubah data proeperties tersebut
    // membuat properties sama seperti membuar variable, namum di tempatkan di block class
    String firstName; // properties adalah data yang bisa kita masukan di dalam Object
    // kita harus mendeklarasikan data apa saja yang dimiliki object tersebut di dalam deklarasi
    // classnya
    String lastName; // Namun untuk sebelum kita bisa memasukan data di properties,

    // default constructor
    public Person() {
        this(null);
    }

    // constructor adalah method yang akan dipanggil saat pertama kali Object dibuat,
    // nama constructor harus sama dengan nama class
    public Person(String firstName, String lastName) {
        // firstName = firstName; // properties firstName tidak berubah
        // lastName = lastName; // properties lastName tidak berubah

    /*
    Kata kunci this di dalam block constructor atau method didalam class, di gunakan untuk mengakses object saat ini.
    Misalnya kadang kita butuh mengakses sebuah properties yang namanya sama dengan parameter method.
    Hal ini tidak bisa dilakukan jika langsung menyebutkan nama properties tersebut, kita bisa mengakses nama properties
    tersebut dengan kata kunci this.
    This juaga tidak hanya digunakan untuk mengakses properties milik object saat ini, namun
    juga bisa digunakan untuk mengakses method, maka dari itu this sangat berguna sekali untuk menghindari dari
    masalah variable shadowing
     */
        this.firstName = firstName; // this itu merespentasikan dari object saat ini
        this.lastName = lastName; // sama aja kaya person.name = name yang ada di parameter
    }

    // constructor overloading, overloading itu mendeklarasikan method yang namanya sama dan di class
    // yang sama. dengan syarat tipe data parameter herus berbeda dan jumlah parameter
    // harus berbeda
    public Person(String name) {
        this.firstName = name;
    }

    // constructor juga bisa memanggil constructor lain
    // cara untuk memanggil constructor lain, kita hanya pertlu memanggilnya seperti memanggil method
    // namun dengan kata kunci this
    public Person(String paramName1, String paramName2, String paramName3) {
        this(paramName1, null);
    }

    /*
    Variable shadowing adalah kejadian ketika kita membuat nama variable dengan nama yang sama di scope
    yang menutupi variable dengan nama yang sama di scope diatasnya.
    ini bisa terjadi seperti kita membuat nama parameter di method sama dengan nama properties di class.
    Saat ini terjadi variable shadowing, maka secara automatis variable di scope diatasnya tidak bisa diakses
     */
    public String sayHello(String firstName) {
        return "Hi! " + firstName + ", my name is " + this.firstName;
    }

    public void sayHello() {
        this.sayHello("Bos");
    }

    public String sayGoodBye(String firstName) {
        return "Bye, " + firstName + "~";
    }
}
