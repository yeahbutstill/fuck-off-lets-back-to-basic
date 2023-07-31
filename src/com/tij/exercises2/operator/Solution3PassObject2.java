package com.tij.exercises2.operator;

//: operators/PassObject2.java
// TIJ4 Chapter Operators, Execise 3, page p98
// Create a class containing a float and use it to demonstrate aliasing during
// method calls
public class Solution3PassObject2 {
    public static void main(String[] args) {
        Box x = new Box();
        x.a = 3.1416f;
        System.out.println("1: x.a = " + x.a);

        f(x);
        System.out.println("2: x.a = " + x.a);
    }

    static void f(Box y) {
        y.a = 2.71828f;
    }
}

class Box {
    float a;
}
