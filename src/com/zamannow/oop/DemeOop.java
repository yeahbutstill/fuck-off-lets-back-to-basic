package com.zamannow.oop;

public class DemeOop {
  public static void main(String[] args) {
    var person = new Person();
    person.firstName = "dnl";
    person.lastName = "yeah";
    System.out.println(person.firstName);
    System.out.println(person.lastName);
    System.out.println(person.country);

    System.out.println(person.sayHello("Dnl"));
    System.out.println(person.sayGoodBye(person.firstName));
    System.out.println();

    var car = new Car();
    // untuk manipulasi data properties, sama seperti cara pada variable
    // untuk mengakses properties, kita butuh kata kunci .(titik) setelah nama object dan diikuti nama propertiesnya
    car.name = "Avanza";
    car.brand = "Toyota";
    System.out.println(car.name);
    System.out.println(car.brand);

    car.startEngine();
    car.stopEngine();
  }
}
