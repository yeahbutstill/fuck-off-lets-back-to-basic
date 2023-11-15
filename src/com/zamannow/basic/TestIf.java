package com.zamannow.basic;

public class TestIf {
    public static void main(String[] args) {
        int nilai = 70;
        int absen = 90;

        if (nilai >= 90 && absen >= 90) { // true
            System.out.println("Nilai anda A");
        } else if (nilai >= 80 && absen >= 80) { // true
            System.out.println("Nilai anda B");
        } else if (nilai >= 70 && absen >= 70) { // true
            System.out.println("Nilai anda C");
        } else if (nilai >= 60 && absen >= 60) { // true
            System.out.println("Nilai anda D");
        } else { // false
            System.out.println("Anda tidak lulus");
        }
    }
}
