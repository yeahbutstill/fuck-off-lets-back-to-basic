package com.zamannow.basic.programming.model.primitif.data.type;

public class ReturnType {
  public static void main(String[] args) {
    ReturnType returnType = new ReturnType();
    System.out.println(returnType.hello());
  }

  public String hello() {
    return "Hello World";
  }
}
