package com.zamannow.basic;

public class AgainPlayingWithIfStatement {
    public static void main(String[] args) {
        Integer nilai = 80;
        Integer absen = 60;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Maaf Anda Belum Lulus");
        } //else if (nilai >= 75 || absen >= 75) { // error tidak bisa statement else if dibawah else, harus di bawah if
            //System.out.println("Selamat");
        //}


        System.out.println("===");
        System.out.println("+++++++++++++++++++++++++++");
        AgainPlayingWithIfStatement againPlayingWithIfStatement = new AgainPlayingWithIfStatement();
        System.out.println(againPlayingWithIfStatement.lulusTidak(80, 50));
    }

    public String lulusTidak(Integer nilai, Integer absen) {
        if (nilai >= 75 && absen >= 75) {
            return "Selamat Kamu Lulus";
        } else {
            return "Maaf Kamu Tidak Lulus";
        }
    }
}
