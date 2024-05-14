package com.artivisi.training.bestpractices.creatingnewdatatypesclass;

public class Soal3 {
    public static void main(String[] args) {
        int tanggal = 24;
        int bulan = 6;
        int tahun = 1982;
        String nama = "";
        System.out.println(nama + "xxxxxx");

        if (tanggal == 24 && bulan == 6 && tahun == 1982) {
            nama = "Harry";
            System.out.println(nama);
        }

        if (tanggal == 24 || bulan == 6 && tahun != 1982) {
            nama = "Rizal";
            System.out.println(nama);
        }

        if (tanggal == 24) {
            if (bulan == 6) {
                if (tahun == 1982) {
                    System.out.println("Bayu");
                }
            }
        }
    }
}