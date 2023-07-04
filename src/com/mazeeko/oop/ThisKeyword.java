package com.mazeeko.oop;

public class ThisKeyword {
  private String name;
  private String age;

  public ThisKeyword() {}

  /**
   * this keyword untuk mengakses object saat ini, agar tidak terkena variable atau method shadowing
   *
   * @param name this.name ini adalah fieldnya
   * @param age this.age ini adalah fieldnya
   */
  public ThisKeyword(String name, String age) {
    this.name = name;
    this.age = age;
  }

  public void sayHello() {
    this.sayHello("Bos");
  }

  public void sayHello(String name) {
    System.out.println("Hello " + name + ", My name is " + this.name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }
}
