package com.mazeeko.dasar;
public class TernaryOperator {
    public static void main(String[] args){
        Integer nilai = 60;
        // kondisi() ? true : false
        String ucapan = nilai >= 75 ? "Selamat anda lulus dengan baik nilai anda " + nilai : "Anda tidak lulus nilai anda " + nilai;
        System.out.println(ucapan);
    }
}
