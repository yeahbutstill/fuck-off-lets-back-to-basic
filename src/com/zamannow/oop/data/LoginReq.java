package com.zamannow.oop.data;

import java.io.Serializable;

/**
 * kadang kita sering membuat class, hanya untuk class yang berisikan data, hanya berisi getter, equals, hashCode, dan toString method
 * Record class digunakan untuk mempermudah pembuatan jenil class tersebut
 * Saat kita membuat record class, secara otomatis java akan membuatkan getter, equals, hashCode dan toString method secara otomatis, dan juga constructor secara otomatis
 * Saat membuat record class, secara otomatis kita akan meng-extends class java.lang.Record, yang artinya kita tidak bisa extends class lain. Namun kita tetap bisa meng-implement interface
 *
 * Record Class itu Immutable, artinya tidak bisa diubah. jadi saat bikin object kita tidak bisa ubah valuenya atau nilainya
 *
 * @param username
 * @param password
 */

// ingat record class ini class final
public record LoginReq(String username, String password)
        implements Serializable { // disini diwajibkan harus membuat constructor karena yang namanya
    // record itu
    // untuk menampung data


    /**
     * Secara default, atau bawaan constructor di record class akan dibuat secara otomatis, sesuai dengan definisi record class parameter
     * Namun jika kita ingin melakukan sesuatu di constructor tersebut, kita bisa membuat compact constructor, yaitu constructor tanpa tanda ()
     * Selain itu, kita juga bisa melakukan constructor overloading, namun ada syaratnya, yaitu constructor overloading nya harus tetap memanggil constructor utama yang secara otomatis dibuatkan di record class dari definisi paramternya
     *
     * @param username
     * @param password
     */
    // constructor overloading
    // compact constructor
    public LoginReq {
        if ((username != null) && (password != null)) System.out.println("Membuat object LoginReq");
    }

    // constructor overloading
    public LoginReq(String username) {
        this(username, "");
    }

    // constructor oveeloading
    public LoginReq() {
        this("", "");
    }

    // method
    public void sayHello() {
        System.out.println("Hello " + this.username);
    }
}
