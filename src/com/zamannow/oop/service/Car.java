package com.zamannow.oop.service;

public interface Car extends HasBrand, Maintenance {
  void drive();

  Integer getTire();

  default Boolean isBig() {
    return false;
  }
}
