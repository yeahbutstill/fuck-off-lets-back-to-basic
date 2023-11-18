package id.toki.tlx.algo;

import java.util.Scanner;

public class CaseJurusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        System.out.print("Masukan pilihan : S1 TT ");
        pil = input.nextInt();
        switch (pil) {
            case 1:
                System.out.println("S1 TE");
                break;
            case 2:
                System.out.println("S1 SK");
                break;
            case 3:
                System.out.println("S1 TT");
                break;
            case 4:
                System.out.println("S1 IF");
                break;
            case 5:
                System.out.println("S1 TI");
                break;
            default:
                System.out.println("Input Salah");
                break;
        }
    }
}
