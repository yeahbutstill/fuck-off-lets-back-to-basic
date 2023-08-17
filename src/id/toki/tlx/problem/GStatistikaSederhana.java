package id.toki.tlx.problem;

import java.util.Scanner;

public class GStatistikaSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < input; i++) {;
            int num = sc.nextInt();
            if (num < max) max = num;
            if (num > min) min = num;
        }

        System.out.println(min + " " + max);
    }
}
