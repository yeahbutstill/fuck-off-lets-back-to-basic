package id.toki.tlx.problem;

import java.util.Scanner;

public class FFaktorBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
