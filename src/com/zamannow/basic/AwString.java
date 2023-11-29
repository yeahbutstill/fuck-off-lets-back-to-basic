package com.zamannow.basic;

public class AwString {
    String lastname;
    final String dogname = "wildan";
    static String hobi;

    public static void main(String[] args) {
        String firstName = "DNL";
        String dogName; // kalau deklaris di method harus di isi nilainya, sebelum di panggil di statement
        System.out.println(firstName);
//        System.out.println(dogName);
        dogName = null;
        System.out.println(dogName);

        AwString awString = new AwString();
        //awString.dogname = "dbs31"; // error karena ada kata kunci final yang dimana nilainya tidak bisa diubah padaa saat object pertama kali dibuat
        System.out.println(awString.dogname);
        System.out.println("dawg: " + awString.dogname);
        System.out.println("String nilai defaultnya: " + awString.lastname);

        // Langsung panggil nama class nya lalu diikuti nama field nya
        AwString.hobi = "Bola";

        System.out.println(AwString.hobi); // kalau ada kata kunci static tidak perlu buat object terlebih dahulu karena field tersebut milik class bukan object

        System.out.println("===========");

        // kalau deklarasi pake kata kunci var, harus diinisiasi nilainya langsung
        var fullName = firstName + " Gojo";
        System.out.println(fullName);
        System.out.println();

        // Konversi auto dari tipe data primitif
        int agePrimitif = 300000;
        Integer ageBukanPrimitif = agePrimitif;
        System.out.println(ageBukanPrimitif);
        System.out.println();

        // Konversi manual karena narrowing
        short shortAge = ageBukanPrimitif.shortValue(); // number overflow karena tepat penapung nila nya melebihi batas maksimal
        System.out.println(shortAge);
        byte byeAge = ageBukanPrimitif.byteValue(); // number overflow karena tepat penapung nila nya melebihi batas maksimal
        System.out.println(byeAge);
    }
}
