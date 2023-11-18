package id.toki.tlx.problem;

import java.util.Scanner;

public class FaktorialGanjilGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.close();
        System.out.println(factorialGG(n));
    }

    public static Integer factorialGG(Integer n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return n / 2 * factorialGG(n - 1);
        } else {
            return n * factorialGG(n - 1);
        }
    }
}
