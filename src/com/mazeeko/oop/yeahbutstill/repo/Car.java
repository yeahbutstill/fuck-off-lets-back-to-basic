package com.mazeeko.oop.yeahbutstill.repo;

public interface Car extends HasBrand, IsMaintenance {
  void driver();

  Integer getTire();

  // default method, mehtod yang tidak wajib di implement atau di override di class lain
  default boolean isBig() {
    return false;
  }
}
