package com.zamannow.basic;

import java.util.Date;

public class AwExpressionStatementDanBlock {
    public static void main(String[] args) {
        // assignment statement
        int belirokokSetengah; // expression atau statement
        belirokokSetengah = 25_000 % 13_000; // expression atau statement
        int cobaTambah = 13 + 12; // expression atau statement

        // increment statement
        cobaTambah++;

        // method invocation atau bisa disebut pemanggilan method
        System.out.println(belirokokSetengah); // statement
        System.out.println(cobaTambah); // statement

        // Object creation statement
        Date date = new Date();
    }
}
