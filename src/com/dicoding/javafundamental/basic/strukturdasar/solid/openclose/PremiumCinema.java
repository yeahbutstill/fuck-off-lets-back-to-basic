package com.dicoding.javafundamental.basic.strukturdasar.solid.openclose;

public class PremiumCinema extends Cinema {
  public PremiumCinema(Double price) {
    super(price);
  }

  public PremiumCinema() {}

  @Override
  double calculateAdminFee() {
    return price * 20 / 100;
  }
}
