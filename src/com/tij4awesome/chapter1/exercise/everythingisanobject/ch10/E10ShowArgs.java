package com.tij4awesome.chapter1.exercise.everythingisanobject.ch10;

/***
 * Write a program that prints three arguments
 * taken from the command line.
 * You'll need to index into the command-line
 * array of Strings.
 *
 * {Args: A B C}
 */
public class E10ShowArgs {
    public static void main(String[] args) {
        // You can test for the length of the command-line argument array like this:
        if (args.length < 3) {
            System.err.println("Need 3 arguments");
            // System.exit() menghentikan program dan meneruskan argumennya
            // kembali ke sistem operasi sebagai status code.
            // (Pada sebagian besar sistem operasi, kode status bukan nol
            // menunjukkan bahwa eksekusi program gagal.)
            // Biasanya, Anda mengirim pesan kesalahan ke System.err,
            // seperti yang ditunjukkan di atas.
            System.exit(1);
        }

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}
// Ingat, ketika Anda ingin mendapatkan argumen dari baris perintah (command-line):
// •Argumen disediakan dalam array String.
// •args[0] adalah argumen baris perintah pertama dan bukan nama program (seperti di C).
// •Anda akan menyebabkan pengecualian runtime (runtime exception) jika Anda menjalankan program tanpa argumen yang cukup.