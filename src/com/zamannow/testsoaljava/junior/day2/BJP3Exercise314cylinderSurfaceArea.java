package com.zamannow.testsoaljava.junior.day2;

public class BJP3Exercise314cylinderSurfaceArea {
    public static void main(String[] args) {
        System.out.println(cylinderSurfaceArea(3.0, 4.5));
    }

    private static double cylinderSurfaceArea(double radius, double height) {
        // 2 * PI * radius * (radius + height)
        return 2 * Math.PI * radius * (radius + height);
    }
}
