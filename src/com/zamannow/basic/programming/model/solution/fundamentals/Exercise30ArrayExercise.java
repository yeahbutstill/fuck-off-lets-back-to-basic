package com.zamannow.basic.programming.model.solution.fundamentals;

import edu.princeton.cs.algs4.StdOut;

public class Exercise30ArrayExercise {

    public static void main(String[] args) {
        int n = 5;
        boolean[][] array = createCoprimeArray(n);
        printArray(array);
    }

    public static boolean[][] createCoprimeArray(int n) {
        boolean[][] array = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = isCoprime(i, j);
            }
        }
        return array;
    }

    public static void printArray(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                StdOut.printf("%6b", array[i][j]);
            }
            StdOut.println();
        }
    }

    private static boolean isCoprime(int i, int j) {
        if (i == j && i != 1) {
            return false;
        }

        if (i == 0 || j == 0) {
            return handleZero(i, j);
        }
        return gcd(i, j) == 1;
    }

    private static boolean handleZero(int i, int j) {
        return (i == 0 && j == 1) || (i == 0 && j == -1) || (j == 0 && i == 1) || (j == 0 && i == -1);
    }

    private static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        } else {
            return gcd(number2, number1 % number2);
        }
    }
}
