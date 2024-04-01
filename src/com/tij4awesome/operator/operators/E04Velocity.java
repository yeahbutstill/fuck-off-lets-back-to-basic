package com.tij4awesome.operator.operators;

// Write a program that calculates velocity
// using a constant distance and a constant time
class E04Velocity {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java E04Velocity distance time");
            System.exit(1);
        }

        float distance = Float.parseFloat(args[0]);
        float time = Float.parseFloat(args[1]);
        System.out.print("velocity = ");
        System.out.print(distance / time);
        // Change the next line if you want to use a different
        // unit for 'distance'
        System.out.println(" m/s");
    }
}
/***
 * Di sini kita mengambil nilai distance dan time dari baris perintah.
 * Argumen masuk sebagai array String; jika Anda memerlukan float,
 * gunakan metode parseFloat() statis dari kelas Float. Ini mungkin sulit
 * ditemukan menggunakan dokumentasi JDK HTML;
 * Anda harus ingat "parse" atau itu bagian dari kelas Float.
 *
 * Perhatikan perbedaan antara System.out.print()
 * dan System.out.println(); yang
 * terakhir mengakhiri baris saat ini dengan menulis string pemisah baris.
 */
