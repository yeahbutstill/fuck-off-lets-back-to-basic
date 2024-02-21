package com.tij4awesome.chapter1;

public class TestStaticKeyword {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        StaticTest.i++;
        System.out.println(st1.i);
        System.out.println(st2.i);
    }
}
