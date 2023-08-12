package com.mazeeko.dasar;
public class IfStatement {
    public static void main(String[] args) {
        Integer nilai = 70;
        Integer absen = 90;

        // digunakan untuk percabangan, artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
        // if(expresion harus boolean)
        if (nilai >= 80 && absen >= 80) System.out.println("Lulus Nilai Anda A"); // ini akan dieksekusi ketika kondisi if(expresion) bernilai true
        else if (nilai >= 70 && absen >= 70) System.out.println("Lulus Nilai Anda B"); // kadang dalam if, kita butuh membuat beberapa kondisi
        else if (nilai >= 60 && absen >= 60) System.out.println("Lulus Nilai Anda C");  // else if expression
        else if (nilai >= 50 && absen >= 50) System.out.println("Lulus Nilai Anda D");
        else System.out.println("Tidak Lulus Nilai Anda E"); // ini akan dieksekusi ketika kondisi if(expresion) bernilai false maka else expression  akan dijalankan
    }
}