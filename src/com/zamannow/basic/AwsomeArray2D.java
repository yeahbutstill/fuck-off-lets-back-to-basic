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
    System.out.println();

    String[][] namaPenjahat = {
      new String[] {"Heo", "Test", "Test", "Dont"},
      new String[] {"GH", "A", "B", "C"}
    };
    System.out.println(Arrays.deepToString(namaPenjahat));

    String[][][] namanHero = new String[2][2][2];
    namanHero[0][0][0] = "ORILY";
    System.out.println(Arrays.deepToString(namanHero));
  }
}
