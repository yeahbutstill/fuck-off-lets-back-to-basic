package com.zamannow.testsoaljava.junior.day3;

public class BJP3SelfCheck427medianOf3 {
    public static void main(String[] args) {
        System.out.println(medianOf3(3, 4, 1));
        System.out.println(medianOf3(8, 5, 1));
        System.out.println(medianOf3(-6, 817, -2));
        System.out.println(medianOf3(-1000, -55, -23));
    }

    private static int medianOf3(int n1, int n2, int n3) {
        if (n1 < n2) {
            if (n2 < n3) {
                return n2;
            } else return Math.max(n1, n3);
        } else {
            if (n1 < n3) {
                return n1;
            } else {
                return n2;
            }
        }
    }
}
