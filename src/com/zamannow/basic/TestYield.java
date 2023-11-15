package com.zamannow.basic;

public class TestYield {
    public static void main(String[] args) {
        String nilai = "A";
        String ucapan;

        // tanpa kata kunci yield
        switch (nilai) {
            case "A" -> ucapan = "Wow anda lulus";
            case "B", "C" -> ucapan = "Anda lulus";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> ucapan = "Mungkin anda salah jurusan";
        }
        System.out.println(ucapan);

        // menggunakan yield
        String nilai1 = "A";
        String ucapan1 = switch (nilai1) {
            case "A":
                yield "Wow anda lulus dengan baik"; // ini seperti return value
            case "B", "C":
                yield "Anda lulus";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan1);
    }
}
