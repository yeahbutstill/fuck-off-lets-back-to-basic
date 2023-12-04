package com.zamannow.testsoaljava.junior.day1;

public class Lanterns {
    public static void main(String[] args) {
        bintang3();
        System.out.print("\n");
        bintang3();
        bintangPagar();
        System.out.println();
        System.out.print("*************\n");
        bintang3();
        System.out.print("\n");
        System.out.print("\n");
        bintang3();
        bintangKecil();
        bintangPagar();
        System.out.print("\n");
        bintangPagar();
        System.out.print("\n");
        bintangKecil();
        bintangKecil();
    }

    public static void bintang3() {
        System.out.print("    *****\n" +
                "  *********\n" +
                "*************\n");
    }

    public static void bintangPagar() {
        System.out.print("* | | | | | *");
    }

    public static void bintangKecil() {
        System.out.print("    *****\n");
    }
}
