package id.toki.tlx.problem;

import java.util.Scanner;

public class IfThenCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 10) System.out.println("satuan");
        else if (10 <= n && n <= 99) System.out.println("puluhan");
        else if (100 <= n && n <= 999) System.out.println("ratusan");
        else if (1000 <= n && n <= 9999) System.out.println("ribuan");
        else if (10000 <= n && n <= 99999) System.out.println("puluhribuan");
    }
}
