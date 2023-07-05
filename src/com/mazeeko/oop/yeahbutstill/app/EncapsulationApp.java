package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.yeahbutstill.data.Category;

public class EncapsulationApp {
  public static void main(String[] args) {
    Category category = new Category();
    category.setId("1");
    category.setName("Mac Book Pro");
    category.setExpensive(true);

    System.out.println(category);
  }
}
