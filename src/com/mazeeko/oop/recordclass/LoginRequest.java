package com.mazeeko.oop.recordclass;

// record class tidak bisa di extend parent, tapi bisa implement interface
// java record ini dikususkan untuk menyimpan data dan datanya itu immutable aka tidak bisa berubah
public record LoginRequest(String username, String password) {
  // overloading constructor
  public LoginRequest {
    System.out.println("Membuat object LoginRequest");
  }

  public LoginRequest(String username) {
    this(username, "");
  }

  public LoginRequest() {
    this("", "");
  }

  // method
  public void sayHello() {
    System.out.println("Hello");
  }

  public void sayHello(String username) {
    System.out.println("Hello " + username);
  }
}
