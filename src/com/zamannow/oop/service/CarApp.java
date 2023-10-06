package com.zamannow.oop.service;

import com.zamannow.oop.service.impl.Avanza;

public class CarApp {
  public static void main(String[] args) {
    Car car = new Avanza();
    System.out.println(car.getTire());
    car.drive();
  }
}
