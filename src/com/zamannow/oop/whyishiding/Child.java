package com.zamannow.oop.whyishiding;

public class Child extends Parent {
  String name; // waduh nah ini namanya variable hiding, soalnya sama nama propertiesnya yang ada di

  // parent classnya. makannya kalau bisa jangan bikin nama yang sama dan seharusnya engga usah di
  // tambahin lagi di class turunannnya kalau emang udah ada di parentnya

  @Override
  void doIt() {
    System.out.println("Do it from Child");
  }
}
