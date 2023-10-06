package com.zamannow;

import com.zamannow.oop.data.Product;
import java.math.BigDecimal;

public class ProductApp {
  public static void main(String[] args) {
    // error karena constructor modifiernya defualt - tidak bisa diakses dari luar package
    // Product product = new Product("Mac Book Pro", new BigDecimal(25_000_000));

    //System.out.println(product.name); // karena name access modifiernya protected 
    //System.out.println(product.price); // karena price access modifiernya protected
  }
}
