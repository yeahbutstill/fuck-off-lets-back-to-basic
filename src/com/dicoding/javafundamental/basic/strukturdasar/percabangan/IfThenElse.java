package com.dicoding.javafundamental.basic.strukturdasar.percabangan;

public class IfThenElse {
    public static void main(String[] args) {
        boolean isOn = false;

        if (isOn) {
            System.out.println("Menyalakan lampu");
        } else {
            System.out.println("Kondisi tidak terpenuhi...");
        }
    }
}

/**
 * Kode di atas berarti ketika nilai isOn bernilai false maka baris kode yang ada di dalam else akan dijalankan.
 * Di sini else berfungsi sebagai secondary option di mana ketika opsi pertama if  gagal, maka opsi kedua else dijalankan.
 * Sebenarnya else bukan hanya sebagai secondary option saja. Else lebih cocok dikatakan sebagai last option (opsi terakhir).
 */