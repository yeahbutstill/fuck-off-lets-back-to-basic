package com.tij.exercieses4.initializationcleanup;

// initialization/DogTalk2.java
// TIJ4 Chapter Initialization, Exercise 6, page 167
/* Modify the previous exercise so that two of the overloaded methods have two
 * arguments (of two different types), but in reverse order to each other.
 * Verify that this works.
 */

public class DogTalk2 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        char c = 'c';
        byte b = 0;
        short s = 0;

        d.bark();
        d.bark(c);
        d.bark(b);
        d.bark(s);
        d.bark(1);
        d.bark(1L);
        d.bark(1.0F);
        d.bark(1.0);
        d.bark(c, 1);
        d.bark(1, c);
    }
}

class Dog2 {
    void bark() {
        System.out.println("quiet");
    }

    void bark(char c) {
        System.out.println("cawcaw");
    }

    void bark(byte b) {
        System.out.println("barbark");
    }

    void bark(short s) {
        System.out.println("slurpslurp");
    }

    void bark(int i) {
        System.out.println("iyow");
    }

    void bark(long l) {
        System.out.println("lalala");
    }

    void bark(float f) {
        System.out.println("fififoofum");
    }

    void bark(double d) {
        System.out.println("dodo");
    }

    void bark(char c, int i) {
        System.out.println("caw-iyow");
    }

    void bark(int i, char c) {
        System.out.println("iyow-caw");
    }

}
