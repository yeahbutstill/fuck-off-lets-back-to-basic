package com.zamannow.basic;

public class AwesomeWhile {
    public static void main(String[] args) {
    /*
    while loop adalah versi perulangan yang lebih sederhana dibandingkan for loop.
    Di While loop, hanya terdapat kondisi perulangan, tanpa ada init statement dan post statement.
     */
        var counter = 1; // init statement nya disini kalau while
        while (counter <= 10) { // baru kondisinya di dalem while
            System.out.println("Perulangan ke - " + counter); // nah ini sama kaya if perulangannya disini
            counter++; // post statement nya disini kalau while
        }
    }
}
