package com.mazeeko.oop;

import com.mazeeko.dasar.VariableShadowing;

public class VariableShadowingApp {
  public static void main(String[] args) {
    VariableShadowing person1 = new VariableShadowing("Dani", "Setiawan", "20", "Indonesia");
    VariableShadowing person2 = new VariableShadowing("Mazeeko", "Maulana", "18", "Indonesia");

    System.out.println(person1.getFirstname());
    System.out.println(person2.getFirstname());

    person1.sayHello("Budi");
    person2.sayHello("Maya");
  }
}
