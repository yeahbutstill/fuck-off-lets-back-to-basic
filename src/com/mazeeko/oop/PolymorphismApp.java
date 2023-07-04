package com.mazeeko.oop;

public class PolymorphismApp {
  public static void main(String[] args) {
    Employee employee = new Employee();
    employee.setName("Maya");
    employee.sayHello("Sasuke");

    employee = new Manager();
    employee.setName("Dani");
    employee.sayHello("Gara");

    employee = new VicePresident();
    employee.setName("Winda");
    employee.sayHello("Naruto");
  }
}
