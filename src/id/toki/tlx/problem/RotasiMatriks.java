package id.toki.tlx.problem;

import java.util.Scanner;

public class RotasiMatriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matriks = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriks[i][j] = sc.nextInt();
            }
        }

        int[][] rotasi = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rotasi[i][j] = matriks[m - 1 - j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(rotasi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
