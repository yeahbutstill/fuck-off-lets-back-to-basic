package com.zamannow.basic;

import java.util.Arrays;

public class PlayingWMethod {
    public static void main(String[] args) {
        PlayingWMethod playingWMethod = new PlayingWMethod();
        // kalau static itu milik class, jadi tidak harus buat object untuk memanggilnya
        sayHelloWorld();
        playingWMethod.sayHelloWorld("DNL");
        // karena balikannya string jadi kalau ingin ditampilkan kita harus panggil lagi yang dimana returnnya void tapi paremeternya string
        System.out.println(playingWMethod.returnMethodString("MY", "A12B12C12D12E12V12G12H12I12121212121212"));
        System.out.println(playingWMethod.returnMethodString("MY", "1212C12D12E12V12G12H12I12121212121212"));
        System.out.println(playingWMethod.returnMethodString("MY", "E12V12G12H12I12121212121212"));

        System.out.println(playingWMethod.sum(10, 20));
        System.out.println(playingWMethod.hitung(100, "+", 20));
        System.out.println(playingWMethod.hitung(100, "A", 20));
    }

    // kalau static cuman boleh manggil static juga
    public static void sayHelloWorld() {
        System.out.println("Hello static World");
    }

    // error tidak bisa di overloading, karena nama method dan parameter harus berbeda
//    public void sayHelloWorld() {
//        System.out.println("Hello World");
//    }

    public void sayHelloWorld(String username) {
        System.out.println("Hello " + username);
    }

    public String returnMethodString(String username, String password) {
        return "Hello " + username + ", token anda adalah: " + Arrays.toString(password.split("12", 8));
    }

    public int sum(int value1, int value2) {
        int total = value1 + value2;
        return total;
    }

    public int hitung(int value1, String operasi, int value2) {
        return switch (operasi) {
            case "+" -> value1 + value2;
            case "-" -> value1 - value2;
            case "*" -> value1 * value2;
            case "/" -> value1 / value2;
            default -> 0;
        };
    }
}
