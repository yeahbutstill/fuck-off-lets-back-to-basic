package com.zamannow.basic.programming.model.solution.fundamentals;

public class Exercise17 {
    public static void main(String[] args) {
        System.out.println(exR2(3));
    }

    public static String exR2(int n) {
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) return "";
        return s;
    }
}
/***
 * Jawaban : Kasus dasar tidak akan pernah tercapai.
 * Panggilan ke exR2(3) akan menghasilkan panggilan ke exR2(0), exR2(-3), exR3(-6),
 * dan seterusnya hingga terjadi StackOverflowError.
 */
