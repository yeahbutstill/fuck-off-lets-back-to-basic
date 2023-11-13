package com.zamannow.basic;

import java.util.Arrays;

public class AwsomeArray2D {
    public static void main(String[] args) {
        String[][] members = new String[2][3];
        members[0][0] = "test0";
        members[0][1] = "Wow";
        members[0][2] = "Hell";

        members[1][1] = "test1";
        System.out.println(Arrays.deepToString(members));
        System.out.println("============================");
        System.out.println();

        String[][] namaPenjahat = {new String[]{"Heo", "Test", "Test", "Dont"}, new String[]{"GH", "A", "B", "C"}};
        System.out.println(Arrays.deepToString(namaPenjahat));
        System.out.println("-----------------------------");

        String[][][] namanHero = new String[2][2][2];
        namanHero[0][0][0] = "ORILY1";
        namanHero[0][0][1] = "ORILY2";

        namanHero[0][1][0] = "ORILY3";
        namanHero[0][1][1] = "Cicak1";

        namanHero[1][0][0] = "Cicak2";
        namanHero[1][0][1] = "Cicak3";

        namanHero[1][1][0] = "Cicak4";
        namanHero[1][1][1] = "Cicak5";
        System.out.println(Arrays.deepToString(namanHero));
        System.out.println("=======================");
        System.out.println();

        String[][][] newMembers = {
                {
                    new String[]{"Jadi"}, new String[]{"Siap"}
                },
                {
                    {"DNL", "Oke", "Siap"}, {"Iya", "No", "Tidak", "Jangan"}, {"Begitu", "Ajah"}
                }
        };
        System.out.println(Arrays.deepToString(newMembers));
        System.out.println(Arrays.deepToString(newMembers[0]));
        System.out.println(Arrays.deepToString(newMembers[0][1]));
        System.out.println(Arrays.deepToString(newMembers[0][0]));
        System.out.println(Arrays.deepToString(newMembers[1]));
        System.out.println(Arrays.deepToString(newMembers[1][0]));
    }
}
