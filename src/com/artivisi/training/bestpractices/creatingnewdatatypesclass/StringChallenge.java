package com.artivisi.training.bestpractices.creatingnewdatatypesclass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringChallenge {
    // __define-ocg__
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sen = stringChallenge(s.nextLine());
        String longestWord = stringChallenge(sen);
        String token = "jixzvua6198";

        // Reversing the longest word and ChallengeToken and joining with a colon
        String varOcg = new StringBuilder(longestWord).reverse().toString() + ":" + new StringBuilder(token).reverse().toString();

        System.out.println(longestWord);
        System.out.println(varOcg); // Output example: "321dlrow:8916auvzxij"
    }

    // __define-ocg__ Finding the longest word in the string
    public static String stringChallenge(String sen) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+");
        Matcher matcher = pattern.matcher(sen);

        String longestWord = "";
        while (matcher.find()) {
            String word = matcher.group();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
