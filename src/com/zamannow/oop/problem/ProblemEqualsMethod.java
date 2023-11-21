package com.zamannow.oop.problem;

public class ProblemEqualsMethod {
    public static void main(String[] args) {
        // String itu kan Object atau bukan primitif
        String first = "DNL";
        first = first + " " + "Yeahbutstill";
        String second = "DNL Yeahbutstill";

        // ini itu primitif type
        int i = 10;
        int h = 10;

        System.out.println(first);
        System.out.println(second);
        System.out.println(first == second); // false
        System.out.println(first.equals(second)); // true
        System.out.println(h == i); // true


        /**
         * Kalau mau bandingin yang typenya object bukan primitif pake method equals
         * Kalau typenya primitif bandinginnya pake sama dengan ==
         */
    }
}
