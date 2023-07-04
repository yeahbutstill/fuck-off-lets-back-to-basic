package com.mazeeko.oop;

public class Manager extends Employee {
  private String company;

  public Manager(String name) {
    super(name);
  }

  public Manager() {}

  public Manager(String name, String company) {
    super(name);
    this.company = company;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  @Override
  public void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is " + this.name + " As Manager");
  }
}
