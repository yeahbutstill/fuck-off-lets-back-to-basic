package com.dicoding.javafundamental.basic.strukturdasar.oop.accessmodifier;

public class KelasA {
    private int memberA = 5;

    private int functionA() {
        return memberA;
    }

    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + functionA();
        return hasil;
    }

}
