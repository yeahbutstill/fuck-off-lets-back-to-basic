package com.zamannow.oop;

class ManagerZamanNow {
    String name;
    String company;

    ManagerZamanNow(String name) {
        this.name = name;
    }

    ManagerZamanNow(String name, String company) {
        this.name = name;
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is Manager " + this.name);
    }
}