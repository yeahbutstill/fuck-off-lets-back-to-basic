package id.toki.tlx.algo;

import java.util.Scanner;

public class ProgramPositifNegative {
  public static void main(String[] args) {
    int angka;
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukan angka : ");
    angka = sc.nextInt();

    if (angka > 0) System.out.println(angka + " Bilangan Positif");
    else if (angka < 0) System.out.println(angka + " Bilangan Negatif");
    else System.out.println(angka + " Bilangan Nol");
  }
}
