package com.zamannow.generic.comparableinterface;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Naruto", "Konoha"),
                new Person("Sasuke", "Konoha"),
                new Person("Gojo", "Shibuya"),
        };

        Arrays.sort(people);
        for (Person value : people) {
            System.out.println(value);
        }
    }
}
