package com.zamannow.oop.service.impl;

import com.zamannow.oop.service.Car;

public class Avanza implements Car {

  @Override
  public void drive() {
    System.out.println("Drive Avanza");
  }

  @Override
  public Integer getTire() {
    return 4;
  }

  @Override
  public String getBrand() {
    return "Toyota";
  }

  @Override
  public Boolean isMaintenance() {
    return false;
  }
}
