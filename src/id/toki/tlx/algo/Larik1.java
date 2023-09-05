package id.toki.tlx.algo;

import java.util.Scanner;

public class Larik1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] nilai = new float[5];
        System.out.println("Masukan 5 buah data nilai");
        for (int i = 0; i < 5; i++) {
            System.out.print("Data ke " + (i+1) + ": ");
            nilai[i] = input.nextFloat();
        }
        System.out.println("\n\nData nilai yang dimasukan");
        for (int i = 0; i < 5; i++) {
            System.out.println(nilai[i]);
        }
    }
}
