package com.dicoding.javafundamental.basic.strukturdasar.oop.accessmodifier.codelabprotected.package2;

import com.dicoding.javafundamental.basic.strukturdasar.oop.accessmodifier.codelabprotected.package1.DefaultKelasA;

public class Main {
    public static void main(String[] args) {

        // Kode ini pasti akan mengalami kompiler error

        DefaultKelasA kelasA = new DefaultKelasA();

        //System.out.println(kelasA.functionB());

        //System.out.println(kelasA.memberB);
        //System.out.println(kelasA.memberC);

        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}
