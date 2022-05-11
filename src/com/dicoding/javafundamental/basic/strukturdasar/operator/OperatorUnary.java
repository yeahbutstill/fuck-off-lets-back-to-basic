package com.dicoding.javafundamental.basic.strukturdasar.operator;

public class OperatorUnary {
    public static void main(String[] args) {
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        //Operator yang menunjukkan bila value yang diberikan operator ini adalah positif.
        // Memang seecara default, bilangan selalu positif.
        System.out.println("Hasil +5 = " + hasil);
        System.out.println();

        System.out.println("Operator Unary Minus");
        int nilaiAwal1 = 5;
        nilaiAwal1 = -nilaiAwal1;
        // Seperti halnya Operatur Plus, Operator Minus bernilai kebalikannya.
        System.out.println("Hasil -5 = " + nilaiAwal1);
        System.out.println();

        System.out.println("Operator Peningkatan nilai sebesar 1 point");
        int nilaiAwal2 = 5;
        nilaiAwal2++;
        // Operator yang memberikan penambahan nilai sebesar 1 point untuk value yang di-increment.
        // Operator ini biasa digunakan untuk pengulangan, yang akan dijelaskan pada materi lainnya.
        System.out.println("Hasil 5++ = " + nilaiAwal2);
        System.out.println();

        System.out.println("Operator Pengurangan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3--;
        // Kebalikan dari Operator di atas, operator decrement memberikan pengurangan nilai sebesar 1 point.
        System.out.println("Hasil 5-- = " + nilaiAwal3);
        System.out.println();

        System.out.println("Operator komplemen logika");
        boolean sukses = false; // Nilai sukses adalah false
        // Operator ini akan memberikan nilai kebalikan yang diberikan oleh sebuah boolean seperti pada kode di atas.
        // Awalnya nilai dari sukses bernilai false. Namun ketika dicetak dengan diberikan operator ini, menjadi true.
        System.out.println("Hasil !false = " + !sukses);
        System.out.println();

    }
}
