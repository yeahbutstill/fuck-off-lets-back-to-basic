package com.tij.exercises3.controllingexecution;

import java.util.Random;

// control/CompareInts.java
// TIJ4 Chapter Control, Exercise 2, page 139
/* Write a program that generates 25 random int values. For each value, use an
 * if-else statement to classify it as greater than, less than or equal to a
 * second randomly generated value.
 */
public class Solution2CompareInts {
    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();
        for (int i = 0; i < 25; i++) {
            int x = rand1.nextInt();
            int y = rand2.nextInt();
            if (x < y) System.out.println(x + " < " + y);
            else if (x > y) System.out.println(x + " > " + y);
            else System.out.println(x + " = " + y);
        }

        System.out.println("=================================");

        Random rand3 = new Random(10);
        Random rand4 = new Random(10);
        for (int i = 0; i < 25; i++) {
            int x = rand3.nextInt();
            int y = rand4.nextInt();
            if (x < y) System.out.println(x + " < " + y);
            else if (x > y) System.out.println(x + " > " + y);
            else System.out.println(x + " = " + y);
        }
    }
}
