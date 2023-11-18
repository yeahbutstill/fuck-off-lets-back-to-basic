package com.zamannow.oop;

public class DemoCar {
    public static void main(String[] args) {
        Car avanza = new Car();
        avanza.name = "Avanza";
        avanza.brand = "Toyota";
        System.out.println(avanza.name);
        System.out.println(avanza.brand);

        Car almaz = new Car();
        almaz.name = "Almaz";
        almaz.brand = "Wuling";

        Car mobilio = new Car();
        mobilio.name = "Mobilio";
        mobilio.brand = "Honda";
    }
}
