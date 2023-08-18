package id.toki.tlx.problem;

import java.util.Scanner;

public class MembalikYangTerbalik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int reverseA = reverse(a);
        int reverseB = reverse(b);

        System.out.println(reverse(reverseA + reverseB));
    }

    public static int reverse(int number) {
        String numberString = Integer.toString(number);
        StringBuilder reversed = new StringBuilder(numberString).reverse();
        String reversedString = reversed.toString();
        int reverseNum = Integer.parseInt(reversedString);

        return reverseNum;
    }
}
