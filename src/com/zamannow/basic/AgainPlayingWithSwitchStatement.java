package com.zamannow.basic;

public class AgainPlayingWithSwitchStatement {
    public static void main(String[] args) {
        String binatang = "Ayam";
        // kalau perbandingannya cuman == dan cuman ke 1 variable maka pake switch statement
        switch (binatang.toLowerCase()) {
            // jadi, jika ayam
            case "ayam":
                // maka jalankan ini
                System.out.println("Petok petok");
                //break; // ini seperti block tapi untuk menghentikan perulangan saat ini jika nila tersebut benar
                // jika tidak di break; maka akan bocor ke bawah sampai menemukan kata kunci break lagi
                // tidak ngaruh case nya benar atau salah, sampai berhenti diakhir statement
            case "anjing":
                System.out.println("GUG! GUG! GUG!");
            case "gajah":
                System.out.println("UUUUUUUUUUUUEENG!!!");
            case "harimau":
                System.out.println("AAAARRRRRGGG!!!");
                // kalau casenya sama dan nilainya juga bisa sama, bisa di gabung seperti ini
            case "ikan laut":
            case "ikan empang":
                System.out.println("Blebekblebekblebek ... ...");
                // kalau semuanya tidak ada yang terpenuhi atau else nya. kalau di switch bisa gunakan default
            default:
                System.out.println("Bukan binatang itu, atau orang yang kaya binatang");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // Switch dengan lambda
        String nilai = "E";
        switch (nilai) {
            case "A" -> System.out.println("Wow Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Selamat Anda Lulus");
            case "D" -> System.out.println("Maaf Anda Harus Remed");
            default -> {
                System.out.println("Buset Ngulang Kelas Aja");
                System.out.println("Goblok!");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();

        // Switch dengan lambda tapi tanpa yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow";
            case "B", "C" -> ucapan = "Biasa aja";
            case "D" -> ucapan = "Gimana sih lu";
            default -> ucapan = "Goblok";
        }
        System.out.println(ucapan);

        // switch dengan kata kunci yield
        String ucapanlagi = switch (nilai) {
            case "A":
                yield "Wow";
            case "B", "C":
                yield "Biasa aja";
            case "D":
                yield "Gimana sih lu";
            default:
                yield "Goblok";
        };
        System.out.println(ucapanlagi);
    }
}
