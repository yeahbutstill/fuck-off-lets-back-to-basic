package com.dicoding.javafundamental.basic.strukturdasar.percabangan;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        char input = 'C';
        int output = 0;
        switch (input) {
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                // Program akan menjalankan kode di dalam case ini
                output++; // output = 1

                // Karena di akhir case C tidak ada break, maka program akan menjalankan case selanjutnya
            case 'D':
                // Kode ini akan dijalankan oleh program
                output++; // output = 2
            case 'E':
                // Kode ini akan dijalankan oleh program
                output++; // output = 3
            default:
                // Case default juga akan dijalankan
                output++; // output = 4
        }
        System.out.println("Nilai akhirnya adalah " + output);
    }
}

/**
 * Bagaimana bisa output yang dihasilkan 4?
 * <p>
 * Case tanpa break akan menjalankan semua kode setelah case yang terpilih.
 * Jadi dengan mengambil contoh kode di atas, dengan nilai inputan adalah char 'C',
 * maka kode program akan masuk ke dalam case 'C'. Di dalamnya nilai variabel output akan ditambah dengan 1
 * karena pemanggilan operator ++. Dan karena tidak ada break maka program akan melanjutkan menjalankan case setelahnya
 * yaitu case 'D', case 'E', dan default. Dan masing-masing di dalam case ada pemanggilan operator ++,
 * sehingga nilai akhir dari output-nya adalah 4.
 * <p>
 * Jika masih bingung perhatikan kembali kode di bawah ini yang sudah ditambahkan dengan komen agar lebih jelas.
 */