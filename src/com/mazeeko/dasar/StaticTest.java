package com.mazeeko.dasar;

public class StaticTest {
    static int i = 47;
}

class Main1 {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        int i = st1.i;
        System.out.println(i);

        StaticTest st2 = new StaticTest();
        int i1 = st2.i;
        System.out.println(i1);

        System.out.println("Di memory yang sama? " + (i == i1));
    }
}
