package com.zamannow.basic;

public class TestBreak {
    public static void main(String[] args) {
        int counter = 1;
        while (true) {
            System.out.println("Perulangan ke-" + counter++);
            if (counter > 10) {
                break;
            }
        }
    }
}
