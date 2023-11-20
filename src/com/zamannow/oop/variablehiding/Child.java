package com.zamannow.oop.variablehiding;

class Child extends Parent {
    // variable hiding
    String name;

    void doit() {
        System.out.println("Do it from child");
        System.out.println("Parent name is " + super.name);
    }
}
