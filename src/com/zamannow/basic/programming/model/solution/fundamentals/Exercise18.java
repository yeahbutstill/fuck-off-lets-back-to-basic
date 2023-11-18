package com.zamannow.basic.programming.model.solution.fundamentals;

public class Exercise18 {
    public static void main(String[] args) {
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));
        System.out.println("=================");

        Exercise18 exercise18 = new Exercise18();
        System.out.println(exercise18.mysteryNotStatic(2, 25));
        System.out.println(exercise18.mysteryNotStatic(3, 11));
    }

    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    public int mysteryNotStatic(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery(a * a, b / 2);
        return mystery(a * a, b / 2) * a;
    }
}
/***
 * Berapakah nilai dari misteri(2, 25) dan misteri(3, 11)?
 * Diberikan bilangan bulat positif a dan b, jelaskan berapa nilai misteri(a, b) yang dihitung.
 * Jawab pertanyaan yang sama, tapi ganti + dengan * dan ganti return 0 dengan return 1.
 */
