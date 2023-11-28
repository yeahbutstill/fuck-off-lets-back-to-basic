package com.zamannow.basic;

public class AwString {
    String lastname;
    public static void main(String[] args) {
        String firstName = "DNL";
        String dogName; // kalau deklaris di method harus di isi nilainya, sebelum di panggil di statement
        System.out.println(firstName);
//        System.out.println(dogName);
        dogName = "A";
        System.out.println(dogName);

        AwString awString = new AwString();
        System.out.println("String nilai defaultnya: " + awString.lastname);

        System.out.println("===========");

        // kalau deklarasi pake kata kunci var, harus diinisiasi nilainya langsung
        var fullName = firstName + " Gojo";
        System.out.println(fullName);
    }
}
