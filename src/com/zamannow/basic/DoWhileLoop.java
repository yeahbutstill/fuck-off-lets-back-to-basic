package com.zamannow.basic;

public class DoWhileLoop {
    public static void main(String[] args) {
        int counter = 100;
        do {
            System.out.println("Perulangan ke-" + counter++);
        } while (counter <= 10);
    }
}
