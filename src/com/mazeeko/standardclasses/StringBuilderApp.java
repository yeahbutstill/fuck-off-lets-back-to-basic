package com.mazeeko.standardclasses;

/**
 * String adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah string
 * sebenarnya yang dilakukan di Java adalah membuat String baru
 * Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan
 * String, karena akan memakan memory yang cukup besar, untuk kasus seperti ini
 * disarankan menggunakan StringBuffer(thread safe) atau StringBuilder(not thread safe)
 */
public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Dani");
        builder.append(" ");
        builder.append("Setiawan");

        System.out.println(builder);
    }
}
