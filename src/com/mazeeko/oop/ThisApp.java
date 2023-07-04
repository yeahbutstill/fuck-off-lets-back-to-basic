package com.mazeeko.oop;

public class ThisApp {
  public static void main(String[] args) {
    ThisKeyword thisKeyword1 = new ThisKeyword();
    ThisKeyword thisKeyword2 = new ThisKeyword("Sasuke", "17");

    thisKeyword1.setName("Dani");
    thisKeyword1.setAge("20");

    thisKeyword1.sayHello();

    System.out.println(thisKeyword1.getName());
    System.out.println(thisKeyword1.getAge());
    System.out.println(thisKeyword2.getName());
    System.out.println(thisKeyword2.getAge());

    thisKeyword1.sayHello("Maya ");
    thisKeyword2.sayHello("Naruto");
  }
}
