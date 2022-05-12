package com.dicoding.javafundamental.basic.strukturdasar.percabangan;

public class IfThen {
    public static void main(String[] args) {
        boolean isOn = true;
        if (isOn) {
            System.out.println("Menyalakan lampu");
        }
    }
}

/**
 * Kode di atas berarti ketika nilai isOn adalah true maka obyek lampu akan memanggil metode nyala().
 * Ini adalah contoh penggunaan percabangan yang sangat simpel,
 * di mana ketika suatu kondisi nilainya true maka kode yang ada di dalam {} (braces) akan bisa dijalankan.
 * <p>
 * Penggunaan braces adalah optional ketika kode yang dijalankan hanyalah 1 baris.
 * Akan tetapi jika terdapat lebih dari 1 baris, maka kode yang di dalamnya harus ada dalam {}.
 * Misalnya, pada contoh kode menyalakan lampu seperti di atas, kita hilangkan tanda {}.
 */
