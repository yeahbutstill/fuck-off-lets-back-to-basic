package com.zamannow.testsoaljava.junior.day3;

public class CharMystery {
    public static void main(String[] args) {
        printRange('e', 'g');
        printRange('n', 's');
        printRange('z', 'a');
        printRange('q', 'r');
        printRange('a', 'z');
    }

    private static void printRange(char startLetter, char endLatter) {
        for (char letter = startLetter; letter <= endLatter; letter++) {
            System.out.print(letter);
        }
        System.out.println();
    }
}
