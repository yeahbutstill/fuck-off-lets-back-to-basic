package com.dicoding.javafundamental.basic.strukturdasar.solid;

public class Main {

    public static void main(String[] args) {

        /**
         * membuat beberapa instance dari class Kucing
         */

        Kucing persian = new Kucing();
        persian.setColor("Putih");
        persian.setHeight(24.0);
        persian.setLength(46.0);
        persian.setWeight(2.0);

        Kucing bengal = new Kucing("Coklat", 22.0, 39.0, 2.3);
        Kucing anggora = new Kucing("Abu-abu", 25.0, 41.0, 2.4);

        System.out.println(persian);
        System.out.println(bengal);
        System.out.println(anggora);

    }

}
