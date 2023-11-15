package com.zamannow.basic;

public class TestSwitch {
    public static void main(String[] args) {
        String nilai = "A";
        switch (nilai) {
            case "A":
                System.out.println("Wow anda lulus dengan baik");
                break; // ini untuk menghentikan percabangan dari case statement
            case "B":
            case "C":
                System.out.println("Anda lulus");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default: // ini mirip kaya else ketika semua kondisi diatas tidak ada yang terpenuhi
                System.out.println("Mungkin anda salah jurusan");
        }
    }
}
