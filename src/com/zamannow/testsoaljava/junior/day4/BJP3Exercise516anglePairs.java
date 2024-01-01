package com.zamannow.testsoaljava.junior.day4;

public class BJP3Exercise516anglePairs {
    public static void main(String[] args) {
        System.out.println(anglePairs(0, 90, 180));
    }

    private static boolean anglePairs(int a, int b, int c) {
        if (a + b == 90) {
            if (a + c == 180) {
                return true;
            } else if (b + c == 180) {
                return true;
            }
            return false;
        } else if (a + c == 90) {
            if (b + c == 180) {
                return true;
            } else if (a + b == 180) {
                return true;
            }
            return false;
        } else if (b + c == 90) {
            if (a + c == 180) {
                return true;
            } else if (a + b == 180) {
                return true;
            }
            return false;
        }
        return false;
    }
}
