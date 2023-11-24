package com.zamannow.generic.comparatorinterface;


import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Naruto", "Konoha"),
                new Person("Sasuke", "Konoha"),
                new Person("Gojo", "Shibuya"),
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);
        for (Person value : people) {
            System.out.println(value);
        }
    }
}
