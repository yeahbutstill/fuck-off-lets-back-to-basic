package id.toki.tlx.problem;

import java.util.Scanner;

public class PermutasiZigZag {
    static int n;
    static int cek;
    static boolean zigzag;
    static int[] pernah = new int[10];
    static int[] catat = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.print(12);
            System.out.println();
            System.out.print(21);
        }
        tulis(0);
    }

    static void tulis(int kedalaman) {
        if (kedalaman >= n) {
            zigzag = false;
            for (int i = 1; i < n - 1; i++) {
                if (catat[i - 1] > catat[i] && catat[i + 1] > catat[i] ||
                        catat[i - 1] < catat[i] && catat[i + 1] < catat[i]) {
                    zigzag = true;
                } else {
                    zigzag = false;
                    break;
                }
            }
            if (zigzag) {
                for (int i = 0; i < n; i++) {
                    System.out.print(catat[i]);
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (pernah[i] == 0) {
                    pernah[i] = 1;
                    catat[kedalaman] = i + 1;
                    tulis(kedalaman + 1);
                    pernah[i] = 0;
                }
            }
        }
    }
}
