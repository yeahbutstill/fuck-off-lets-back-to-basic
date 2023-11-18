package com.zamannow.basic.programming.model.primitif.data.type;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // long form
        double[] a; // declaration
        a = new double[10]; // creation
        for (int i = 0; i < a.length; i++) {
            a[i] = 0.0; // initialization
            System.out.println(Arrays.toString(a));
        }

        System.out.println("-------------------------------------------------");

        // short form
        double[] a1 = new double[20];
        a1[0] = 10;
        a1[1] = 20;
        a1[2] = 20;
        a1[3] = 20;
        a1[4] = 20;
        a1[5] = 20;
        a1[6] = 20;
        a1[7] = 20;
        a1[8] = 20;
        for (double valuea1 : a1) {
            System.out.println(valuea1);
        }

        System.out.println("============================");

        // initializing declaration
        int[] a2 = {10, 20, 30, 40, 50, 60, 70, 9};
        for (double value : a2) {
            System.out.println(value);
        }
    }
}
