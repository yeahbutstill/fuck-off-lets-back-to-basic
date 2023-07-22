package com.mazeeko.oop;

public class Light {
    private String name;

    public Light() {}

    public static void on() {
        System.out.println("nyala");
    }

    public static void off() {
        System.out.println("mati");
    }

    public static void brighten() {
        System.out.println("lebih keterangan");
    }

    public static void dim() {
        System.out.println("lebih redup");
    }
}

class Run {
    public static void main(String[] args) {
        Light it = new Light();
        it.on();
    }
}
