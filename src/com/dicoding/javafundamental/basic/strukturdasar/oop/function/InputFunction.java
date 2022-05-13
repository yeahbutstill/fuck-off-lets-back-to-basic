package com.dicoding.javafundamental.basic.strukturdasar.oop.function;

public class InputFunction {
    public static void main(String[] args) {
        // memanggil fungsi
        hitungLuas(7, 6.5);
    }

    private static void hitungLuas(int panjang, double lebar) {
        double luas;
        luas = panjang * lebar;
        System.out.println(luas);
    }
}
