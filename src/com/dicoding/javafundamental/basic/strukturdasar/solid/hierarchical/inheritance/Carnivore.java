package com.dicoding.javafundamental.basic.strukturdasar.solid.hierarchical.inheritance;

class Carnivore extends Animal {
    public void eat() {
        System.out.println("Yeay! " + getClass().getSimpleName() + " eat!");
    }
}