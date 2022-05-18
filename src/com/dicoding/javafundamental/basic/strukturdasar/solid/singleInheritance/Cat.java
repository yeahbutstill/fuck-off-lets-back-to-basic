package com.dicoding.javafundamental.basic.strukturdasar.solid.singleInheritance;

// Single Inheritance
public class Cat extends Animal {

    @Override
    public void walk() {
        super.walk();
        System.out.println("Yeay! " + getClass().getSimpleName() + " walk!");
    }
}
