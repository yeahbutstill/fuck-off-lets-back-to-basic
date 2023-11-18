package com.zamannow.oop.data;

public class Cat extends Animal {
    @Override
    void run() {
        System.out.println("Cat " + this.name + " is running");
    }
}
