package com.tij4awesome.operator.operators;

/**
 * E06DogComparison
 * Following excercise 5 assing, a new Dog
 * reference to spot's object. Test for comparison
 * using == and equals() for all reference.
 */
public class E06DogComparison {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = dog1; // "Aliased" reference
        dog1.name = "spot";
        dog1.says = "ruff!";
        dog2.name = "scruffy";
        dog2.says = "wurf!";
        System.out.println("Comparing dog1 and dog2 objects...");
        compare(dog1, dog2);
        System.out.println();

        System.out.println("Comparing dog1 and dog3 objects...");
        compare(dog1, dog3);
        System.out.println();

        System.out.println("Comparing dog2 and dog3 objects...");
        compare(dog2, dog3);
    }

    public static void compare(Dog dog1, Dog dog2) {
        // Tebak apakah baris berikut dikompilasi:
        System.out.println("== on top references: " + (dog1 == dog2));
        System.out.println("equals() on top references: " + dog1.equals(dog2));
        System.out.println("== on names: " + (dog1.name == dog2.name));
        System.out.println("equals() on names: " + dog1.name.equals(dog2.name));
        // Mengapa atau mengapa tidak? (Petunjuk: Baca bagian Precedence dan
        // String operator + dan += di TIJ4.) Terapkan alasan yang sama pada
        // kasus berikutnya dan jelaskan mengapa perbandingan
        // selalu menghasilkan false:
        System.out.println("== on says: " + (dog1.says == dog2.says));
        System.out.println("equals() on says: " + dog1.says.equals(dog2.says));
    }
}
