package com.zamannow.oop;

public class Manager extends Employee {
    String company;

    public Manager(String name) {
        this.name = name;
    }

    public Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public Manager() {
    }

    @Override
    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is Manager " + this.name);
    }
}
