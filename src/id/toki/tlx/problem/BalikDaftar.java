package id.toki.tlx.problem;

import java.util.Scanner;

public class BalikDaftar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idx = 0;
        int[] x = new int[100];
        while (input.hasNextInt()) {
            x[idx] = input.nextInt();
            idx++;
        }
        input.close();
        while (idx > 0) {
            idx--;
            System.out.println(x[idx]);
        }
    }
}
