package com.zamannow.oop;

public class DemoPerson {
    public static void main(String[] args) {
        // Saat kita membuat object dari class atau type yang sama, Object itu independent tidak ada hubungannya dengan object yang lain
        PersonZamanNow dnl = new PersonZamanNow();
        dnl.name = "Dnl";
        dnl.address = "Depok";
        System.out.println(dnl.name);
        System.out.println(dnl.address);
        System.out.println(dnl.country);
        dnl.sayHello("Budi");

        System.out.println();

        PersonZamanNow budi = new PersonZamanNow("Budi");
        budi.address = "Jakrta";
        System.out.println(budi.name);
        System.out.println(budi.address);
        System.out.println(budi.country);
        budi.sayHello("Dnl");

        System.out.println();

        PersonZamanNow joko = new PersonZamanNow("Joko", "Cirebon");
        System.out.println(joko.name);
        System.out.println(joko.address);
        System.out.println(joko.country);
        joko.sayHello("Budi, Dnl");
    }
}
