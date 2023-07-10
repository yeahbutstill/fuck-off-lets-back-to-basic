package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.yeahbutstill.repo.HelloWorld;

public class AnonApp {
  public static void main(String[] args) {
    HelloWorld english =
        // Anonymous class, kekurangan dari class ini adalah tidak bisa di reuse. pake ini kalau kasusnya sederhana
        new HelloWorld() {
          @Override
          public void sayHello() {
            System.out.println("Hello");
          }

          @Override
          public void sayHello(String name) {
            System.out.println("Hello " + name);
          }
        };

    english.sayHello();
    english.sayHello("Sasuke");
  }
}
