package com.zamannow.oop.data;

import java.math.BigDecimal;

public class Product {
  protected String name;
  protected BigDecimal price;

  Product(String name, BigDecimal price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Product product)) return false;

    if (!name.equals(product.name)) return false;
    return price.equals(product.price);
  }

  @Override
  public int hashCode() {
    int result = name.hashCode();
    result = 31 * result + price.hashCode();
    return result;
  }
}
