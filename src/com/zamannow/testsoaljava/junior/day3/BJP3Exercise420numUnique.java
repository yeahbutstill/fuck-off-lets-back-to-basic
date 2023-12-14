package com.zamannow.testsoaljava.junior.day3;

public class BJP3Exercise420numUnique {
    public static void main(String[] args) {
        System.out.println(numUnique(18, 3, 4));
        System.out.println(numUnique(6, 7, 6));
    }

    private static int numUnique(int n1, int n2, int n3) {
        if (n1 == n2  && n1 == n3) {
            return 1;
        } else if (n1 == n2 || n1 == n3 || n2 == n3) {
            return 2;
        } else {
            return 3;
        }

    }
}
