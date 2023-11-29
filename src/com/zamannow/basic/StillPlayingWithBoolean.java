package com.zamannow.basic;

public class StillPlayingWithBoolean {
    public static void main(String[] args) {
        // nilai dan absen budi
        Integer absen = 70;
        Integer nilai = 80;

        // syarat di matakuliah jika ingin lulus
        Boolean lulusAbsen = absen >= 75;
        Boolean lulusNilaiAkhir = nilai >= 75;
        // bersama dosen killer
        Boolean lulusDenganDosenKiller = lulusAbsen && lulusNilaiAkhir;
        // bersama dosen baik hati
        Boolean lulusDenganDosenBaikHati = lulusAbsen || lulusNilaiAkhir;


        System.out.println(lulusDenganDosenKiller);
        System.out.println(lulusDenganDosenBaikHati);
        System.out.println("-----------------------------------------------------------");
        System.out.println();

        StillPlayingWithBoolean stillPlayingWithBoolean = new StillPlayingWithBoolean();
        System.out.println(stillPlayingWithBoolean.dosenKiller(75, 75));
        System.out.println("----------------------------------------------------------");

        StillPlayingWithBoolean stillPlayingWithBoolean1 = new StillPlayingWithBoolean();
        stillPlayingWithBoolean1.dosenBaikHati(69, 75);
    }

    public Boolean dosenKiller(Integer absen, Integer nilai) {
        if (absen >= 75 && nilai >= 75) {
            return true;
        }
        return false;
    }

    public void dosenBaikHati(Integer absen, Integer nilai) {
        if (absen >= 75 || nilai >= 75) {
            System.out.println("Selama Anda lulus");
        }
    }
}
