package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.yeahbutstill.data.Customer;
import com.mazeeko.oop.yeahbutstill.enumrate.Level;

import java.util.Arrays;

public class EnumApp {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setName("Sasuke");
    customer.setLevel(Level.STANDARD);

    System.out.println(customer);
    System.out.println(customer.getLevel().getDescription());
    System.out.println();

    // Kenversi Enum ke String
    String levelString = Level.STANDARD.name();
    Level level = Level.valueOf("VIP");
    Level[] levels = Level.values();

    System.out.println(levelString);
    System.out.println(level);
    System.out.println(Arrays.toString(levels));
  }
}
