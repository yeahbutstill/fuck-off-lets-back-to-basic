package com.dicoding.javafundamental.basic.strukturdasar.solid.hierarchical.inheritance;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.walk();

        Dog dog = new Dog();
        dog.eat();
        dog.walk();

        Cat cat = new Cat();
        cat.eat();
        cat.walk();
    }
}
