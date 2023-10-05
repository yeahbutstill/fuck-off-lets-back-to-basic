package com.zamannow.oop;



public class DemeOop {
  public static void main(String[] args) {
    var person = new Person();
    person.firstName = "dnl";
    person.lastName = "yeah";
    System.out.println(person.firstName);
    System.out.println(person.lastName);
    System.out.println(person.country);

    System.out.println(person.sayHello("Maya"));
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

    System.out.println();
    System.out.println();

    var person1 = new Person("Hahah", "Hihi");
    System.out.println(person1.firstName);
    System.out.println(person1.lastName);
    System.out.println(person1.country);
    System.out.println();
    System.out.println();

    var person2 = new Person("dnf");
    System.out.println(person2.firstName);
    System.out.println(person2.lastName);
    System.out.println(person2.country);

    System.out.println();
    System.out.println();

    var person3 = new Person("hhhhahahah", "hahahahaha", "lah");
    System.out.println(person3.firstName);
    System.out.println(person3.lastName);
    System.out.println(person3.country);

    System.out.println();
    System.out.println();

    var person4 = new Person();
    person4.firstName = "lah";
    person4.lastName = "loh";
    System.out.println(person4.firstName);
    System.out.println(person4.sayHello("Dani"));
  }
}
