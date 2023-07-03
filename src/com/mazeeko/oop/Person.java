package com.mazeeko.oop;

// class
public class Person {
  // properties atau field
  private String firstname;
  private String lastname;
  private String age;
  private String address;
  private final String country = "Indonesia";

  // all argument constructor, jadi constructor itu adalah method yang akan dipanggil ketika pertama kali object dibuat
  public Person(String firstname, String lastname, String age, String address) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.age = age;
    this.address = address;
  }

  // overloading constructor
  public Person(String firstname, String age, String address) {
    this.firstname = firstname;
    this.age = age;
    this.address = address;
  }

  // default constructor
  public Person() {}

  // method
  public String getCountry() {
    return country;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
