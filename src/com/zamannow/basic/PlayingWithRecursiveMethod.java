package com.zamannow.basic;

public class PlayingWithRecursiveMethod {
    public static void main(String[] args) {
        PlayingWithRecursiveMethod playingWithRecursiveMethod = new PlayingWithRecursiveMethod();
        System.out.println(playingWithRecursiveMethod.factorialLoop(4));
        System.out.println(1 * 2 * 3 * 4);
        System.out.println(playingWithRecursiveMethod.factorialRecursive(4));
    }

    // factorial menggunakan loop
    public Integer factorialLoop(Integer number) {
        Integer result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // menggunakan recursive method, adalah method yang manggil dirinya sendiri
    public Integer factorialRecursive(Integer number) {
        if (number == 1) {
            return 1;
        } else {
            return number * factorialRecursive(number - 1);
        }
    }
}
