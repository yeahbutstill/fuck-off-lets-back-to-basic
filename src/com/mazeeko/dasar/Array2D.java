package com.mazeeko.dasar;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        String[][] arr2D = {
                // box array 1 = index 0
                {"Dani", "Setiawan", "Winda"},
                // box array 2 = index 0
                {"Mazeeko", "Maulana"},
                {"Triyanti", "Maya"},
                {"Yasmin", "Piki", "Nay"}
        };

        String[] member = arr2D[0];
        System.out.println(Arrays.toString(Arrays.stream(member).toArray()));
        System.out.println("=============================================");
        System.out.println(member[1]);
        System.out.println("============================================");

        System.out.println(arr2D[0][0]);
        System.out.println(arr2D[0][2]);
        System.out.println(arr2D[1][0]);
        System.out.println(arr2D[2][1]);
        System.out.println("++++++++++++++++++++++++++");
        System.out.println(arr2D[3][0]);
    }
}
