package com.zamannow.testsoaljava.junior.day1;

public class EggStop {
    public static void main(String[] args) {
        kubus();
        System.out.println();
        kubus();
        garisTambah();
        System.out.println();
        kubusStop();
        garisTambah();
    }

    public static void kubus() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }

    public static void garisTambah() {
        System.out.println("+--------+");
    }

    public static void kubusStop() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
        System.out.println("|  STOP  |");
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
}
