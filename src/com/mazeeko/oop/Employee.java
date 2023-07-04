package com.mazeeko.oop;

public class Employee {

  public String name;

  public Employee(String name) {
    this.name = name;
  }

  public Employee() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is " + this.name + " As Employee");
  }
}
