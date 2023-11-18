package id.toki.tlx.problem;

import java.util.Scanner;

public class CWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            System.out.println(s);
        }
    }
}
