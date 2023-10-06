package com.zamannow.oop.data;

import java.math.BigDecimal;

public class ProductDalamApp {
  public static void main(String[] args) {
    Product product1 = new Product("Mac Book Pro", new BigDecimal(25_000_000));
    System.out.println(product1);

    System.out.println();

    Product product2 = new Product("Asus Tuf Gaming", new BigDecimal(12_000_000));
    System.out.println(product2);
  }
}
