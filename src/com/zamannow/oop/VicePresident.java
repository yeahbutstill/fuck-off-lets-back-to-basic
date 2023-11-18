package com.zamannow.oop;


public class VicePresident extends Manager {

    /*
    Super constructor
    Tidak hanya untuk mengakses method atau properties yang ada di parent class nya, kata kunci super juga bisa
    digunakan untuk mengakses constructor.
    Namun ada hukumnya yang harus diikuti, yaitu untuk mengakses parent class constructor, kita harus mengaksesnya di dalam
    class child constructor.
    Jika sebuah class parent tidak memiliki constructor yang tidak ada parameternya (tidak memiliki default constructor)
    maka class child nya wajib mengakses constructor class parent tersebut
     */
    public VicePresident(String name) {
        super(name);
    }

    public VicePresident() {
    }

    /**
     * Method override adalah kemampuan mendeklarasikan ulang method yang di punyai dari parent class
     * nya. Perlu hati-hati. Saat kita melakukan proses override tersebut, secara automatis ketkia
     * kita membuat object dari class child, maka method yang di class parent nya tidak bisa diakses
     * lagi. Method override semuanya harus sama, yang beda cuman isi body methodnya
     *
     * @param name
     */
    @Override
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is VP " + this.name);
    }
}
