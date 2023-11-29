package com.zamannow.basic;

public class PlayingArrayDiDalamArray {
    public static void main(String[] args) {
        String[][] members = { // kotak[] pertama
                {"DNL", "SETI", "AWAN"}, // kotak[] kedua
                {"Bud", "Nug"}, {"JOK", "MOR"}};

        String[] member1 = members[0]; // {"DNL", "SETI", "AWAN"}
        String[] member2 = members[1]; // {"Bud", "Nug"}
        String[] member3 = members[2]; // {"JOK", "MOR"}

        System.out.println(member1[0]); // [0][0]
        System.out.println(member2[0]); // [1][0]
        System.out.println(member3[0]); // [2][0]
        System.out.println(members[0][0].equals("DNL"));
        System.out.println(members[1][0].equals("Bud"));
        System.out.println(members[2][0].equals("JOK"));
        System.out.println();

        System.out.println(members[1][0]); // Bud
        System.out.println(members[2][0]); // Jok
    }
}
