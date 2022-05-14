package com.dicoding.javafundamental.basic.strukturdasar.oop.accessmodifier;

public class Main {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();
        DefaultKelasA defaultKelasA = new DefaultKelasA();

        /**
         * Jika diperhatikan, kode diatas akan terjadi eror karena memberA dan functionA dalam keadaan private,
         * hal tersebut mengatikbatkan tidak bisa diakses dari luar kelas.
         */
//        System.out.println(kelasA.memberA);
//        System.out.println(kelasA.functionA());

        System.out.println(kelasA.functionB());

        System.out.println(defaultKelasA.memberB);
        System.out.println(defaultKelasA.memberC);

    }
}
