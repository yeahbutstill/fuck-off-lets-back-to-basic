package com.mazeeko.dasar;

public class DataOnly {
    int i;
    double d;
    boolean b;

    void methodName() {
        System.out.println("Hello");
    }
    int f() {
        return 0;
    }

    int storage(String s) {
        return s.length() * 2;
    }

    boolean flag() {
        return true;
    }

    double naturalLogBase() {
        return 2.718;
    }

    void nothing() {
        return;
    }

    void nothing2() {
    }

}

class Main {
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        data.methodName();

        DataOnly a = new DataOnly();
        int x = a.f();
        System.out.println(x + 100);

    }
}