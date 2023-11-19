package com.zamannow.oop;

public class DemoPerson {
    public static void main(String[] args) {
        // Saat kita membuat object dari class atau type yang sama, Object itu independent tidak ada hubungannya dengan object yang lain
        Person eko = new Person();
        eko.firstName = "Eko";
        eko.lastName = "Eko";
        System.out.println(eko.sayHello("Dani"));
        System.out.println(eko.firstName);
        System.out.println(eko.lastName);

        Person joko = new Person();
        joko.firstName = "Joko";
        joko.lastName = "Nugraha";

        Person budi = new Person();
        budi.firstName = "Budi";
        budi.lastName = "Nugraha";
    }
}
