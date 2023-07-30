package com.tij.exercises1;

public class Solution3ATNTest {
    public static void main(String[] args) {
        ATypeName aTypeName = new ATypeName();
        aTypeName.i = 3;
        aTypeName.d = 2.71828;
        aTypeName.b = false;

        aTypeName.show();
    }
}

class ATypeName {
    int i;
    double d;
    boolean b;

    void show() {
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
    }
}