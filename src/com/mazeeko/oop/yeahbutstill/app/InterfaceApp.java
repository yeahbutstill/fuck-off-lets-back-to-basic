package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.yeahbutstill.repo.Car;
import com.mazeeko.oop.yeahbutstill.repo.impl.Avanza;
import com.mazeeko.oop.yeahbutstill.repo.impl.Bus;

public class InterfaceApp {
  public static void main(String[] args) {
    // tanpa menggunakan polymorphism
    Avanza avanza = new Avanza();
    avanza.driver();
    System.out.println(avanza.getTire());
    System.out.println(avanza.getBrand());
    System.out.println(avanza.isMaintenance());
    System.out.println();

    // dengan polymorphism
    Car car = new Avanza();
    car.driver();
    System.out.println(car.getTire());
    System.out.println(car.getBrand());
    System.out.println(car.isMaintenance());
    System.out.println();

    Car bus = new Bus();
    bus.driver();
    System.out.println(bus.getTire());
    System.out.println(bus.getBrand());
    System.out.println(bus.isMaintenance());
    System.out.println(bus.isBig());
  }
}
