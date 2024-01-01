package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise524isAllVowels {
    public static void main(String[] args) {
        System.out.println(isAllVowels("eIEiO"));
        System.out.println(isAllVowels("oink"));
    }

    private static boolean isAllVowels(String word) {
        int index = 0;
        while (index < word.length()) {
            char letter = word.charAt(index);
            letter = Character.toLowerCase(letter);
            if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') {
                return false;
            }
            index++;
        }
        return true;
    }
}
