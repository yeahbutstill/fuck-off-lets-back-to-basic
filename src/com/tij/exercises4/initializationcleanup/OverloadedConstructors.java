package com.tij.exercises4.initializationcleanup;

// initialization/OverloadedConstructors.java
// TIJ4 Chapter Initialization, Exercise 9, page 172
// Create a class with two (overloaded) constructors. Using 'this', call
// the second constructor from inside the first one.

class Doc2 {
    Doc2(int i) {
        this("MD");
        int yearsTraining = i;
        System.out.println("New doc with " + i + " years of training");
    }
    Doc2(String s) {
        String degree = s;
        System.out.println("New doc with " + s + " degree");
    }
    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
    }
    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}

public class OverloadedConstructors {
    public static void main(String[] args) {
        new Doc2(8).intubate();
    }
}