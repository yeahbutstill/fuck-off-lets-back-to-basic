package com.zamannow.testsoaljava.junior.day1;

public class BadNews {
    public static final int MAX_ODD = 21;

    public static void writeOdds() {
        // print each odd number
        for (int count = 1; count <= MAX_ODD; count += 2) {
            System.out.print(count + " ");
        }
        System.out.println();
    }

    private static void writeOddsHalf() {
        for (int count = 1; count <= 11; count += 2) {
            System.out.print(count + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // write all odds up to 21
        writeOdds();
        // now, write all odds up to 11
        writeOddsHalf();
    }
}