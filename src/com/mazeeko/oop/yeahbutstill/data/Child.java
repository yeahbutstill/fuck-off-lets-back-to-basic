package com.mazeeko.oop.yeahbutstill.data;

public class Child extends Parent {
  public String name; // aturan ini engga usah ditambahin lagi, karena udah ada di parent

  public void doIt() {
    System.out.println("Do it from child");
    System.out.println("Parent name is " + super.name); // super itu untuk mengakses parent
  }
}