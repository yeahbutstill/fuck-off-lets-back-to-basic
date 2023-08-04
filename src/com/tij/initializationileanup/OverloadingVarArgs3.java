package com.tij.initializationileanup;

public class OverloadingVarArgs3 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(char c, Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1,'a', 'b', 'c');
        f('a', 'b');
    }
}
