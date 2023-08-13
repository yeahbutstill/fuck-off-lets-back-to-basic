package id.toki.tlx.problem;

import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int t = sc.nextInt();
        LuasSegitiga luasSegitiga = new LuasSegitiga();
        double hasil = luasSegitiga.rumus(a, t);
        System.out.printf("%.2f", hasil);
    }

    double rumus(int a, int t) {
        return 0.5 * a * t;
    }
}
