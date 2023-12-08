package com.zamannow.testsoaljava.junior.day2;

public class BJP3Exercise315sphereVolume {
    public static void main(String[] args) {
        System.out.println(sphereVolume(2.0));
    }

    private static double sphereVolume(double radius) {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }
}
