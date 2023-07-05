package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.yeahbutstill.repo.Car;
import com.mazeeko.oop.yeahbutstill.repo.impl.Avanza;

public class InterfaceApp {
  public static void main(String[] args) {
    // tanpa menggunakan polymorphism
    Avanza avanza = new Avanza();
    avanza.driver();
    System.out.println(avanza.getTire());

    // dengan polymorphism
    Car car = new Avanza();
    car.driver();
    System.out.println(car.getTire());
  }
}
