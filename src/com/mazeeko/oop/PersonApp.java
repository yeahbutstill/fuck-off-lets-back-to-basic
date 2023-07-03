package com.mazeeko.oop;

public class PersonApp {
  public static void main(String[] args) {
    // object
    Person person1 = new Person(); // untuk membuat object selalu dengan kata kunci new
    person1.setFirstname("Dani");
    person1.setLastname("Setiawan");
    person1.setAge("30");
    person1.setAddress("Kemiri, Depok");

    System.out.println(person1.getFirstname());
    System.out.println(person1.getLastname());
    System.out.println(person1.getAge());
    System.out.println(person1.getAddress());
    System.out.println(person1.getCountry());
    System.out.println();

    Person person2 = new Person("Maya", "Setia", "30", "Kemiri, Depok");
    System.out.println(person2.getFirstname());
    System.out.println(person2.getLastname());
    System.out.println(person2.getAge());
    System.out.println(person2.getAddress());
    System.out.println(person2.getCountry());
    System.out.println();

    Person person3 = new Person("Winda", "30", "Depag, Citayam");
    System.out.println(person3.getFirstname());
    System.out.println(person3.getAge());
    System.out.println(person3.getAddress());
    System.out.println(person3.getCountry());
  }
}
