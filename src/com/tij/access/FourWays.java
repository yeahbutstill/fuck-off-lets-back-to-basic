package com.tij.access;

public class FourWays {
    int a = 0;
    public int b = 1;
    protected int c = 2;
    private int d = 3;

    FourWays() {
        System.out.println("FourWay() constructor");
    }

    void showa() {
        System.out.println(a);
    }

    public void showb() {
        System.out.println(b);
    }

    protected void showc() {
        System.out.println(c);
    }

    private void showd() {
        System.out.println(d);
    }
}
