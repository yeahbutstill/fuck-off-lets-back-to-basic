package com.mazeeko.dasar;

import java.util.Locale;

public class SwitchStatement {
    public static void main(String[] args){
        String nilaiKomputer = "A";
        switch (nilaiKomputer) {
            case "A":
                System.out.println("Wow anda lulus dengan baik nilai anda " + nilaiKomputer);
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus nilai anda " + nilaiKomputer);
                break;
            case "D":
                System.out.println("Anda tidak lulus nilai anda " + nilaiKomputer);
                break;
            default:
                System.out.println("Mungkin anda salah jurusan nilai anda " + nilaiKomputer);
        }

        // dengan lambda
        String nilaiMtk = "C";
        switch (nilaiMtk) {
            case "A" -> System.out.println("Wow anda lulus dengan baik nilai anda " + nilaiMtk);
            case "B", "C" -> System.out.println("Anda lulus milai nilai anda " + nilaiMtk);
            case "D" -> System.out.println("Anda tidak lulus nilai anda " + nilaiMtk);
            default -> System.out.println("Mungkin anda salah jurusan nilai anda " + nilaiMtk);
        }

        // switch tanpa yield
        String nilaiBahasaIndonesia = "a".toUpperCase();
        String ucapan;
        switch (nilaiBahasaIndonesia) {
            case "A" -> ucapan = "Wow anda lulus dengan baik nilai anda " + nilaiBahasaIndonesia;
            case "B", "C" -> ucapan = "Anda lulus nilai anda " + nilaiBahasaIndonesia;
            case "D" -> ucapan = "Anda tidak lulus nilai anda " + nilaiBahasaIndonesia;
            default -> ucapan = "Mungkin anda salah jurusan nilai anda " + nilaiBahasaIndonesia;
        }
        System.out.println(ucapan);

        // switch dengan yield
        String member = "DIAMON";
        String ucapan1 = switch (member) {
            case "DIAMON":
                yield "Rank anda saat ini " + member;
            case "GOLD":
                yield "Rank anda saat ini " + member;
            case "SILVER":
                yield "Rank anda saat ini " + member;
            case "BRONZE":
                yield "Rank anda saat ini " + member;
            default:
                yield "Rank anda saat ini " + member;
        };
        System.out.println(ucapan1);

    }

}
