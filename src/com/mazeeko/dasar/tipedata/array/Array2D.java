package com.mazeeko.dasar.tipedata.array;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        String[][] arr2D = { // box array yang pertama [0]
                { // box array yang pertama [0]
                    "Dani",
                        "Setiawan",
                        "Winda"
                },
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
