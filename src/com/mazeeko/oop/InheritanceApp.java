package com.mazeeko.oop;

public class InheritanceApp {
  public static void main(String[] args) {
    Manager manager = new Manager();
    manager.setName("Maya");
    manager.setCompany("NTT");
    manager.sayHello("Sasuke");

    VicePresident vicePresident = new VicePresident();
    vicePresident.setName("Winda");
    vicePresident.setCompany("Netflix");
    vicePresident.sayHello("Naruto");

    System.out.println(manager);
    System.out.println(vicePresident);
  }
}
