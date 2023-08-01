package com.tij.initializationileanup;

// Demonstration Initialization of a simple constructor

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}

class Rock {
    Rock() { // This is the Constructor
        System.out.println("Rock ");
    }
}
