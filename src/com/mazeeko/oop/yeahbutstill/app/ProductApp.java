package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.yeahbutstill.data.Product;

public class ProductApp {
  public static void main(String[] args) {
    Product product1 = new Product("Mac Book Pro", 15_000_000);
    Product product2 = new Product();
    product2.setName("Mac Book Pro");
    product2.setPrice(15_000_000);

    System.out.println(product1);
    System.out.println(product2);

    // ini bandingkan 2 object
    System.out.println(product1 == product2);
    // ini bandingkan isi 2 object
    System.out.println(product1.equals(product2));
  }
}
