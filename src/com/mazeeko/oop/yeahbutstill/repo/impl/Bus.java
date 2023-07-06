package com.mazeeko.oop.yeahbutstill.repo.impl;

import com.mazeeko.oop.yeahbutstill.repo.Car;

public class Bus implements Car {

  @Override
  public void driver() {
    System.out.println("Bus driver");
  }

  @Override
  public Integer getTire() {
    return 20;
  }

  @Override
  public String getBrand() {
    return "Toyota";
  }

  @Override
  public boolean isMaintenance() {
    return false;
  }

  @Override
  public boolean isBig() {
    return true;
  }
}
