package com.dicoding.javafundamental.basic.strukturdasar.oop.accessmodifier.codelabprotected.package1;

import com.dicoding.javafundamental.basic.strukturdasar.oop.accessmodifier.KelasA;

public class Main {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();
        DefaultKelasA defaultKelasA = new DefaultKelasA();

        System.out.println(defaultKelasA.memberB);
        System.out.println(defaultKelasA.memberC);

    }
}
