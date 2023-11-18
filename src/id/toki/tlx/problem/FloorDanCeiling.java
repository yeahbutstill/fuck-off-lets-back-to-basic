package id.toki.tlx.problem;

import java.util.Scanner;

public class FloorDanCeiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int f = (int) Math.floor(a);
        int c = (int) Math.ceil(a);

        System.out.println(f + " " + c);
    }
}
