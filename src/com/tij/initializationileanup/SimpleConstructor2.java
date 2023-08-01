package com.tij.initializationileanup;

// Demonstration Initialization of a simple constructor
// Constructor can have arguments

public class SimpleConstructor2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock2(i);
        }
    }
}

class Rock2 {
    Rock2(int i) { // This is the Constructor
        System.out.println("Rock " + i + " ");
    }
}
