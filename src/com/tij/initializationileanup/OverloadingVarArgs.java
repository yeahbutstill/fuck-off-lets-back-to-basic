package com.tij.initializationileanup;

public class OverloadingVarArgs {
    static void f(Character... args) {
        System.out.print("first");
        for (Character c :
                args) {
            System.out.print(" " + c);
        }
    }

    static void f(Integer... args) {
        System.out.println("second");
        for (Integer i :
                args) {
            System.out.print(" " + i);
        }
    }

    static void f(Long... args) {
        System.out.println("third");
    }

    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1);
        f(0);
        f(0L);
        //! f(); // Won't compile -- ambi guous
    }
}
