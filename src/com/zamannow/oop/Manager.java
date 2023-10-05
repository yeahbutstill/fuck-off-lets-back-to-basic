package com.zamannow.oop;

public class Manager {
  String name;

//  public Manager(String name) {
//    this.name = name;
//  }

  void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is Manager " + this.name);
  }
}
