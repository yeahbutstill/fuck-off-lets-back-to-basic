package com.zamannow.basic;

public class PlayingMTK {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        int c = 9;
        System.out.println(a + b); // 100 + 10 = 110
        System.out.println(a - b); // 110 - 10 = 90
        System.out.println(a * b); // 100 * 10 = 1000
        System.out.println(a / b); // 100 / 10 = 10
        System.out.println(a % b); // sisa bagi
        System.out.println(a % c);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        a = a + 10;
        System.out.println(a);
        a = a - 10;
        System.out.println(a);
        a = a * 10;
        System.out.println(a);
        a = a / 10;
        System.out.println(a);
        a = a % 10;
        System.out.println(a);
        System.out.println("*******************************************************************");

        // Augmented Assignments adalah operasi ke variable ke dia sendiri
        a += 10; // a = a + 10;
        System.out.println(a);
        a -= 10;
        System.out.println(a);
        a *= 10;
        System.out.println(a);
        a /= 10;
        System.out.println(a);
        a %= 10;
        System.out.println(a);
        System.out.println();
        System.out.println("============================================================");

        // Unary Operator adalah operator yang ditempatkan di depan variable
        int d = +100;
        int e = -10;
        int f = 10;

        d++;
        System.out.println(d);

        e--;
        System.out.println(e);
        System.out.println();

        ++f;
        System.out.println(f);
        --f;
        System.out.println(f);

        System.out.println(!(f == e));
        System.out.println(!true);
        
    }
}
