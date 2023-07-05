package com.mazeeko.oop.yeahbutstill.repo;

public interface Car extends HasBrand, IsMaintenance {
  void driver();

  Integer getTire();
}
