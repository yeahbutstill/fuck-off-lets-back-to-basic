package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise517monthApart {
    public static void main(String[] args) {
        System.out.println(monthApart(6, 14, 9, 21));
    }

    private static boolean monthApart(int month1, int day1, int month2, int day2) {
        if (Math.abs(month1 - month2) > 1) {
            return true;
        } else if (Math.abs(month1 - month2) == 1) {
            if (month1 < month2 && day1 <= day2) {
                return true;
            } else if (month1 > month2 && day1 >= day2) {
                return true;
            }
            return false;
        } else { // month1 = month2
            return false;
        }
    }
}