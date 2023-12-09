package com.zamannow.testsoaljava.junior.day3;

public class LogicExpressions1 {
    public static void main(String[] args) {
        int x = 4;
        int y = -3;
        int z = 4;

        System.out.println(x + y);
        System.out.println(y / y);

        System.out.println(x == 4);
        System.out.println(x == y);
        System.out.println(x == z);
        System.out.println(y == z);
        System.out.println(x + y > 0);
        System.out.println(x - z != 0);
        System.out.println(y * y <= z);
        System.out.println(y / y == 1);
        System.out.println(x * (y + 2) > y - (y + z) * 2);

    }
}
