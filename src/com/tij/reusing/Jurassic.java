package com.tij.reusing;

// Making an entire class final
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}

class SmallBrain {}

final class Dinosaur {
    int i = 7;
    int j = 1;
    SmallBrain x = new SmallBrain();
    void f(){}
}

//! class Further extends Dinosaur {}
// error: Cannot extends final class 'Dinosaur'