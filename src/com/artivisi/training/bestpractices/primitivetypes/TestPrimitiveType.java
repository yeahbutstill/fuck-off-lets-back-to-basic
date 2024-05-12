package com.artivisi.training.bestpractices.primitivetypes;

public class TestPrimitiveType {
    // Primitive Type - menempatkan variabel nilai secara langsung, dan ditempatkan di tumpukan (stack)
    boolean b;
    char c; // 16 bits
    byte by; // 8 bits
    short sh; // 16 bits
    int i; // 32 bits
    long l; // 64 bits
    float f; // 32 bits
    double d; // 64 bits
    //void

    // Wrapper type - menempatkan objek di heap
    Boolean bb;
    Character ch;
    Byte byt;
    Short shor;
    Integer in;
    Long lo;
    Float fl;
    Double dou;
    // Void

    public static void main(String[] args) {
        // “wrapper” class untuk tipe data primitif memungkinkan
        // Anda membuat objek non-primitif di heap
        // untuk mewakili tipe primitif tersebut. Misalnya:
        char c1 = 'a';
        Character c2 = c1;

        // Autoboxing akan secara automatis mengkonversi dari tipe primitif ke tipe wrapper a.k.a non-primitif
        Character c3 = 'b';
        char c4 = c3;

        System.out.println("c1 " + c1);
        System.out.println("c2 " + c2);
        System.out.println("c3 " + c3);
        System.out.println("c4 " + c4);

    }
}
