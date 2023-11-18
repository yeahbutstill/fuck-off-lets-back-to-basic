package id.toki.tlx.problem;

import java.util.Scanner;

public class BebekUntukTeman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("masing-masing " + x / y);
        System.out.println("bersisa " + x % y);
    }
}
