package com.zamannow.stdclass;

public class TestStringBuilder {
    public static void main(String[] args) {
        // biasanya kita kalau bikin gabungan String kaya gini
        /**
         * ini terlihat sebenernya tidak adamasalah, tapi kalau dilihat dari belakang disisi compailer
         * dia bikin 4 Object baru di memory
         * yang pertama Bejo
         * yang ke dua Kayo
         * yang ke tiga Blank String
         * yang ke empat Ngene
         */
        String name = "Bejo";
        name += "Kayo";
        name += " ";
        name += "Ngene";
        System.out.println(name);


        // method append digunakan untuk concat string atau menambahkan string
        String fullName = "D" +
                "N" +
                "L" +
                " " +
                "Yeahbutstill"; // konversi ke String
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());
    }
}
