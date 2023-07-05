package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.yeahbutstill.data.City;

public class AbstractApp {
  public static void main(String[] args) {
    City city = new City();
    System.out.println(city);
    //Location location = new Location(); // error, harus menggunakan turunan tidak bisa dibuat object baru
  }
}
