package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.yeahbutstill.data.Product;

public class ProductApp {
  public static void main(String[] args) {
    Product product1 = new Product("Mac Book Pro", 15_000_000);
    Product product2 = new Product();
    product2.setName("Mac Book Pro");
    product2.setPrice(15_000_000);

    String firstName = product1.getName();
    String secondName = product2.getName();
    String thirdName = "Mac Book Pro";

    System.out.println(product1);
    System.out.println(product2);

    // ini bandingkan 2 object
    System.out.println(product1 == product2);
    // ini bandingkan isi 2 object
    System.out.println(product1.equals(product2));

    // ini kenapa true, karena java akan optimasi memory, jadi kalau kita bikin string isi stringnya
    // itu sama
    // maka dia tidak akan membuat ulang data string di memory, makan dia akan merefer ke data
    // object yang sudah ada
    System.out.println(secondName == thirdName);
  }
}
