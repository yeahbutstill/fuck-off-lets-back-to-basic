package com.tij;

public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7;
        double below = 0.4;
        float fAbove = 0.7f;
        float fBelow = 0.4f;

        System.out.println("Math.round(above): " + Math.round(above));
        System.out.println("Math.round(below): " + Math.round(below));
        System.out.println("Math.round(fAbove): " + Math.round(fAbove));
        System.out.println("Math.round(fBelow): " + Math.round(fBelow));
    }
}
