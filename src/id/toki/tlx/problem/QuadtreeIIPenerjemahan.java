package id.toki.tlx.problem;

import java.util.Arrays;
import java.util.Scanner;

public class QuadtreeIIPenerjemahan {
    int[][] ans = new int[128][128];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuadtreeIIPenerjemahan quadtreeIIPenerjemahan = new QuadtreeIIPenerjemahan();
        int num = sc.nextInt();
        String[] inpt = new String[num];
        for (int i = 0; i < num; i++) {
            inpt[i] = sc.next();
        }

        int r = sc.nextInt();
        int c = sc.nextInt();
        int size = quadtreeIIPenerjemahan.eksponen2Terdekat(r, c);

        for (int i = 0; i < size; i++) {
            Arrays.fill(quadtreeIIPenerjemahan.ans[i], 0);
        }

        for (String s : inpt) {
            quadtreeIIPenerjemahan.penerjemah(0, 0, size, 1, s);
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(quadtreeIIPenerjemahan.ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    void penerjemah(int r, int c, int size, int curntIndex, String code) {
        if (curntIndex == code.length()) {
            for (int i = r; i < r + size; i++) {
                for (int j = c; j < c + size; j++) {
                    ans[i][j] = 1;
                }
            }
        } else {
            if (code.charAt(curntIndex) == '0') {
                penerjemah(r, c, size / 2, curntIndex + 1, code);
            } else if (code.charAt(curntIndex) == '1') {
                penerjemah(r, c + size / 2, size / 2, curntIndex + 1, code);
            } else if (code.charAt(curntIndex) == '2') {
                penerjemah(r + size / 2, c, size / 2, curntIndex + 1, code);
            } else if (code.charAt(curntIndex) == '3') {
                penerjemah(r + size / 2, c + size / 2, size / 2, curntIndex + 1, code);
            }
        }
    }

    int eksponen2Terdekat(int r, int c) {
        int result = 1;
        while (result < r || result < c) {
            result *= 2;
        }
        return result;
    }
}
