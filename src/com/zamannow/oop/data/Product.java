package com.zamannow.oop.data;

import java.math.BigDecimal;

public class Product {
  protected String name;
  protected BigDecimal price;

  Product(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }
}
