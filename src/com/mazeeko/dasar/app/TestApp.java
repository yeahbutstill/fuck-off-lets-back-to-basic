package com.mazeeko.dasar.app;

import com.mazeeko.dasar.Array;

import java.util.Arrays;

public class TestApp {
    public static void main(String[] args) {
        // menetapkan 8 ke j, 10 ke k, 10 ke m, 18 ke n, dan meninggalkan i dengan nilai 10.
        int i = 8;
        int j = i++;
        int k = ++i;
        int m = i--;
        int n = 9 + i++;
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
        System.out.println(n);

        // meninggalkan [5] dengan nilai 12 dan i dengan nilai 6.
        int[] a = new int[6];
        a[5] = 10;
        int ii = 5;
        a[ii++] += 2;
        System.out.println(Arrays.toString(Arrays.stream(a).toArray()));


        int chk1 = (5+2)*3;
        // jika tanda kurung tidak digunakan untuk menentukan urutan evaluasi.
        // Operator pada baris yang sama dievaluasi dalam urutan kiri ke kanan
        // (kecuali untuk operasi penugasan dan awalan, yang dievaluasi dari kanan ke kiri)
        int chk2 = 5+2*3;
        System.out.println(chk1);
        System.out.println(chk2);

        double d1 = 3.2;
        double d2 = 3.9999;
        int i1 = (int)d1; // i1 has value 3
        int i2 = (int)d2; // i2 has value 3
        double d3 = (double)i2; // d3 has value 3.0

        System.out.println(i1);

        int[][] aaa = new int[][]{};
        aaa[0][0] = 2;
        aaa[1][0] = 10;
        hasZeroEntry(aaa);

    }

    public static boolean hasZeroEntry (int[][] a) {
        boolean foundFlag = false;
        zeroSearch:
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                if (a[i][j] == 0) {
                    foundFlag = true;
                    break zeroSearch;
                }
            }
        }
        return foundFlag;
    }
}
