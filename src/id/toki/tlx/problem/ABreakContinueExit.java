package id.toki.tlx.problem;

import java.util.Scanner;

public class ABreakContinueExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                continue;
            } else if (i == 42) {
                System.out.println("ERROR");
                break;
            }
            System.out.println(i);
        }
    }
}
