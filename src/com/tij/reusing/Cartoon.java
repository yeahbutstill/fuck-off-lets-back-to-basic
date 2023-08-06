package com.tij.reusing;

public class Cartoon extends Darwing {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}

class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Darwing extends Art {
    Darwing() {
        System.out.println("Darwing constructor");
    }
}