package com.zamannow.testsoaljava.junior.day4;

public class BJP3SelfCheck512printLetters {
    public static void main(String[] args) {
        printLetters("Rabbit");
        printLetters("Y");
        System.out.println();
        printLettersDoWhile("DNL");
        printLettersDoWhile("A");
    }

    private static void printLetters(String text) {
        if (text.isEmpty()) System.out.print("");
        else {
            System.out.print(text.charAt(0));
            for (int i = 1; i < text.length(); i++) {
                System.out.print("-" + text.charAt(i));
            }
        }
        System.out.println();
    }

    private static void printLettersDoWhile(String text) {
        if (!text.isEmpty()) {
            System.out.println("Panjangnya: " + text.length());
            System.out.print(text.charAt(0));
            int i = 1;
            if (text.length() > 1) {
                do {
                    System.out.print("-" + text.charAt(i));
                    i++;
                } while (i < text.length());
            }
        }
        System.out.println();
    }
}
