package com.dicoding.javafundamental.basic.strukturdasar.solid.multilevel.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.walk();

        Carnivore carnivore = new Carnivore();
        carnivore.eat();
        carnivore.walk();

        Cat cat = new Cat();
        cat.eat();
        cat.walk();
    }
}
