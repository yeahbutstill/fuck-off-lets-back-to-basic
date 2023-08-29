package id.toki.tlx.algo;

import java.util.Scanner;

public class Ganjil {
    public static void main(String[] args) {
        int angka;
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        angka = inp.nextInt();

        if (angka % 2 > 0) System.out.println("Bilangan Ganjil");
        else System.out.println("Genap");
    }
}
