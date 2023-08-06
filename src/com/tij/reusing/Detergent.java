package com.tij.reusing;

import static com.tij.util.Print.print;

// Inheritance syntax & properties
public class Detergent extends Cleanser {
    // Change a method
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-call version
    }

    // add method to the interface
    public void foam() {
        append(" foam()");
    }

    // test the new class
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing base class");
        Cleanser.main(args);
    }
}

class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        print(x);
    }
}