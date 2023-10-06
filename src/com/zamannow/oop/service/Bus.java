package com.zamannow.oop.service;

public class Bus implements Car {
  @Override
  public void drive() {
    System.out.println("Bus drive");
  }

  @Override
  public Integer getTire() {
    return 20;
  }

  @Override
  public String getBrand() {
    return "Toyota Tayo";
  }

  @Override
  public Boolean isMaintenance() {
    return true;
  }

  @Override
  public Boolean isBig() {
    return true;
  }
}
