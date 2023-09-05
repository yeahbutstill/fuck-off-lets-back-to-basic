package id.toki.tlx.algo;

import java.util.Scanner;

public class IfDuaPilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil;
        System.out.print("Masukan bilangan: ");
        bil = input.nextInt();
        if (bil == 0) {
            System.out.println("Bilangan Nol");
        } else {
            System.out.println("Bilangan bukan Nol");
        }
    }
}
