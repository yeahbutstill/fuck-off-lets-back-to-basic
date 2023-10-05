package id.alta.coursesintroductionto.javaspringboot.latihan.day3.basicjava;

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter an string: ");
    String kataKata = input.nextLine();
    System.out.println("You entered: " + kataKata);
    countCharacterType(kataKata);
    input.close();
  }

  /**
   * Berfungsi untuk menghitung jumlah vokal, konsonan, angka dan karakter khusus dalam sebuah
   * string.
   *
   * @param kataKata
   */
  private static void countCharacterType(String kataKata) {

    // Deklarasikan variabel vokal, konsonan, digit, dan karakter khusus
    int vowels = 0, consonant = 0, specialChar = 0, digit = 0;

    // str.length() berfungsi untuk menghitung jumlah karakter dalam string yang diberikan.
    for (int i = 0; i < kataKata.length(); i++) {

      char ch = kataKata.charAt(i);

      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

        // untuk menangani huruf besar
        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
          vowels++;
        } else {
          consonant++;
        }

      } else if (ch >= '0' && ch <= '9') {
        digit++;
      } else {
        specialChar++;
      }
    }

    System.out.println("Jumlah Vokal: " + vowels);
    System.out.println("Jumlah Konsonan: " + consonant);
    System.out.println("Digit: " + digit);
    System.out.println("Special Character: " + specialChar);
    System.out.println("Total Karakter: " + (vowels + consonant + digit + specialChar));
  }
}
