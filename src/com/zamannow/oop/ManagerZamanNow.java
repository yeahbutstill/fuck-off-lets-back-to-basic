package com.zamannow.oop;

class ManagerZamanNow extends EmployeeZamanNow {
    String company;

    ManagerZamanNow(String name) {
        super(name);
    }

    ManagerZamanNow(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is Manager " + this.name);
    }
}