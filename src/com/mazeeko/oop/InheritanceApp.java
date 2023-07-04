package com.mazeeko.oop;

public class InheritanceApp {
  public static void main(String[] args) {
    Manager manager = new Manager();
    manager.setName("Maya");
    manager.setAge("30");
    manager.sayHello("Sasuke");

    VicePresident vicePresident = new VicePresident();
    vicePresident.setName("Winda");
    vicePresident.setAge("20");
    vicePresident.sayHello("Naruto");
  }
}
