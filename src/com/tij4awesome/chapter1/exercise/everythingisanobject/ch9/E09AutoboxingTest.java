package com.tij4awesome.chapter1.exercise.everythingisanobject.ch9;

/****************** Exercise 9 ******************
 * Write a program to demonstrate that
 * autoboxing works for all the primitive types
 * and their wrappers.
 ************************************************/
public class E09AutoboxingTest {
    public static void main(String[] args) {
        Byte by = 1;
        byte bt = by;
        System.out.println("byte = " + bt);

        Short sh = 1;
        short s = sh;
        System.out.println("short = " + s);

        Integer in = 1;
        int i = in;
        System.out.println("int = " + i);

        Long lo = 1L;
        long l = lo;
        System.out.println("long = " + l);

        Boolean bo = true;
        boolean b = bo;
        System.out.println("boolean = " + b);

        Character ch = 'x';
        char c = ch;
        System.out.println("char = " + c);

        Float fl = 1.0F;
        float f = fl;
        System.out.println("float = " + f);

        Double db = 1.0D;
        // autounboxing
        double d = db;
        // autoboxing
        Double dd = d;
        System.out.println("double = " + d);
        System.out.println("Double = " + dd.intValue());
    }
}
// Istilah Autoboxing dan Autounboxing
// sering muncul dalam literatur. Satu-satunya perbedaan adalah arah konversi:
// autoboxing mengkonversi dari tipe primitif ke objek wrapper,
// dan autounboxing mengkonversi dari tipe yang wrapper ke tipe primitif.