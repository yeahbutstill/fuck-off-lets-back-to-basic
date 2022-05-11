package com.dicoding.javafundamental.basic.strukturdasar.tipedata.playwithstring;

public class StringreplaceTest {
    public static void main(String[] args) {
        String str = new String("Welcome to yeahbutstill");
        System.out.print("After replacing all o with T : ");
        System.out.println(str.replace('o', 'T'));
        System.out.print("After replacing all e with D : ");
        System.out.println(str.replace('e', 'D'));
    }
}
