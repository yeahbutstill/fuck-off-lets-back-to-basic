package com.zamannow.testsoaljava.junior.day3;

import java.util.Scanner;

public class PlayingCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a card: ");
        String rank = scanner.next();
        String suit = scanner.next();

        String sayRank = switch (rank) {
            case "2":
                yield "Two";
            case "3":
                yield "Three";
            case "4":
                yield "Four";
            case "5":
                yield "Five";
            case "6":
                yield "Six";
            case "7":
                yield "Seven";
            case "8":
                yield "Eight";
            case "9":
                yield "Nine";
            case "10":
                yield "Ten";
            case "J":
                yield "Jack";
            case "Q":
                yield "Queen";
            case "K":
                yield "King";
            case "A":
                yield "Ace";
            default:
                throw new IllegalStateException("Unexpected value: " + rank);
        };

//        switch (rank) {
//            case "2" -> rank = "Two";
//            case "3" -> rank = "Three";
//            case "4" -> rank = "Four";
//            case "5" -> rank = "Five";
//            case "6" -> rank = "Six";
//            case "7" -> rank = "Seven";
//            case "8" -> rank = "Eight";
//            case "9" -> rank = "Nine";
//            case "10" -> rank = "Ten";
//            case "J" -> rank = "Jack";
//            case "Q" -> rank = "Queen";
//            case "K" -> rank = "King";
//            case "A" -> rank = "Ace";
//        }

        if (suit.equalsIgnoreCase("C")) {
            suit = "Clubs";
        } else if (suit.equalsIgnoreCase("D")) {
            suit = "Diamonds";
        } else if (suit.equalsIgnoreCase("H")) {
            suit = "Hearts";
        } else if (suit.equalsIgnoreCase("S")) {
            suit = "Spades";
        }

        System.out.println(sayRank + " of " + suit);
    }
}
