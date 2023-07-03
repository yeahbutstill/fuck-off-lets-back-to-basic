package com.mazeeko.dasar;

public class VariableShadowing {

  private String firstname;
  private String lastname;
  private String age;
  private String address;
  private final String country = "Indonesia";

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

  public String getCountry() {
    return country;
  }

  public VariableShadowing(String firstname, String lastname, String age, String address) {
    firstname = firstname; // field firstname tidak berubah
    lastname = lastname; // field lastname tidak berubah
    age = age; // field age tidak berubah
    address = address; // field address tidak berubah
  }

  public void sayHello(String firstname) {
    System.out.println(
        "Hello " + firstname + ", My name is " + firstname); // field firstname tidak diakses
  }
}
