package com.dicoding.javafundamental.basic.strukturdasar.solid.menggunakan.encapsulation;

// Java program to demonstrate encapsulation
public class Encapsulate {

  // private variable declared
  // these can only be accessed by
  // public method of class
  private String geekName;
  private int geekRoll;
  private int geekAge;

  // get method for name to access
  // private variable geekName
  public String getGeekName() {
    return geekName;
  }

  // set method for name to access
  // private variable geekName
  public void setGeekName(String geekName) {
    this.geekName = geekName;
  }

  // get method for roll to access
  // private variable geekRoll
  public int getGeekRoll() {
    return geekRoll;
  }

  // set method for roll to access
  // private variable geekRoll
  public void setGeekRoll(int geekRoll) {
    this.geekRoll = geekRoll;
  }

  // get method for age to access
  // private variable geekAge
  public int getGeekAge() {
    return geekAge;
  }

  // set method for age to access
  // private variable geekAge
  public void setGeekAge(int geekAge) {
    this.geekAge = geekAge;
  }
}
