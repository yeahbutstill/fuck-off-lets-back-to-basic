package com.tij.exercises4.initializationcleanup;

// initialization/InitTest17.java
// TIJ4 Chapter Initialization, Exercise 17, page 198
/* Create a class with a constructor that takes a String argument. During
 * constriction, print the argument. Create and array of object references to this
 * class, but don't actually create objects to assign into the array. When you run
 * the program, notice whether the initialization messages from the constructor
 * are printed.
 */

class InitTest2 {
    InitTest2(String s) {
        System.out.println("InitTest()");
        System.out.println(s);
    }
}

public class InitTest17 {
    public static void main(String[] args) {
        InitTest2[] it = new InitTest2[10];
    }
}
