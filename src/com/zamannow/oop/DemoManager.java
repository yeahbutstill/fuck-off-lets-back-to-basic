package com.zamannow.oop;

public class DemoManager {
  public static void main(String[] args) {
    var manager = new Manager();
    manager.name = "dnl";
    manager.sayHello("may");

    var vicePresident = new VicePresident();
    vicePresident.name = "may";
    vicePresident.sayHello("dnl");
  }
}
