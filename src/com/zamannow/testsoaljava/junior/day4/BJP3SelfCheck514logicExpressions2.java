package com.zamannow.testsoaljava.junior.day4;

public class BJP3SelfCheck514logicExpressions2 {
    public static void main(String[] args) {
        int x = 27;
        int y = -1;
        int z = 32;
        boolean b = false;
        System.out.println(!b);
        System.out.println(b || true);
        System.out.println((x > y) && (y > z));
        System.out.println((x == y) || (x <= z));
        System.out.println(x % 2); // this false
        System.out.println(!(x % 2 == 0)); //but ! (kebalikan)
        System.out.println((x % 2 != 0) && b);
        System.out.println(b && !b);
        System.out.println(b || !b);
        System.out.println((x < y) == b);
        System.out.println(x / 2);
        System.out.println(z * 3);
        System.out.println(!(x / 2 == 13) || b || (z * 3 == 96));
        System.out.println((z < x) == false);
        System.out.println(!((x > 0) && (y < 0)));
    }
}
