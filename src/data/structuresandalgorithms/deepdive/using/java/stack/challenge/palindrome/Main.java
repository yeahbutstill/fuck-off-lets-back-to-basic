package data.structuresandalgorithms.deepdive.using.java.stack.challenge.palindrome;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // should return true
        System.out.println(checkForPalindrome("abccba"));

        // should return false
        System.out.println(checkForPalindrome("Wahhhhh iya iyah gede sekali kerbauw?"));
        System.out.println(checkForPalindrome("Ih takut hiI?"));
        System.out.println(checkForPalindrome("Hello my friends"));
        System.out.println(checkForPalindrome("sorry noob"));
        System.out.println("===========================");
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));

    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(stringNoPunctuation.toString());
    }

}
