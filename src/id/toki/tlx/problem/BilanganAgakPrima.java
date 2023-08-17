package id.toki.tlx.problem;

import java.util.Scanner;

public class BilanganAgakPrima {
    static int num = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        for (int i = 1; i <= a; i++) {
            num = Integer.parseInt(input.nextLine());
            System.out.println(checkNum());
        }
    }

    static String checkNum() {
        int half = num / 2;
        int jumlah = 0;
        for (int i = 2; i <= half; i++) {
            if (num % i == 0 && num != i) {
                jumlah++;
            }
            if (jumlah > 2) {
                return "BUKAN";
            }
        }
        return "YA";
    }
}
