package com.zamannow.oop.data;

public class AbstractClassApp {
  public static void main(String[] args) {
    // Location location = new Location(); // error cannot be instantiated. memang begitu abstract
    // class tidak bisa dibuat object. hanya bisa di turunkan
    City city = new City();
    city.name = "dpk";
    System.out.println(city.name);

    System.out.println();

    Animal bubu = new Cat();
    bubu.name = "bubu";
    bubu.run();

    Animal daw = new Cat();
    daw.name = "dawwww";
    daw.run();
  }
}
