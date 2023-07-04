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
    System.out.println("================================");

    sayHello(new Employee("Nana"));
    sayHello(new Manager("Miya"));
    sayHello(new VicePresident("Trasex"));
  }

  // method polymorphism, yang penting class paling atasnya dipanggil atau parentnya
  public static void sayHello(Employee employee) {
    System.out.println("Hello " + employee.getName());
  }
}
