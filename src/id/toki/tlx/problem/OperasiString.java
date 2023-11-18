package id.toki.tlx.problem;

import java.util.Scanner;

public class OperasiString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String s4 = sc.nextLine();

        s1 = s1.replace(s2, "");
        StringBuilder output = new StringBuilder(s1);
        int index = output.indexOf(s3);
        output.insert(index + s3.length(), s4);
        String ans = output.toString();
        System.out.println(ans);
    }
}
