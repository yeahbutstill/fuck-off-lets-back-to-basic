package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.recordclass.LoginRequest;

public class RecordApp {
  public static void main(String[] args) {
    LoginRequest loginRequest = new LoginRequest("sasuke", "rahasia");
    System.out.println(loginRequest);
    System.out.println(loginRequest.username());
    System.out.println(loginRequest.password());
    loginRequest.sayHello();
    loginRequest.sayHello(loginRequest.username());

    System.out.println(new LoginRequest("", ""));
    System.out.println(new LoginRequest("maya"));
    System.out.println(new LoginRequest("dani", "rahasia"));
  }
}
