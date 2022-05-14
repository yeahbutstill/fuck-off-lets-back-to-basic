package com.dicoding.javafundamental.basic.strukturdasar.oop.accessmodifier.package1;

public class DefaultKelasA {
    char memberB = 'A';
    double memberC = 1.5;
    private int memberA = 5;

    private int functionA() {
        return memberA;
    }

    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }

    /**
     * Perhatikan kode di atas.
     * Ada 2 member baru yaitu memberB dan memberC.
     * Keduanya tidak memiliki access modifier maka keduanya adalah termasuk default.
     * Dan lihat juga functionB, fungsi ini juga termasuk default modifier.
     * Terakhir, KelasA juga merupakan default modifier karena tidak memiliki access modifier.
     */
}
