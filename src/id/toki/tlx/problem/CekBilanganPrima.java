package id.toki.tlx.problem;

import java.util.Scanner;

public class CekBilanganPrima {
    static int numb = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= n; i++) {
            numb = Integer.parseInt(input.nextLine());
            System.out.println(checkNumber());
        }
    }

    static String checkNumber() {
        int half = numb / 2;
        if ((numb % 2 == 0 && numb != 2) || numb == 1) return "BUKAN";
        for (int i = 3; i <= half; i += 2) {
            if (numb % i == 0 && numb != i) return "BUKAN";
        }
        return "YA";
    }
}
