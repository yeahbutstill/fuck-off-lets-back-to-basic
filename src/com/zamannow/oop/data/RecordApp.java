package com.zamannow.oop.data;

public class RecordApp {
  public static void main(String[] args) {
    var loginReq = new LoginReq("dnl", "awsome");
    System.out.println(loginReq.username());
    System.out.println(loginReq.password());
    System.out.println(loginReq);
    loginReq.sayHello();
    System.out.println();

    var loginReq1 = new LoginReq(null, null);
    System.out.println(loginReq1);
    loginReq1.sayHello();
    System.out.println();

    var loginReq2 = new LoginReq("lnd");
    loginReq2.sayHello();
    System.out.println(loginReq2);
  }
}
