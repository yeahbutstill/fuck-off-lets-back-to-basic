package com.yeahbutstill.java21.sealedtypes;

public class SealedTypeTest {

    public static void main(String[] args) {
        Animal animalDog = new Dog();
        Animal animalCat = new Cat();
        Animal animalBird = new Bird();
        SealedTypeTest sealedTypeTest = new SealedTypeTest();

        System.out.println(sealedTypeTest.communicate(animalDog));
        System.out.println(sealedTypeTest.communicate(animalCat));
        System.out.println(sealedTypeTest.communicate(animalBird));
    }

    public String communicate(Animal animal) {
        return switch (animal) {
            case Cat cat -> cat.meow();
            case Dog dog -> dog.bark();
            case Bird bird -> bird.chirp();
        };
    }

    public String classicCommunicate(Animal animal) {
        String message = null;
        if (animal instanceof Dog dog) {
            message = dog.bark();
        }

        if (animal instanceof Cat cat) {
            message = cat.meow();
        }

        if (animal instanceof Bird bird) {
            message = bird.chirp();
        }

        return message;
    }
}
