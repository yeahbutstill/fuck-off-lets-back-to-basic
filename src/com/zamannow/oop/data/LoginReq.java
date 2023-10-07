package com.zamannow.oop.data;

import java.io.Serializable;

// ingat record class ini class final
public record LoginReq(String username, String password)
    implements Serializable { // disini diwajibkan harus membuat constructor karena yang namanya
                              // record itu
  // untuk menampung data

  // constructor overloading
  public LoginReq {
    if ((username != null) && (password != null)) System.out.println("Membuat object LoginReq");
  }

  // constructor overloading
  public LoginReq(String username) {
    this(username, " ");
  }

  // constructor oveeloading
  public LoginReq() {
    this(" ", " ");
  }

  public void sayHello() {
    System.out.println("Hello " + this.username);
  }
}
