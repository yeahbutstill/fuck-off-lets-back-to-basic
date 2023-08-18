package id.toki.tlx.problem;

import java.util.Scanner;

public class PembuanganString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        String t;
        String[] wordS;

        s = scanner.next();
        t = scanner.next();

        do {
            wordS = s.split(t);
            s = "";
            for (String result : wordS) {
                s = s.concat(result);
            }
        } while (wordS.length > 1);
        System.out.println(s);
    }
}
