package com.dicoding.javafundamental.basic.strukturdasar.oop.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p, l); // memanggil fungsi
        System.out.println("Hasilnya adalah = " + hasil);
    }

    // fungsi dengan nilai balik
    private static double hitungLuas(double p, double l) {
        double luas = p * l;
        return luas;
    }
}
