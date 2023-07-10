package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.recordclass.LoginRequest;

public class RecordApp {
  public static void main(String[] args) {
    LoginRequest loginRequest = new LoginRequest("sasuke", "rahasia");
    System.out.println(loginRequest);
    System.out.println(loginRequest.username());
    System.out.println(loginRequest.password());
  }
}
