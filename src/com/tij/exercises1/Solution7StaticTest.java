package com.tij.exercises1;

public class Solution7StaticTest {
    public static void main(String[] args) {
        System.out.println("StaticTest.i = " + StaticTest.i++);

        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println("s1.i = " + st1.i);
        System.out.println("s2.i = " + st2.i);

        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println("After sf.increment() called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);

        Incrementable.increment();
        System.out.println("After Incrementable.increment called: ");
        System.out.println("st1.i = " + st1.i);
        System.out.println("st2.i = " + st2.i);

    }

    static class StaticTest {
        static int i = 47;
    }

    static class Incrementable {
        static void increment() {
            StaticTest.i++;
        }
    }

}
