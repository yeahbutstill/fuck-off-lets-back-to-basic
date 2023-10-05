package com.zamannow.oop;

public class DemoBinatang {
  public static void main(String[] args) {
    Binatang kodok = new Binatang("Kodok", "Air");
    kodok.sayHello("dnl");
    kodok.sayHello();

    Binatang elang = new Binatang("Elang");
    elang.hidupDimana = "Udara";
    elang.sayHello("myt");

    Binatang badak = new Binatang();
    badak.nama = "Badak";
    badak.hidupDimana = "Darat";
    badak.sayHello("wdn");
  }
}
