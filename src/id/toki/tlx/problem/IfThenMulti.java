package id.toki.tlx.problem;

import java.util.Scanner;

public class IfThenMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }
    }
}
