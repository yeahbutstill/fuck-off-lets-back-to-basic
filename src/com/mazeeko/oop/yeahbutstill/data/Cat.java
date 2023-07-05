package com.mazeeko.oop.yeahbutstill.data;

public class Cat extends Animal {

    @Override
    public void run() {
        System.out.println("Cat " + this.name + " is running");
    }
}
