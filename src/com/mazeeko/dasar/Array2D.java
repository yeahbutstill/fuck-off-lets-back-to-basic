package com.mazeeko.dasar;

public class Array2D {
    public static void main(String[] args) {
        String[][] arr2D = {
                {"Dani", "Setiawan", "Winda"},
                {"Mazeeko", "Maulana"},
                {"Triyanti", "Maya"},
                {"Yasmin", "Piki", "Nay"}
        };

        String[] member = arr2D[0];
        System.out.println(member[0]);

        System.out.println(arr2D[0][0]);
        System.out.println(arr2D[0][2]);
        System.out.println(arr2D[1][0]);
        System.out.println(arr2D[2][1]);
        System.out.println("++++++++++++++++++++++++++");
        System.out.println(arr2D[3][0]);
    }
}
