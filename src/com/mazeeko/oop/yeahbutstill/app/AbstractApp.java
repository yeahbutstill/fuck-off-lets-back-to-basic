package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.yeahbutstill.data.City;

public class AbstractApp {
  public static void main(String[] args) {
    City city1 = new City();
    city1.setName("Depok");

    City city2 = new City();
    city2.setName("Jakarta");

    System.out.println(city1);
    System.out.println(city2);

    //Location location = new Location(); // error, harus menggunakan turunan tidak bisa dibuat object baru
  }
}
