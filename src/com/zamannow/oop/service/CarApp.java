package com.zamannow.oop.service;

import com.zamannow.oop.service.impl.Avanza;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.drive();
        System.out.println(car.getBrand());
        System.out.println(car.getTire());
        System.out.println(car.isMaintenance());
    }
}
