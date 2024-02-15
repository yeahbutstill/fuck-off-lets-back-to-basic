package com.tij4awesome.chapter1;

public class StringRefrence {
    public static void main(String[] args) {
        // String reference
        String s = "asdf";
        System.out.println(s.concat("hahaha"));

        // you must create all the object
        String ss = new String("asdf");
        System.out.println(ss);
    }
}
