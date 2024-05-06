package com.tij4awesome.operator.operators;

import java.util.Date;

import static com.tij4awesome.net.mindview.util.Print.print;

public class E01PrintStatements {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Hello. it's " + now);
        print("Hello. it's " + now);
    }
}
