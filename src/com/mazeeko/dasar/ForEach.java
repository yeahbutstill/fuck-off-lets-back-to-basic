package com.mazeeko.dasar;
public class ForEach {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        // tanpa foreach
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("===================================================");

        // dengan foreach
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
