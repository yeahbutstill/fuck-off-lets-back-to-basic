package com.zamannow.basic;

public class AwesomeSwitchStatement {
  public static void main(String[] args) {
    int ulangan = 90;
    int absen = 70;
    String nilai = " ";

    if (ulangan >= 90 && absen >= 70) {
      nilai = "A";
    } else if (ulangan >= 80 && absen >= 70) {
      nilai = "B";
    } else if (ulangan >= 75 && absen >= 70) {
      nilai = "C";
    } else if (ulangan >= 65 && absen >= 70) {
      nilai = "D";
    } else {
      nilai = "E";
    }

    /*
    kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya
    menggunakan perbandingan ==.
    Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana.
    Kode di switch statement hanya untuk perbandingan ==
    */
    String ucupan;
    switch (nilai) {
        // dengan lambda
      case "A" -> ucupan = "Wow anda lulus dengan Baik😇";
      case "B", "C" -> ucupan = "Anda lulus";
      case "D" -> ucupan = "Maaf anda tidak lulus";
      default -> ucupan = "Maaf mungkin anda salah jurusan 🤣";
    }

    System.out.println(ucupan);
  }

  // AWSOME! motherfucker the new fucking switch statement
  String getRomanNumber(int value) {
    String romanValue = "";
    switch (value) {
      case 0 -> romanValue = "nulla"; // bye break
      case 1 -> romanValue = "I";
      case 2 -> romanValue = "II";
      case 3 -> romanValue = "III";
      case 4 -> romanValue = "IV";
      case 5 -> romanValue = "V";
      default -> {
        System.out.printf("Out of fucking range value 5d %n", value);
        romanValue = "N/A";
      }
    }
    return romanValue;
  }

  // hmmmm in expression
  String getShitRoman(int value) {
    return switch (value) {
      case 0 -> "nulla💩";
      case 1 -> "I💩";
      case 2 -> "II💩";
      case 3 -> "III💩";
      default -> throw new IllegalStateException("Out of shit 💩 range value: " + value);
    };
  }
}
