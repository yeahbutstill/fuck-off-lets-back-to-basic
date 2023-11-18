package com.zamannow.oop;

public class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    Employee() {
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Employee " + this.name);
    }
}
