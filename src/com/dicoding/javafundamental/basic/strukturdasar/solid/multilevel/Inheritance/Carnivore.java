package com.dicoding.javafundamental.basic.strukturdasar.solid.multilevel.Inheritance;

public class Carnivore extends Animal {
    public void eat() {
        System.out.println("Yeay! " + getClass().getSimpleName() + " eat!");
    }
}
