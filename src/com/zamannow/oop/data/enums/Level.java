package com.zamannow.oop.data.enums;

public enum Level {
  // enum properties
  STANDARD("Standard Edition"),
  PREMIUM("Premium Edition"),
  VIP("Vip Edition");

  // properties
  private String description;

  // constructor
  Level(String description) {
    this.description = description;
  }

  // method
  public String getDescription() {
    return description;
  }
}
