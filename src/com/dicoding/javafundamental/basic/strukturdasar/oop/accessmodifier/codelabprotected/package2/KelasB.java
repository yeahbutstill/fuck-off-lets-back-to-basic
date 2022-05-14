package com.dicoding.javafundamental.basic.strukturdasar.oop.accessmodifier.codelabprotected.package2;

import com.dicoding.javafundamental.basic.strukturdasar.oop.accessmodifier.codelabprotected.package1.DefaultKelasA;

public class KelasB extends DefaultKelasA {

    @Override
    protected void methodC() {
        super.methodC();
        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}

/**
 * Kode di atas adalah contoh kelas turunan yang bisa mengakses metode dengan modifier protected dari induknya.
 */
