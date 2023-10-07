package com.zamannow.oop.service;

public class AnonApp {
  public static void main(String[] args) {
      HelloWorld eng = new HelloWorld() { // ini anonymous class, kekurangannya tidak bisa di reuse
          @Override
          public void sayHello() {
              System.out.println("yooo anon class");
          }

          @Override
          public void sayHello(String name) {
              System.out.println("thanks " + name);
          }
      };

      HelloWorld ind = new HelloWorld() { // ini anonymous class, kekurangannya tidak bisa di reuse
          @Override
          public void sayHello() {
              System.out.println("wooooy anon class");
          }

          @Override
          public void sayHello(String name) {
              System.out.println("terimakasih " + name);
          }
      };

      eng.sayHello();
      eng.sayHello("dnl");
      ind.sayHello();
      ind.sayHello("wd");
  }
}
