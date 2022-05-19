package com.dicoding.javafundamental.basic.strukturdasar.solid.hybrid.inheritance;

public class Main {
    public static void main(String[] args) {
        SolarSystem solarSystem = new SolarSystem();
        Earth earth = new Earth();
        Mars mars = new Mars();
        Moon moon = new Moon();

        System.out.println(solarSystem instanceof SolarSystem);
        System.out.println(earth instanceof Earth);
        System.out.println(mars instanceof SolarSystem);
        System.out.println(moon instanceof SolarSystem);
    }
}
