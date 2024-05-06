package com.tij4awesome.operator.operators;

/**
 * E02Aliasing Create a class containing a float and use it to demonstrate aliasing
 */
public class E02Aliasing {
    public static void main(String[] args) {
        Integral n1 = new Integral();
        Integral n2 = new Integral();
        n1.f = 9f;
        n2.f = 47f;
        System.out.println("1: n1.f: " + n1.f + ", n2.f: " + n2.f);
        n1 = n2;
        System.out.println("2: n1.f: " + n1.f + ", n2.f: " + n2.f);
        n1.f = 27f;
        System.out.println("3: n1.f: " + n1.f + ", n2.f: " + n2.f);
        System.out.println(n1.equals(n2));
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(!n1.equals(n2));
    }
}

// Anda dapat melihat efek aliasing setelah
// n2 ditugaskan ke n1: keduanya menunjuk ke objek yang sama.

class Integral {
    float f;
}
