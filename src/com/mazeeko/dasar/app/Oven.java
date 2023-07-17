package com.mazeeko.dasar.app;

public class Oven {
    private String food;
    private String seasoning;

    public static void cookDinner() {
        System.out.println("cook");
    }

    public static void cookDinner(String food) {
        System.out.println("cook " + food);
    }

    public static void cookDinner(String food, String seasoning) {
        System.out.println("cook " + food + ", " + seasoning);
    }

    public static void main(String[] args) {
        var overnah = new Oven();
        overnah.cookDinner();
        overnah.cookDinner("Kentang");
        overnah.cookDinner("Kentang", "Goreng");
    }
}