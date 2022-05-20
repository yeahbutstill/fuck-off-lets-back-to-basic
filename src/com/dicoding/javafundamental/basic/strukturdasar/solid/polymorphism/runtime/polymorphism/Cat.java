package com.dicoding.javafundamental.basic.strukturdasar.solid.polymorphism.runtime.polymorphism;

public class Cat extends Animal {
    @Override
    public void walk() {
        super.walk();
        System.out.println("Yeay! " + getClass().getSimpleName() + " walked!");
    }
}
