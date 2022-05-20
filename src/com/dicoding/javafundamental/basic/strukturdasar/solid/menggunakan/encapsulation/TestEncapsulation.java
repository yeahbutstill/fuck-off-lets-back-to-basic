package com.dicoding.javafundamental.basic.strukturdasar.solid.menggunakan.encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setGeekName("Harsh");
        obj.setGeekAge(19);
        obj.setGeekRoll(51);

        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getGeekName());
        System.out.println("Geek's age: " + obj.getGeekAge());
        System.out.println("Geek's roll: " + obj.getGeekRoll());

        // Direct access of geekRoll is not possible
        // due to encapsulation
        // System.out.println("Geek's roll: " +
        // obj.geekName);
    }
}
