package com.mazeeko.oop;

// Variable Hiding vs Method Overriding
public class VariableHidingApp {
  public static void main(String[] args) {
    Child child = new Child();
    child.name = "Maya";

    child.doIt();
    System.out.println(child.name);
    System.out.println("========================================");

    Parent parent = child;

    parent.doIt();
    // nah ini makannya jangan bikin nama properti, field atau nama variable yang sama di turunan,
    // nanti kena variable hiding
    System.out.println(parent.name);
    System.out.println("========================================");

    // check turunan
    boolean b = parent instanceof Child;
    boolean c = child instanceof Parent;

    System.out.println(b);
    System.out.println(c);
  }
}
