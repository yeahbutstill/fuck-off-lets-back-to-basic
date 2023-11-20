package com.zamannow.oop;

class EmployeeZamanNow {
    String name;

    EmployeeZamanNow(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ". My name is Employee " + this.name);
    }
}
