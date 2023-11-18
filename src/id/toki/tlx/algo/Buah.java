package id.toki.tlx.algo;

import java.util.Scanner;

public class Buah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        System.out.print("Masukan pilihan : ");
        pil = input.nextInt();
        if (pil == 1) {
            System.out.println("Buah Pepaya");
        } else if (pil == 2) {
            System.out.println("Buah Stroberi");
        } else if (pil == 3) {
            System.out.println("Buah Apel");
        } else {
            System.out.println("Bukan Buah Deh");
        }
    }
}
