package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.yeahbutstill.data.Product;

public class ProductApp {
  public static void main(String[] args) {
    Product product = new Product("Mac Book Pro", 15_000_000);
    System.out.println(product.getName());
    System.out.println(product.getPrice());
  }
}
