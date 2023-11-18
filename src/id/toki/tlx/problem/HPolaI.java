package id.toki.tlx.problem;

import java.util.Scanner;

public class HPolaI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String result = generatePattern(n, k);
        System.out.println(result);
        sc.close();
    }

    static String generatePattern(int n, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                stringBuilder.append("* ");
            } else {
                stringBuilder.append(i).append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }
}
