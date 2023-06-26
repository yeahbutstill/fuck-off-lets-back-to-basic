package com.mazeeko.dasar;
public class IfStatement {
    public static void main(String[] args) {
        Integer nilai = 70;
        Integer absen = 90;

        if (nilai >= 80 && absen >= 80) System.out.println("Lulus Nilai Anda A");
        else if (nilai >= 70 && absen >= 70) System.out.println("Lulus Nilai Anda B");
        else if (nilai >= 60 && absen >= 60) System.out.println("Lulus Nilai Anda C");
        else if (nilai >= 50 && absen >= 50) System.out.println("Lulus Nilai Anda D");
        else System.out.println("Tidak Lulus Nilai Anda E");
    }
}