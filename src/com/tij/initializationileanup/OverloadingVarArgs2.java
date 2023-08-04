package com.tij.initializationileanup;

public class OverloadingVarArgs2 {
    static void f(float i, Character... args) {
        System.out.print("first");
    }

    static void f(Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1,'a', 'b', 'c');
        // f('a', 'b');
    }
}
