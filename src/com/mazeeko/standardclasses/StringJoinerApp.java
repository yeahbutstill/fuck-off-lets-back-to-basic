package com.mazeeko.standardclasses;

import java.util.StringJoiner;

/**
 * StringJoiner adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan
 * dengan delimiter
 * StringJoiner juga mendukung preﬁx(depan) dan sufﬁx(belakang) jika kita ingin menambahkannya
 * Ini sangat bagus ketika ada kasus misal kita ingin mem-print Array dengan format yang kita mau
 * misalnya
 */
public class StringJoinerApp {
    public static void main(String[] args) {
        var names = new String[]{"Yeah", "But", "Still"};
        StringJoiner joiner = new StringJoiner(
                "||-", "[", "]"
        );

        for (var name : names) {
            joiner.add(name);
        }

        System.out.println(joiner);
    }
}
