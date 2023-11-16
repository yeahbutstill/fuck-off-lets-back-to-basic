package com.zamannow.basic;

public class TestForEach {
    public static void main(String[] args) {
        String[] array = {"Naruto", "Bunglon", "Dog", "Sasuke", "Sakura"};

        // tanpa for each
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        // dengan for each
        for (String key : array) {
            System.out.println(key);
        }

    }
}
