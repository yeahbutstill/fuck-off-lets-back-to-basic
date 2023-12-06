package com.zamannow.testsoaljava.junior.day1;

public class BJP3Exercise215printDesign {
    public static void main(String[] args) {
        printDesign();
    }

    public static void printDesign() {
        int temp = 1;
        // for row
        for (int a = 0; a < 5; a++) {
            // for dashes
            for (int b = 5; b > a; b--) {
                System.out.print("-");
            }

            // for number
            for (int c = 0; c < temp; c++) {
                System.out.print(temp);
            }
            temp+=2;

            // for dashes
            for (int d = 5; d > a; d--) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
