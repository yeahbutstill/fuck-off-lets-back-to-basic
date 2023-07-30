package com.tij.exercises1;

public class Solution4DataOnlyTest {
    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 3;
        dataOnly.d = 2.71828;
        dataOnly.b = false;
        dataOnly.show();
    }
}

class DataOnly {
    int i;
    double d;
    boolean b;

    void show() {
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
    }
}