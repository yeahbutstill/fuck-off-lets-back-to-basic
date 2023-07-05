package com.mazeeko.oop.yeahbutstill.repo.impl;

import com.mazeeko.oop.yeahbutstill.repo.Car;

public class Avanza implements Car {

  @Override
  public void driver() {
    System.out.println("Avanza driver");
  }

  @Override
  public Integer getTire() {
    return 6;
  }

  @Override
  public String getBrand() {
    return "Toyota";
  }

  @Override
  public boolean isMaintenance() {
    return false;
  }
}
